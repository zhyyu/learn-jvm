package com.zhyyu.learn.jvm.classstructure;

/**
 * 
 * @author Administrator
 *
 */
public class StaticInitializerTest {

	public static int staticint = 2;
	
	static {
		System.out.println("static block invoked");
	}
	
	public static void main(String[] args) {
		System.out.println("main invoked");
	}
	
}

//F:\workspace-zhyyu-learn\learn-jvm\target\classes\com\zhyyu\learn\jvm\classstructure>javap -p -v StaticInitializerTest.class
//Classfile /F:/workspace-zhyyu-learn/learn-jvm/target/classes/com/zhyyu/learn/jvm/classstructure/StaticInitializerTest.class
//  Last modified 2018-7-18; size 775 bytes
//  MD5 checksum 82cdc37514d822296aba06f24618ac91
//  Compiled from "StaticInitializerTest.java"
//public class com.zhyyu.learn.jvm.classstructure.StaticInitializerTest
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Class              #2             // com/zhyyu/learn/jvm/classstructure/StaticInitializerTest
//   #2 = Utf8               com/zhyyu/learn/jvm/classstructure/StaticInitializerTest
//   #3 = Class              #4             // java/lang/Object
//   #4 = Utf8               java/lang/Object
//   #5 = Utf8               staticint
//   #6 = Utf8               I
//   #7 = Utf8               <clinit>
//   #8 = Utf8               ()V
//   #9 = Utf8               Code
//  #10 = Fieldref           #1.#11         // com/zhyyu/learn/jvm/classstructure/StaticInitializerTest.staticint:I
//  #11 = NameAndType        #5:#6          // staticint:I
//  #12 = Fieldref           #13.#15        // java/lang/System.out:Ljava/io/PrintStream;
//  #13 = Class              #14            // java/lang/System
//  #14 = Utf8               java/lang/System
//  #15 = NameAndType        #16:#17        // out:Ljava/io/PrintStream;
//  #16 = Utf8               out
//  #17 = Utf8               Ljava/io/PrintStream;
//  #18 = String             #19            // static block invoked
//  #19 = Utf8               static block invoked
//  #20 = Methodref          #21.#23        // java/io/PrintStream.println:(Ljava/lang/String;)V
//  #21 = Class              #22            // java/io/PrintStream
//  #22 = Utf8               java/io/PrintStream
//  #23 = NameAndType        #24:#25        // println:(Ljava/lang/String;)V
//  #24 = Utf8               println
//  #25 = Utf8               (Ljava/lang/String;)V
//  #26 = Utf8               LineNumberTable
//  #27 = Utf8               LocalVariableTable
//  #28 = Utf8               <init>
//  #29 = Methodref          #3.#30         // java/lang/Object."<init>":()V
//  #30 = NameAndType        #28:#8         // "<init>":()V
//  #31 = Utf8               this
//  #32 = Utf8               Lcom/zhyyu/learn/jvm/classstructure/StaticInitializerTest;
//  #33 = Utf8               main
//  #34 = Utf8               ([Ljava/lang/String;)V
//  #35 = String             #36            // main invoked
//  #36 = Utf8               main invoked
//  #37 = Utf8               args
//  #38 = Utf8               [Ljava/lang/String;
//  #39 = Utf8               SourceFile
//  #40 = Utf8               StaticInitializerTest.java
//{
//  public static int staticint;
//    descriptor: I
//    flags: ACC_PUBLIC, ACC_STATIC
//
//  static {};
//    descriptor: ()V
//    flags: ACC_STATIC
//    Code:
//      stack=2, locals=0, args_size=0
//         0: iconst_2
//         1: putstatic     #10                 // Field staticint:I
//         4: getstatic     #12                 // Field java/lang/System.out:Ljava/io/PrintStream;
//         7: ldc           #18                 // String static block invoked
//         9: invokevirtual #20                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        12: return
//      LineNumberTable:
//        line 10: 0
//        line 13: 4
//        line 14: 12
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//
//  public com.zhyyu.learn.jvm.classstructure.StaticInitializerTest();
//    descriptor: ()V
//    flags: ACC_PUBLIC
//    Code:
//      stack=1, locals=1, args_size=1
//         0: aload_0
//         1: invokespecial #29                 // Method java/lang/Object."<init>":()V
//         4: return
//      LineNumberTable:
//        line 8: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       5     0  this   Lcom/zhyyu/learn/jvm/classstructure/StaticInitializerTest;
//
//  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=2, locals=1, args_size=1
//         0: getstatic     #12                 // Field java/lang/System.out:Ljava/io/PrintStream;
//         3: ldc           #35                 // String main invoked
//         5: invokevirtual #20                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//         8: return
//      LineNumberTable:
//        line 17: 0
//        line 18: 8
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       9     0  args   [Ljava/lang/String;
//}
//SourceFile: "StaticInitializerTest.java"