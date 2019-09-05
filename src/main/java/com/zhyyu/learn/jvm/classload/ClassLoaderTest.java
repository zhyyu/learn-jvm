package com.zhyyu.learn.jvm.classload;

/**
 * bootstrap
 * ext
 * app
 *
 * <pre>
 *     启动boot 项目, classLoader 测试:
 *     demo code: (from learn-springboot project
 *     @SpringBootApplication
 * public class LearnSpringbootApplication {
 *
 *     public static void main(String[] args) {
 *         SpringApplication.run(LearnSpringbootApplication.class, args);
 *         System.out.println("==========classloader==========" + LearnSpringbootApplication.class.getClassLoader());
 *         System.out.println("==========classloader==========" + HandlerInterceptor.class.getClassLoader());
 *         System.out.println("==========classloader==========" + CORSHandlerInterceptor.class.getClassLoader());
 *         System.out.println("==========classloader==========" + String.class.getClassLoader());
 *     }
 *
 * }
 *
 * 		若ide 启动项目, 则
 *
==========classloader==========sun.misc.Launcher$AppClassLoader@18b4aac2
==========classloader==========sun.misc.Launcher$AppClassLoader@18b4aac2
==========classloader==========sun.misc.Launcher$AppClassLoader@18b4aac2
==========classloader==========null

	ide 直接运行main 程序, 故app 类加载器

		若 java -jar 启动项目, 则
 *==========classloader==========org.springframework.boot.loader.LaunchedURLClassLoader@439f5b3d
 * ==========classloader==========org.springframework.boot.loader.LaunchedURLClassLoader@439f5b3d
 * ==========classloader==========org.springframework.boot.loader.LaunchedURLClassLoader@439f5b3d
 * ==========classloader==========null
 *
 *  可分析 springboot jar 包, 使用自定义类加载器加载, java -jar 直接运行 JarLauncher.class, 然后再自定义 LaunchedURLClassLoader 去加载springboot main 函数
 *
 *
 *
 * </pre>
 *
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
