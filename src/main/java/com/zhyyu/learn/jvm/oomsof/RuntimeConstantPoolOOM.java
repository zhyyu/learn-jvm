package com.zhyyu.learn.jvm.oomsof;

import java.util.ArrayList;
import java.util.List;

/**
 * -XX:PermSize=10m -XX:MaxPermSize=10m
 * 运行时常量池属于方法区
 * @author zhongyuyu
 * 
 * jkd1.8 无oom
 * 
 * <pre>
 * <jdk1.7 hotspot: 字符串常量池放在永久代(会oom)
 * 
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
