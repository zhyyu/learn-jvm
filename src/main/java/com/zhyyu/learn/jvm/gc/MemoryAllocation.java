package com.zhyyu.learn.jvm.gc;

/**
 * -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
 * @author zhongyuyu
 *
 */
public class MemoryAllocation {

	public static void main(String[] args) {
		int _1mb = 1024 * 1024;
		
		byte[] byteAry1, byteAry2, byteAry3, byteAry4;
		byteAry1 = new byte[2 * _1mb];
		byteAry2 = new byte[2 * _1mb];
		byteAry3 = new byte[2 * _1mb];
		byteAry4 = new byte[4 * _1mb];
		
		while(true);
	}
	
}

/**
 * 
with while(true)
[GC (Allocation Failure) [DefNew: 7128K->534K(9216K), 0.0060915 secs] 7128K->6678K(19456K), 0.0068016 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]

without while(true)
[GC (Allocation Failure) [DefNew: 7128K->534K(9216K), 0.0069579 secs] 7128K->6678K(19456K), 0.0070451 secs] [Times: user=0.00 sys=0.02, real=0.01 secs] 
Heap
 def new generation   total 9216K, used 4712K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
  eden space 8192K,  51% used [0x00000000fec00000, 0x00000000ff014930, 0x00000000ff400000)
  from space 1024K,  52% used [0x00000000ff500000, 0x00000000ff5858b0, 0x00000000ff600000)
  to   space 1024K,   0% used [0x00000000ff400000, 0x00000000ff400000, 0x00000000ff500000)
 tenured generation   total 10240K, used 6144K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
   the space 10240K,  60% used [0x00000000ff600000, 0x00000000ffc00030, 0x00000000ffc00200, 0x0000000100000000)
 Metaspace       used 2652K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 286K, capacity 386K, committed 512K, reserved 1048576K







堆 (-Xms20m -Xmx20m
new generation (新生代-Xmn10m
	- eden
	- survival
tenured generation (老年代

方法区
PermGen (永久代
*/
