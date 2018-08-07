package com.zhyyu.learn.jvm.classstructure;

import java.util.concurrent.CountDownLatch;

/**
 * 测试静态初始化方法是否线程安全
 * <br>
 * OUTPUT:
 * mytask2 try instance my class
mytask1 try instance my class
my class loading

CON:
测试静态初始化方法线程安全, JVM 自动加锁
 * @author Administrator
 *
 */
public class StaticInitializerSynchronizeTest {

	public static void main(String[] args) {
		CountDownLatch startLatch = new CountDownLatch(1);
		new Thread(new MyTask1(startLatch)).start();
		new Thread(new MyTask2(startLatch)).start();
		
		startLatch.countDown();
	}
	
	public static class MyTask1 implements Runnable {
		
		private CountDownLatch startLatch;
		
		public MyTask1(CountDownLatch startLatch) {
			this.startLatch = startLatch;
		}
		
		@Override
		public void run() {
			try {
				startLatch.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("mytask1 try instance my class");
			MyClass myClass = new MyClass();
			System.out.println("mytask1 instanced my class");
		}
	}
	
	public static class MyTask2 implements Runnable {
		
		private CountDownLatch startLatch;
		
		public MyTask2(CountDownLatch startLatch) {
			this.startLatch = startLatch;
		}
		
		@Override
		public void run() {
			try {
				startLatch.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("mytask2 try instance my class");
			MyClass myClass = new MyClass();
			System.out.println("mytask2 instanced my class");
		}
	}
	
	public static class MyClass {
		static {
			System.out.println("my class loading");
			if (true) {
				while (true) {
				}
			}
			System.out.println("my class loaded");
		}
	}
	
}
