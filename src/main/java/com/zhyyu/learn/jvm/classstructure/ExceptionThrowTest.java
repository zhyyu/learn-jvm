package com.zhyyu.learn.jvm.classstructure;

/**
 * 测试异常字节码文件格式， 异常相关Exception table
 * @author zhyyu
 *
 */
public class ExceptionThrowTest {

	public static void main(String[] args) {
		try {
			hello();
		} catch (Exception e) {
			System.out.println("exception");
		}
	}
	
	private static void hello() {
		System.out.println("hello world");
	}
	
}

//PS C:\Users\zhyyu\Desktop\workspace-zhyyu-learn\learn-jvm\target\classes\com\zhyyu\learn\jvm\classstructure> javap -verbose .\ExceptionThrowTest.class
//Classfile /C:/Users/zhyyu/Desktop/workspace-zhyyu-learn/learn-jvm/target/classes/com/zhyyu/learn/jvm/classstructure/ExceptionThrowTest.class
//  Last modified 2018-7-9; size 834 bytes
//  MD5 checksum 6a4b18edc6eecd393b3929b7e05a45ed
//  Compiled from "ExceptionThrowTest.java"
//public class com.zhyyu.learn.jvm.classstructure.ExceptionThrowTest
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Class              #2             // com/zhyyu/learn/jvm/classstructure/ExceptionThrowTest
//   #2 = Utf8               com/zhyyu/learn/jvm/classstructure/ExceptionThrowTest
//   #3 = Class              #4             // java/lang/Object
//   #4 = Utf8               java/lang/Object
//   #5 = Utf8               <init>
//   #6 = Utf8               ()V
//   #7 = Utf8               Code
//   #8 = Methodref          #3.#9          // java/lang/Object."<init>":()V
//   #9 = NameAndType        #5:#6          // "<init>":()V
//  #10 = Utf8               LineNumberTable
//  #11 = Utf8               LocalVariableTable
//  #12 = Utf8               this
//  #13 = Utf8               Lcom/zhyyu/learn/jvm/classstructure/ExceptionThrowTest;
//  #14 = Utf8               main
//  #15 = Utf8               ([Ljava/lang/String;)V
//  #16 = Methodref          #1.#17         // com/zhyyu/learn/jvm/classstructure/ExceptionThrowTest.hello:()V
//  #17 = NameAndType        #18:#6         // hello:()V
//  #18 = Utf8               hello
//  #19 = Fieldref           #20.#22        // java/lang/System.out:Ljava/io/PrintStream;
//  #20 = Class              #21            // java/lang/System
//  #21 = Utf8               java/lang/System
//  #22 = NameAndType        #23:#24        // out:Ljava/io/PrintStream;
//  #23 = Utf8               out
//  #24 = Utf8               Ljava/io/PrintStream;
//  #25 = String             #26            // exception
//  #26 = Utf8               exception
//  #27 = Methodref          #28.#30        // java/io/PrintStream.println:(Ljava/lang/String;)V
//  #28 = Class              #29            // java/io/PrintStream
//  #29 = Utf8               java/io/PrintStream
//  #30 = NameAndType        #31:#32        // println:(Ljava/lang/String;)V
//  #31 = Utf8               println
//  #32 = Utf8               (Ljava/lang/String;)V
//  #33 = Class              #34            // java/lang/Exception
//  #34 = Utf8               java/lang/Exception
//  #35 = Utf8               args
//  #36 = Utf8               [Ljava/lang/String;
//  #37 = Utf8               e
//  #38 = Utf8               Ljava/lang/Exception;
//  #39 = Utf8               StackMapTable
//  #40 = String             #41            // hello world
//  #41 = Utf8               hello world
//  #42 = Utf8               SourceFile
//  #43 = Utf8               ExceptionThrowTest.java
//{
//  public com.zhyyu.learn.jvm.classstructure.ExceptionThrowTest();
//    descriptor: ()V
//    flags: ACC_PUBLIC
//    Code:
//      stack=1, locals=1, args_size=1
//         0: aload_0
//         1: invokespecial #8                  // Method java/lang/Object."<init>":()V
//         4: return
//      LineNumberTable:
//        line 8: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       5     0  this   Lcom/zhyyu/learn/jvm/classstructure/ExceptionThrowTest;
//
//  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=2, locals=2, args_size=1
//         0: invokestatic  #16                 // Method hello:()V
//         3: goto          15
//         6: astore_1
//         7: getstatic     #19                 // Field java/lang/System.out:Ljava/io/PrintStream;
//        10: ldc           #25                 // String exception
//        12: invokevirtual #27                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        15: return
//      Exception table:
//         from    to  target type
//             0     3     6   Class java/lang/Exception
//      LineNumberTable:
//        line 12: 0
//        line 13: 3
//        line 14: 7
//        line 16: 15
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      16     0  args   [Ljava/lang/String;
//            7       8     1     e   Ljava/lang/Exception;
//      StackMapTable: number_of_entries = 2
//        frame_type = 70 /* same_locals_1_stack_item */
//          stack = [ class java/lang/Exception ]
//        frame_type = 8 /* same */
//}
//SourceFile: "ExceptionThrowTest.java"