package com.zhyyu.learn.jvm.gc;

/**
 * -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC -XX:PretenureSizeThreshold=3145728
 * @author zhongyuyu
 *
 */
public class MemoryAllocationPretenureSizeThreshold {

	public static void main(String[] args) {
		int _1mb = 1024 * 1024;
		
		byte[] byteAry1, byteAry2, byteAry3, byteAry4;
		byteAry1 = new byte[2 * _1mb];
		byteAry2 = new byte[2 * _1mb];
		byteAry3 = new byte[2 * _1mb];
		byteAry4 = new byte[4 * _1mb];
		
		// while(true);
	}
	
}

/**
Heap
def new generation   total 9216K, used 7293K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
 eden space 8192K,  89% used [0x00000000fec00000, 0x00000000ff31f450, 0x00000000ff400000)
 from space 1024K,   0% used [0x00000000ff400000, 0x00000000ff400000, 0x00000000ff500000)
 to   space 1024K,   0% used [0x00000000ff500000, 0x00000000ff500000, 0x00000000ff600000)
tenured generation   total 10240K, used 4096K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
  the space 10240K,  40% used [0x00000000ff600000, 0x00000000ffa00010, 0x00000000ffa00200, 0x0000000100000000)
Metaspace       used 2652K, capacity 4486K, committed 4864K, reserved 1056768K
 class space    used 286K, capacity 386K, committed 512K, reserved 1048576K
*/