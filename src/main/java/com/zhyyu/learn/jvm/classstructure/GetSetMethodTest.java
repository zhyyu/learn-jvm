package com.zhyyu.learn.jvm.classstructure;

public class GetSetMethodTest {

	private static int i;
	
	public static void main(String[] args) {
		setI(3);
		int i2 = getI();
		System.out.println(i2);;
	}
	
	private static int getI() {
		return i;
	}
	
	private static void setI(int i) {
		GetSetMethodTest.i = i;
	}
	
}

//PS C:\Users\zhyyu\Desktop\workspace-zhyyu-learn\learn-jvm\target\classes\com\zhyyu\learn\jvm\classstructure> javap -p -v .\GetSetMethodTest.class
//Classfile /C:/Users/zhyyu/Desktop/workspace-zhyyu-learn/learn-jvm/target/classes/com/zhyyu/learn/jvm/classstructure/GetSetMethodTest.class
//  Last modified 2018-7-13; size 798 bytes
//  MD5 checksum 944cdc05f509af9c1ec13e44622b52e7
//  Compiled from "GetSetMethodTest.java"
//public class com.zhyyu.learn.jvm.classstructure.GetSetMethodTest
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Class              #2             // com/zhyyu/learn/jvm/classstructure/GetSetMethodTest
//   #2 = Utf8               com/zhyyu/learn/jvm/classstructure/GetSetMethodTest
//   #3 = Class              #4             // java/lang/Object
//   #4 = Utf8               java/lang/Object
//   #5 = Utf8               i
//   #6 = Utf8               I
//   #7 = Utf8               <init>
//   #8 = Utf8               ()V
//   #9 = Utf8               Code
//  #10 = Methodref          #3.#11         // java/lang/Object."<init>":()V
//  #11 = NameAndType        #7:#8          // "<init>":()V
//  #12 = Utf8               LineNumberTable
//  #13 = Utf8               LocalVariableTable
//  #14 = Utf8               this
//  #15 = Utf8               Lcom/zhyyu/learn/jvm/classstructure/GetSetMethodTest;
//  #16 = Utf8               main
//  #17 = Utf8               ([Ljava/lang/String;)V
//  #18 = Methodref          #1.#19         // com/zhyyu/learn/jvm/classstructure/GetSetMethodTest.setI:(I)V
//  #19 = NameAndType        #20:#21        // setI:(I)V
//  #20 = Utf8               setI
//  #21 = Utf8               (I)V
//  #22 = Methodref          #1.#23         // com/zhyyu/learn/jvm/classstructure/GetSetMethodTest.getI:()I
//  #23 = NameAndType        #24:#25        // getI:()I
//  #24 = Utf8               getI
//  #25 = Utf8               ()I
//  #26 = Fieldref           #27.#29        // java/lang/System.out:Ljava/io/PrintStream;
//  #27 = Class              #28            // java/lang/System
//  #28 = Utf8               java/lang/System
//  #29 = NameAndType        #30:#31        // out:Ljava/io/PrintStream;
//  #30 = Utf8               out
//  #31 = Utf8               Ljava/io/PrintStream;
//  #32 = Methodref          #33.#35        // java/io/PrintStream.println:(I)V
//  #33 = Class              #34            // java/io/PrintStream
//  #34 = Utf8               java/io/PrintStream
//  #35 = NameAndType        #36:#21        // println:(I)V
//  #36 = Utf8               println
//  #37 = Utf8               args
//  #38 = Utf8               [Ljava/lang/String;
//  #39 = Utf8               i2
//  #40 = Fieldref           #1.#41         // com/zhyyu/learn/jvm/classstructure/GetSetMethodTest.i:I
//  #41 = NameAndType        #5:#6          // i:I
//  #42 = Utf8               SourceFile
//  #43 = Utf8               GetSetMethodTest.java
//{
//  private static int i;
//    descriptor: I
//    flags: ACC_PRIVATE, ACC_STATIC
//
//  public com.zhyyu.learn.jvm.classstructure.GetSetMethodTest();
//    descriptor: ()V
//    flags: ACC_PUBLIC
//    Code:
//      stack=1, locals=1, args_size=1
//         0: aload_0
//         1: invokespecial #10                 // Method java/lang/Object."<init>":()V
//         4: return
//      LineNumberTable:
//        line 3: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       5     0  this   Lcom/zhyyu/learn/jvm/classstructure/GetSetMethodTest;
//
//  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=2, locals=2, args_size=1
//         0: iconst_3
//         1: invokestatic  #18                 // Method setI:(I)V
//         4: invokestatic  #22                 // Method getI:()I
//         7: istore_1
//         8: getstatic     #26                 // Field java/lang/System.out:Ljava/io/PrintStream;
//        11: iload_1
//        12: invokevirtual #32                 // Method java/io/PrintStream.println:(I)V
//        15: return
//      LineNumberTable:
//        line 8: 0
//        line 9: 4
//        line 10: 8
//        line 11: 15
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      16     0  args   [Ljava/lang/String;
//            8       8     1    i2   I
//
//  private static int getI();
//    descriptor: ()I
//    flags: ACC_PRIVATE, ACC_STATIC
//    Code:
//      stack=1, locals=0, args_size=0
//         0: getstatic     #40                 // Field i:I
//         3: ireturn
//      LineNumberTable:
//        line 14: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//
//  private static void setI(int);
//    descriptor: (I)V
//    flags: ACC_PRIVATE, ACC_STATIC
//    Code:
//      stack=1, locals=1, args_size=1
//         0: iload_0
//         1: putstatic     #40                 // Field i:I
//         4: return
//      LineNumberTable:
//        line 18: 0
//        line 19: 4
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       5     0     i   I
//}
//SourceFile: "GetSetMethodTest.java"