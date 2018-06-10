package com.zhyyu.learn.jvm;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * -XX:PermSize=10m -XX:MaxPermSize=10m
 * @author zhongyuyu
 *
 * 未测试出结果
 */
public class MethodAreaOOM {

	public static void main(String[] args) {
		
		List<Object> objList = new ArrayList<>();
		while (true) {
			Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(MethodAreaOOM.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
				@Override
				public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
					return proxy.invoke(obj, args);
				}
			});
            Object object = enhancer.create();
            objList.add(object);
		}
		
	}
	
}
