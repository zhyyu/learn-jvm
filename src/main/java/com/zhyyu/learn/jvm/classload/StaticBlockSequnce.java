package com.zhyyu.learn.jvm.classload;

/**
 * line12:Cannot reference a field before it is defined
 * @author zhongyuyu
 *
 */
public class StaticBlockSequnce {

	static {
		i = 1;
//		System.out.println(i);
	}
	
	public static int i = 0;
	
}
