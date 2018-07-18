package com.zhyyu.learn.jvm.oomsof;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * -Xms10m -Xmx10m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=./heap_dump
 * <pre>
 * -XX:HeapDumpPath 当前目录是执行java 命令的目录
 * @author zhongyuyu
 * 
 */
public class HeapOOM {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		
		while (true) {
			Random random = new Random();
			intList.add(new Integer(random.nextInt(Integer.MAX_VALUE)));
		}
	}
	
}

/**
 * java.lang.OutOfMemoryError: Java heap space
Dumping heap to ./heap_dump ...
Unable to create ./heap_dump: File exists
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at java.util.Arrays.copyOf(Arrays.java:3210)
	at java.util.Arrays.copyOf(Arrays.java:3181)
	at java.util.ArrayList.grow(ArrayList.java:265)
	at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:239)
	at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:231)
	at java.util.ArrayList.add(ArrayList.java:462)
	at com.zhyyu.learn.jvm.oomsof.HeapOOM.main(HeapOOM.java:21)
 * 
 */

