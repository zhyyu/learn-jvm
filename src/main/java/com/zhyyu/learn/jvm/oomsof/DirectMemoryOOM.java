package com.zhyyu.learn.jvm.oomsof;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import sun.misc.Unsafe;

/**
 * -Xmx10m -Xms10m -XX:MaxDirectMemorySize=10m -XX:+HeapDumpOnOutOfMemoryError
 * @author zhongyuyu
 *
 * 不会dump heap 堆信息
 */
public class DirectMemoryOOM {

	private static final int _1MB = 1024 *1024;
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Field unsafeField = Unsafe.class.getDeclaredFields()[0];
		unsafeField.setAccessible(true);
		Unsafe unsafe = (Unsafe) unsafeField.get(null);
		while (true) {
			unsafe.allocateMemory(_1MB);
		}
		
		/*List<Integer> integerList = new ArrayList<>();
		while (true) {
			integerList.add(new Integer(1));
		}*/
		
	}
	
}

/**
 * Exception in thread "main" java.lang.OutOfMemoryError
	at sun.misc.Unsafe.allocateMemory(Native Method)
	at com.zhyyu.learn.jvm.DirectMemoryOOM.main(DirectMemoryOOM.java:21)
*/
