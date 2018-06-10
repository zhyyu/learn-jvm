package com.zhyyu.learn.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * -XX:PermSize=10m -XX:MaxPermSize=10m
 * 运行时常量池属于方法区
 * @author zhongyuyu
 * 
 * jkd1.7 无oom
 */
public class RuntimeConstantPoolOOM {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		int i = 0;
		while (true) {
			strList.add(new Integer(i++).toString().intern());
		}
	}
	
}
