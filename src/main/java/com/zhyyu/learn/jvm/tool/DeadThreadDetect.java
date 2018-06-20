package com.zhyyu.learn.jvm.tool;

/**
 * 死锁检测程序
 * @author zhongyuyu
 *
 */
public class DeadThreadDetect {

	private static final Integer LOCK_A = 1;
	private static final Integer LOCK_B = 2;
	
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Task1());
		Thread thread2 = new Thread(new Task2());
		
		thread1.start();
		thread2.start();
		
		while (true);
	}
	
	private static class Task1 implements Runnable {

		@Override
		public void run() {
			while (true) {
				synchronized (LOCK_A) {
					synchronized (LOCK_B) {
						;
					}
				}
			}
		}
		
	}
	
	private static class Task2 implements Runnable {

		@Override
		public void run() {
			while (true) {
				synchronized (LOCK_B) {
					synchronized (LOCK_A) {
						;
					}
				}
			}
		}
		
	}
	
}
