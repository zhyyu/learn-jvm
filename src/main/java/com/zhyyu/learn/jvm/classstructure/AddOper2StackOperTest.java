package com.zhyyu.learn.jvm.classstructure;

/**
 * 测试add 操作在jvm 运行时栈帧操作
 * @author Administrator
 *
 */
public class AddOper2StackOperTest {

	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		int k = 3;
		
		int sum = i + j + k;
		System.out.println(sum);
	}
	
}

//F:\workspace-zhyyu-learn\learn-jvm\target\classes\com\zhyyu\learn\jvm\classstructure>javap -p -v AddOper2StackOperTest.class
//Classfile /F:/workspace-zhyyu-learn/learn-jvm/target/classes/com/zhyyu/learn/jvm/classstructure/AddOper2StackOperTest.class
//  Last modified 2018-7-18; size 693 bytes
//  MD5 checksum ba19cc26b939b4ace872bf5d4709ba11
//  Compiled from "AddOper2StackOperTest.java"
//public class com.zhyyu.learn.jvm.classstructure.AddOper2StackOperTest
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Class              #2             // com/zhyyu/learn/jvm/classstructure/AddOper2StackOperTest
//   #2 = Utf8               com/zhyyu/learn/jvm/classstructure/AddOper2StackOperTest
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
//  #13 = Utf8               Lcom/zhyyu/learn/jvm/classstructure/AddOper2StackOperTest;
//  #14 = Utf8               main
//  #15 = Utf8               ([Ljava/lang/String;)V
//  #16 = Fieldref           #17.#19        // java/lang/System.out:Ljava/io/PrintStream;
//  #17 = Class              #18            // java/lang/System
//  #18 = Utf8               java/lang/System
//  #19 = NameAndType        #20:#21        // out:Ljava/io/PrintStream;
//  #20 = Utf8               out
//  #21 = Utf8               Ljava/io/PrintStream;
//  #22 = Methodref          #23.#25        // java/io/PrintStream.println:(I)V
//  #23 = Class              #24            // java/io/PrintStream
//  #24 = Utf8               java/io/PrintStream
//  #25 = NameAndType        #26:#27        // println:(I)V
//  #26 = Utf8               println
//  #27 = Utf8               (I)V
//  #28 = Utf8               args
//  #29 = Utf8               [Ljava/lang/String;
//  #30 = Utf8               i
//  #31 = Utf8               I
//  #32 = Utf8               j
//  #33 = Utf8               k
//  #34 = Utf8               sum
//  #35 = Utf8               SourceFile
//  #36 = Utf8               AddOper2StackOperTest.java
//{
//  public com.zhyyu.learn.jvm.classstructure.AddOper2StackOperTest();
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
//            0       5     0  this   Lcom/zhyyu/learn/jvm/classstructure/AddOper2StackOperTest;
//
//  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=2, locals=5, args_size=1
//         0: iconst_1
//         1: istore_1
//         2: iconst_2
//         3: istore_2
//         4: iconst_3
//         5: istore_3
//         6: iload_1
//         7: iload_2
//         8: iadd
//         9: iload_3
//        10: iadd
//        11: istore        4
//        13: getstatic     #16                 // Field java/lang/System.out:Ljava/io/PrintStream;
//        16: iload         4
//        18: invokevirtual #22                 // Method java/io/PrintStream.println:(I)V
//        21: return
//      LineNumberTable:
//        line 11: 0
//        line 12: 2
//        line 13: 4
//        line 15: 6
//        line 16: 13
//        line 17: 21
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      22     0  args   [Ljava/lang/String;
//            2      20     1     i   I
//            4      18     2     j   I
//            6      16     3     k   I
//           13       9     4   sum   I
//}
//SourceFile: "AddOper2StackOperTest.java"