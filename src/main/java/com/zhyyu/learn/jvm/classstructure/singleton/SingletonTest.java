package com.zhyyu.learn.jvm.classstructure.singleton;

/**
 * double check singleton vs hungry singleton
 * <pre>
 * CON:
 * 如果单例工厂仅生产一个对象, 则双重加锁和饿汉式一致(碰到invokestatic 加载class)
 * 如果单例工厂生产对个对象, 双重加锁优于饿汉式(双重加锁invokestatic 后执行new 操作仅加载所需获得单例, 饿汉式invokestatic 执行clint 初始化静态代码, new 所有单例)
 * @author Administrator
 *
 */
public class SingletonTest {

	public static void main(String[] args) {
		// discomment it, either Singleton or SingletonB will be loaded
		/*if (true) {
			while (true);
		}*/
		
		System.out.println("main invoked");
		
		// discomment it, print:
		/**
		 * main invoked
singleton loaded
get single from double check: com.zhyyu.learn.jvm.classstructure.singleton.Singleton@7852e922
		 */
		/*Singleton singleton = getSingletonByDoubleCheck();
		System.out.println("get single from double check: " + singleton);*/
		
		// discommen it, print:
		/**
		 * main invoked
singleton loaded
singletonB loaded
get single from hungry: com.zhyyu.learn.jvm.classstructure.singleton.Singleton@7852e922
		 */
		Singleton singletonByHungry = getSingletonByHungry();
		System.out.println("get single from hungry: " + singletonByHungry);
	}
	
	public static Singleton getSingletonByDoubleCheck() {
		return DoubleCheckSingleton.getSingleton();
	}
	
	public static Singleton getSingletonByHungry() {
		return HungrySingleton.getSingleton();
	}
	
}
