package com.zhyyu.learn.jvm.classstructure;

/**
 * 测试try catch finnaly 执行顺序及返回值, finnay 语句复制拼接在相应字节码后
 * @author zhyyu
 *
 */
public class TryCatchFinallyTest {
	
	private static int x;
	
	public static void main(String[] args) {
		
		try {
			x = 1;
		} catch (Exception e) {
			x = 2;
		} finally {
			x = x * 2;
		}
		
		System.out.println(x);
	}

}

//PS C:\Users\zhyyu\Desktop\workspace-zhyyu-learn\learn-jvm\target\classes\com\zhyyu\learn\jvm\classstructure> javap -verb
//ose .\TryCatchFinallyTest.class
//Classfile /C:/Users/zhyyu/Desktop/workspace-zhyyu-learn/learn-jvm/target/classes/com/zhyyu/learn/jvm/classstructure/TryCatchFinallyTest.class
//  Last modified 2018-7-10; size 835 bytes
//  MD5 checksum 800cccc59f437e747d368696133f2c14
//  Compiled from "TryCatchFinallyTest.java"
//public class com.zhyyu.learn.jvm.classstructure.TryCatchFinallyTest
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Class              #2             // com/zhyyu/learn/jvm/classstructure/TryCatchFinallyTest
//   #2 = Utf8               com/zhyyu/learn/jvm/classstructure/TryCatchFinallyTest
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
//  #15 = Utf8               Lcom/zhyyu/learn/jvm/classstructure/TryCatchFinallyTest;
//  #16 = Utf8               main
//  #17 = Utf8               ([Ljava/lang/String;)V
//  #18 = Fieldref           #1.#19         // com/zhyyu/learn/jvm/classstructure/TryCatchFinallyTest.x:I
//  #19 = NameAndType        #5:#6          // x:I
//  #20 = Fieldref           #21.#23        // java/lang/System.out:Ljava/io/PrintStream;
//  #21 = Class              #22            // java/lang/System
//  #22 = Utf8               java/lang/System
//  #23 = NameAndType        #24:#25        // out:Ljava/io/PrintStream;
//  #24 = Utf8               out
//  #25 = Utf8               Ljava/io/PrintStream;
//  #26 = Methodref          #27.#29        // java/io/PrintStream.println:(I)V
//  #27 = Class              #28            // java/io/PrintStream
//  #28 = Utf8               java/io/PrintStream
//  #29 = NameAndType        #30:#31        // println:(I)V
//  #30 = Utf8               println
//  #31 = Utf8               (I)V
//  #32 = Class              #33            // java/lang/Exception
//  #33 = Utf8               java/lang/Exception
//  #34 = Utf8               args
//  #35 = Utf8               [Ljava/lang/String;
//  #36 = Utf8               e
//  #37 = Utf8               Ljava/lang/Exception;
//  #38 = Utf8               StackMapTable
//  #39 = Class              #40            // java/lang/Throwable
//  #40 = Utf8               java/lang/Throwable
//  #41 = Utf8               SourceFile
//  #42 = Utf8               TryCatchFinallyTest.java
//{
//  public com.zhyyu.learn.jvm.classstructure.TryCatchFinallyTest();
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
//            0       5     0  this   Lcom/zhyyu/learn/jvm/classstructure/TryCatchFinallyTest;
//
//  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=2, locals=3, args_size=1
//         0: iconst_1
//         1: putstatic     #18                 // Field x:I
//         4: goto          34
//         7: astore_1
//         8: iconst_2
//         9: putstatic     #18                 // Field x:I

//=====================================
//        12: getstatic     #18                 // Field x:I
//        15: iconst_2
//        16: imul
//        17: putstatic     #18                 // Field x:I
//=====================================

//        20: goto          42
//        23: astore_2

//=====================================
//        24: getstatic     #18                 // Field x:I
//        27: iconst_2
//        28: imul
//        29: putstatic     #18                 // Field x:I
//=====================================

//        32: aload_2
//        33: athrow

//=====================================
//        34: getstatic     #18                 // Field x:I
//        37: iconst_2
//        38: imul
//        39: putstatic     #18                 // Field x:I
//=====================================

//        42: getstatic     #20                 // Field java/lang/System.out:Ljava/io/PrintStream;
//        45: getstatic     #18                 // Field x:I
//        48: invokevirtual #26                 // Method java/io/PrintStream.println:(I)V
//        51: return
//      Exception table:
//         from    to  target type
//             0     4     7   Class java/lang/Exception
//             0    12    23   any
//      LineNumberTable:
//        line 15: 0
//        line 16: 4
//        line 17: 8
//        line 19: 12
//        line 18: 23
//        line 19: 24
//        line 20: 32
//        line 19: 34
//        line 22: 42
//        line 23: 51
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      52     0  args   [Ljava/lang/String;
//            8       4     1     e   Ljava/lang/Exception;
//      StackMapTable: number_of_entries = 4
//        frame_type = 71 /* same_locals_1_stack_item */
//          stack = [ class java/lang/Exception ]
//        frame_type = 79 /* same_locals_1_stack_item */
//          stack = [ class java/lang/Throwable ]
//        frame_type = 10 /* same */
//        frame_type = 7 /* same */
//}
//SourceFile: "TryCatchFinallyTest.java"
//PS C:\Users\zhyyu\Desktop\workspace-zhyyu-learn\learn-jvm\target\classes\com\zhyyu\learn\jvm\classstructure>
