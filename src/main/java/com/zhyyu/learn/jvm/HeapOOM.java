package com.zhyyu.learn.jvm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * -Xms10m -Xmx10m -XX:+HeapDumpOnOutOfMemoryError
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
Dumping heap to java_pid5208.hprof ...
Heap dump file created [14558453 bytes in 0.105 secs]
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at java.util.Arrays.copyOf(Arrays.java:3210)
	at java.util.Arrays.copyOf(Arrays.java:3181)
	at java.util.ArrayList.grow(ArrayList.java:261)
	at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:235)
	at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:227)
	at java.util.ArrayList.add(ArrayList.java:458)
	at com.zhyyu.learn.jvm.HeapOOM.main(HeapOOM.java:19)
 * 
 */

