package com.zhyyu.learn.jvm.classstructure;

/**
 * 结果 1, 2; 返回局部变量, 但finally 执行x=2
 * @author zhyyu
 *
 */
public class TryCatchFinallyReturnTest {

	private static int x;
	
	public static void main(String[] args) {
		int i = getInt();
		System.out.println(i);
		System.out.println(x);
	}

	private static int getInt() {
		try {
			x = 1;
			return x;
		} catch (Exception e) {
			x = 2;
			return x;
		} finally {
			x = x * 2;
		}
	}
	
}

//PS C:\Users\zhyyu\Desktop\workspace-zhyyu-learn\learn-jvm\target\classes\com\zhyyu\learn\jvm\classstructure> javap -v -p .\TryCatchFinallyReturnTest.class
//Classfile /C:/Users/zhyyu/Desktop/workspace-zhyyu-learn/learn-jvm/target/classes/com/zhyyu/learn/jvm/classstructure/TryCatchFinallyReturnTest.class
//  Last modified 2018-7-10; size 938 bytes
//  MD5 checksum 1f869f828ca24d60bbb48cd8a8499cf6
//  Compiled from "TryCatchFinallyReturnTest.java"
//public class com.zhyyu.learn.jvm.classstructure.TryCatchFinallyReturnTest
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Class              #2             // com/zhyyu/learn/jvm/classstructure/TryCatchFinallyReturnTest
//   #2 = Utf8               com/zhyyu/learn/jvm/classstructure/TryCatchFinallyReturnTest
//   #3 = Class              #4             // java/lang/Object
//   #4 = Utf8               java/lang/Object
//   #5 = Utf8               x
//   #6 = Utf8               I
//   #7 = Utf8               <init>
//   #8 = Utf8               ()V
//   #9 = Utf8               Code
//  #10 = Methodref          #3.#11         // java/lang/Object."<init>":()V
//  #11 = NameAndType        #7:#8          // "<init>":()V
//  #12 = Utf8               LineNumberTable
//  #13 = Utf8               LocalVariableTable
//  #14 = Utf8               this
//  #15 = Utf8               Lcom/zhyyu/learn/jvm/classstructure/TryCatchFinallyReturnTest;
//  #16 = Utf8               main
//  #17 = Utf8               ([Ljava/lang/String;)V
//  #18 = Methodref          #1.#19         // com/zhyyu/learn/jvm/classstructure/TryCatchFinallyReturnTest.getInt:()I
//  #19 = NameAndType        #20:#21        // getInt:()I
//  #20 = Utf8               getInt
//  #21 = Utf8               ()I
//  #22 = Fieldref           #23.#25        // java/lang/System.out:Ljava/io/PrintStream;
//  #23 = Class              #24            // java/lang/System
//  #24 = Utf8               java/lang/System
//  #25 = NameAndType        #26:#27        // out:Ljava/io/PrintStream;
//  #26 = Utf8               out
//  #27 = Utf8               Ljava/io/PrintStream;
//  #28 = Methodref          #29.#31        // java/io/PrintStream.println:(I)V
//  #29 = Class              #30            // java/io/PrintStream
//  #30 = Utf8               java/io/PrintStream
//  #31 = NameAndType        #32:#33        // println:(I)V
//  #32 = Utf8               println
//  #33 = Utf8               (I)V
//  #34 = Fieldref           #1.#35         // com/zhyyu/learn/jvm/classstructure/TryCatchFinallyReturnTest.x:I
//  #35 = NameAndType        #5:#6          // x:I
//  #36 = Utf8               args
//  #37 = Utf8               [Ljava/lang/String;
//  #38 = Utf8               i
//  #39 = Class              #40            // java/lang/Exception
//  #40 = Utf8               java/lang/Exception
//  #41 = Utf8               e
//  #42 = Utf8               Ljava/lang/Exception;
//  #43 = Utf8               StackMapTable
//  #44 = Class              #45            // java/lang/Throwable
//  #45 = Utf8               java/lang/Throwable
//  #46 = Utf8               SourceFile
//  #47 = Utf8               TryCatchFinallyReturnTest.java
//{
//  private static int x;
//    descriptor: I
//    flags: ACC_PRIVATE, ACC_STATIC
//
//  public com.zhyyu.learn.jvm.classstructure.TryCatchFinallyReturnTest();
//    descriptor: ()V
//    flags: ACC_PUBLIC
//    Code:
//      stack=1, locals=1, args_size=1
//         0: aload_0
//         1: invokespecial #10                 // Method java/lang/Object."<init>":()V
//         4: return
//      LineNumberTable:
//        line 8: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       5     0  this   Lcom/zhyyu/learn/jvm/classstructure/TryCatchFinallyReturnTest;
//
//  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=2, locals=2, args_size=1
//         0: invokestatic  #18                 // Method getInt:()I
//         3: istore_1
//         4: getstatic     #22                 // Field java/lang/System.out:Ljava/io/PrintStream;
//         7: iload_1
//         8: invokevirtual #28                 // Method java/io/PrintStream.println:(I)V
//        11: getstatic     #22                 // Field java/lang/System.out:Ljava/io/PrintStream;
//        14: getstatic     #34                 // Field x:I
//        17: invokevirtual #28                 // Method java/io/PrintStream.println:(I)V
//        20: return
//      LineNumberTable:
//        line 13: 0
//        line 14: 4
//        line 15: 11
//        line 16: 20
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      21     0  args   [Ljava/lang/String;
//            4      17     1     i   I
//
//  private static int getInt();
//    descriptor: ()I
//    flags: ACC_PRIVATE, ACC_STATIC
//    Code:
//      stack=2, locals=1, args_size=0
//         0: iconst_1
//         1: putstatic     #34                 // Field x:I
//         4: goto          16
//         7: astore_0
//         8: iconst_2
//         9: putstatic     #34                 // Field x:I
//        12: goto          16
//        15: pop
//        16: getstatic     #34                 // Field x:I
//        19: iconst_2
//        20: imul
//        21: putstatic     #34                 // Field x:I
//        24: getstatic     #34                 // Field x:I
//        27: ireturn
//      Exception table:
//         from    to  target type
//             0     7     7   Class java/lang/Exception
//             0    15    15   any
//      LineNumberTable:
//        line 20: 0
//        line 21: 4
//        line 22: 7
//        line 23: 8
//        line 24: 12
//        line 25: 15
//        line 26: 16
//        line 27: 24
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            8       7     0     e   Ljava/lang/Exception;
//      StackMapTable: number_of_entries = 3
//        frame_type = 71 /* same_locals_1_stack_item */
//          stack = [ class java/lang/Exception ]
//        frame_type = 71 /* same_locals_1_stack_item */
//          stack = [ class java/lang/Throwable ]
//        frame_type = 0 /* same */
//}
//SourceFile: "TryCatchFinallyReturnTest.java"
//PS C:\Users\zhyyu\Desktop\workspace-zhyyu-learn\learn-jvm\target\classes\com\zhyyu\learn\jvm\classstructure>