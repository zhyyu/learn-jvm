package com.zhyyu.learn.jvm.gc;

/**
 * page62
 * -XX:+PrintGCDetails
 * @author zhongyuyu
 *
 */
public class ReferenceCountingGc {

	private byte[] byteAry = new byte[1024 * 1024];
	
	private Object refObj;
	
	public static void main(String[] args) {
		ReferenceCountingGc obj1 = new ReferenceCountingGc();
		ReferenceCountingGc obj2 = new ReferenceCountingGc();
		
		obj1.refObj = obj2;
		obj2.refObj = obj1;
		
		obj1 = null;
		obj2 = null;
		
		System.gc();
		while(true);
	}
	
}

/**
[GC (System.gc()) [PSYoungGen: 4044K->616K(38400K)] 4044K->624K(125952K), 0.0012629 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
[Full GC (System.gc()) [PSYoungGen: 616K->0K(38400K)] [ParOldGen: 8K->533K(87552K)] 624K->533K(125952K), [Metaspace: 2646K->2646K(1056768K)], 0.0075158 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 

*/
