package com.zhyyu.learn.jvm.oomsof;

/**
 * -Xss128k
 * @author zhongyuyu
 *
 * windows 未测试出
 */
public class StackOOM {

	public static void main(String[] args) {
		StackOOM stackOOM = new StackOOM();
		
		long threadCount = 0;
		
		try {
			while (true) {
				Thread thread = new Thread(stackOOM.new TestTask());
				thread.start();
				threadCount++;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(threadCount);
		}
	}
	
	class TestTask implements Runnable {

		public void run() {
			while(true) {
				try {
					Thread.sleep(100L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
