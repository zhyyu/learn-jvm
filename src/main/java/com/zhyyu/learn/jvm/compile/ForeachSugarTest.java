package com.zhyyu.learn.jvm.compile;

import java.util.Arrays;
import java.util.List;

/**
 * foreach suger test //use Java Decompiler
 * @author zhyyu
 *
 */
public class ForeachSugarTest {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3);
		
		for (Integer integer : intList) {
			System.out.println(integer);
		}
	}
	
}

//package com.zhyyu.learn.jvm.compile;
//
//import java.io.PrintStream;
//import java.util.Arrays;
//import java.util.List;
//
//public class ForeachSugarTest
//{
//  public static void main(String[] args)
//  {
//    List<Integer> intList = Arrays.asList(new Integer[] { Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3) });
//    for (Integer integer : intList) {
//      System.out.println(integer);
//    }
//  }
//}
