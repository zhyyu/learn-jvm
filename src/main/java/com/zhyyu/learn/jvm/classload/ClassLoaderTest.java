package com.zhyyu.learn.jvm.classload;

/**
 * bootstrap
 * ext
 * app
 * 
 * @author Administrator
 *
 */
public class ClassLoaderTest {

	public static void main(String[] args) {
		// app classloader
		System.out.println(ClassLoaderTest.class.getClassLoader());
		
		// rt.jar bootstarp classloader
		System.out.println(Object.class.getClassLoader());
		System.out.println(String.class.getClassLoader());
		System.out.println(Integer.class.getClassLoader());
	}
	
}
