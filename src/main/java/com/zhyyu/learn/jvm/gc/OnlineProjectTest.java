package com.zhyyu.learn.jvm.gc;

/**
 * 测试线上jvm 配置, 固定eden survivor 比例
 * 
-Dcom.sun.management.jmxremote 
-Dcom.sun.management.jmxremote.ssl=false 
-Dcom.sun.management.jmxremote.authenticate=false 
-Dsun.net.inetaddr.ttl=3 
-Dsun.net.inetaddr.negative.ttl=0 
-Dspring.profiles.active=runtask 
-Xms6000m 
-Xmx6000m 
-Xmn3000m 
-XX:PermSize=512m 
-XX:MaxPermSize=512m 
-Djsse.enableSNIExtension=false 
-Djava.awt.headless=true 
 * @author Administrator
 *
 */
public class OnlineProjectTest {

	// conclusion:
	/**
	 * get fixed eden survivor ratio, set options:
		-XX:SurvivorRatio=8
		-XX:-UseAdaptiveSizePolicy 
	 */
	public static void main(String[] args) {
		while (true);
	}
	
}
