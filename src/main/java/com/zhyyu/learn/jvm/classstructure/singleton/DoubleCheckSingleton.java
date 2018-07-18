package com.zhyyu.learn.jvm.classstructure.singleton;

public class DoubleCheckSingleton {

	private static volatile Singleton singleton;
	private static volatile SingletonB singletonB;
	
	private DoubleCheckSingleton() {
	}

	public static Singleton getSingleton() {
		if (singleton == null) {
			synchronized (DoubleCheckSingleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
	
	public static SingletonB getSingletonB() {
		if (singletonB == null) {
			synchronized (DoubleCheckSingleton.class) {
				if (singletonB == null) {
					singletonB = new SingletonB();
				}
			}
		}
		return singletonB;
	}
	
}
