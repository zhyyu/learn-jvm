package com.zhyyu.learn.jvm.classstructure.singleton;

public class HungrySingleton {

	private static Singleton singleton = new Singleton();
	private static SingletonB singletonB = new SingletonB();
	
	private HungrySingleton() {
		
	}
	
	public static Singleton getSingleton() {
		return singleton;
	}
	
	public static SingletonB getSingletonB() {
		return singletonB;
	}
	
}
