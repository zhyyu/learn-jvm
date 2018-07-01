package com.zhyyu.learn.jvm.classload;

import java.io.IOException;
import java.io.InputStream;

/**
 * 验证类加载器
 * 1. getClass().getResource()
		System.out.println(CustomizeClassLoader.class.getResource("/"));
 * 	带"/" 前缀, 为classpath 路径下搜索	file:/D:/workspace/workspace-zhyyu-learn/learn-jvm/target/classes/
 * 
 * 		System.out.println(CustomizeClassLoader.class.getResource(""));
 *  不带前对, 在当前.class 路径下搜索		file:/D:/workspace/workspace-zhyyu-learn/learn-jvm/target/classes/com/zhyyu/learn/jvm/classload/
 *  
 * 2. ClassLoader.getResource()
 * 	必须带"/"前缀
 * 		System.out.println(ClassLoader.getSystemResource(""));
		null
		
		System.out.println(ClassLoader.getSystemResource("/"));
 * file:/D:/workspace/workspace-zhyyu-learn/learn-jvm/target/classes/
 * 
 * 3. 加载子类必须先加载父类
 * 
 * 4. 子定义类加载器加载出的类 和 系统自定义加载器加载类不一致
 * @author zhongyuyu
 *
 */
public class CustomizeClassLoader {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		ClassLoader myClassLoader = new ClassLoader() {
			
			@Override
			public Class<?> loadClass(String name) throws ClassNotFoundException {
				try {
					// System.out.println(name);
					String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
					
					// System.out.println(fileName);
					InputStream inputStream = getClass().getResourceAsStream(fileName);
					
					// 加载父类 java.lang.Object
					if (inputStream == null) {
						return super.loadClass(name);
					}
					
					byte[] classByteArr = new byte[inputStream.available()];
					inputStream.read(classByteArr);
					return defineClass(name, classByteArr, 0, classByteArr.length);
				} catch (IOException e) {
					e.printStackTrace();
					throw new ClassNotFoundException(name);
				}
				
			}
			
		};
		
		Class<?> classFromMyLoader = myClassLoader.loadClass("com.zhyyu.learn.jvm.classload.CustomizeClassLoader");
		System.out.println(classFromMyLoader);
		
		System.out.println(CustomizeClassLoader.class);
		
		Object object = classFromMyLoader.newInstance();
		System.out.println(object instanceof CustomizeClassLoader);
		
		System.out.println(CustomizeClassLoader.class.getClassLoader());
		
		System.out.println(CustomizeClassLoader.class.getResource(""));
		System.out.println(CustomizeClassLoader.class.getResource("/"));
		System.out.println(ClassLoader.getSystemResource(""));
		System.out.println(ClassLoader.getSystemResource("/"));
	}
	
}
