package com.zhyyu.learn.jvm.classstructure;

/**
 * test constructor with params (invokespecial instruction)
 * @author Administrator
 *
 */
public class ConstructorWithParamsTest {

	public static void main(String[] args) {
		ConstructorWithParamsTest constructorWithParamsTest = new ConstructorWithParamsTest("value1");
		System.out.println(constructorWithParamsTest.getName1());
	}
	
	private String name1;
	
	public ConstructorWithParamsTest(String name1) {
		super();
		this.name1 = name1;
	}


	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}
	
}


//F:\workspace-zhyyu-learn\learn-jvm\target\classes\com\zhyyu\learn\jvm\classstructure>javap -p -v ConstructorWithParamsTest.class
//Classfile /F:/workspace-zhyyu-learn/learn-jvm/target/classes/com/zhyyu/learn/jvm/classstructure/ConstructorWithParamsTest.class
//  Last modified 2018-7-17; size 969 bytes
//  MD5 checksum 43a5a065cade5203056bcf6234c94077
//  Compiled from "ConstructorWithParamsTest.java"
//public class com.zhyyu.learn.jvm.classstructure.ConstructorWithParamsTest
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Class              #2             // com/zhyyu/learn/jvm/classstructure/ConstructorWithParamsTest
//   #2 = Utf8               com/zhyyu/learn/jvm/classstructure/ConstructorWithParamsTest
//   #3 = Class              #4             // java/lang/Object
//   #4 = Utf8               java/lang/Object
//   #5 = Utf8               name1
//   #6 = Utf8               Ljava/lang/String;
//   #7 = Utf8               main
//   #8 = Utf8               ([Ljava/lang/String;)V
//   #9 = Utf8               Code
//  #10 = String             #11            // value1
//  #11 = Utf8               value1
//  #12 = Methodref          #1.#13         // com/zhyyu/learn/jvm/classstructure/ConstructorWithParamsTest."<init>":(Ljava/lang/String;)V
//  #13 = NameAndType        #14:#15        // "<init>":(Ljava/lang/String;)V
//  #14 = Utf8               <init>
//  #15 = Utf8               (Ljava/lang/String;)V
//  #16 = Fieldref           #17.#19        // java/lang/System.out:Ljava/io/PrintStream;
//  #17 = Class              #18            // java/lang/System
//  #18 = Utf8               java/lang/System
//  #19 = NameAndType        #20:#21        // out:Ljava/io/PrintStream;
//  #20 = Utf8               out
//  #21 = Utf8               Ljava/io/PrintStream;
//  #22 = Methodref          #1.#23         // com/zhyyu/learn/jvm/classstructure/ConstructorWithParamsTest.getName1:()Ljava/lang/String;
//  #23 = NameAndType        #24:#25        // getName1:()Ljava/lang/String;
//  #24 = Utf8               getName1
//  #25 = Utf8               ()Ljava/lang/String;
//  #26 = Methodref          #27.#29        // java/io/PrintStream.println:(Ljava/lang/String;)V
//  #27 = Class              #28            // java/io/PrintStream
//  #28 = Utf8               java/io/PrintStream
//  #29 = NameAndType        #30:#15        // println:(Ljava/lang/String;)V
//  #30 = Utf8               println
//  #31 = Utf8               LineNumberTable
//  #32 = Utf8               LocalVariableTable
//  #33 = Utf8               args
//  #34 = Utf8               [Ljava/lang/String;
//  #35 = Utf8               constructorWithParamsTest
//  #36 = Utf8               Lcom/zhyyu/learn/jvm/classstructure/ConstructorWithParamsTest;
//  #37 = Methodref          #3.#38         // java/lang/Object."<init>":()V
//  #38 = NameAndType        #14:#39        // "<init>":()V
//  #39 = Utf8               ()V
//  #40 = Fieldref           #1.#41         // com/zhyyu/learn/jvm/classstructure/ConstructorWithParamsTest.name1:Ljava/lang/String;
//  #41 = NameAndType        #5:#6          // name1:Ljava/lang/String;
//  #42 = Utf8               this
//  #43 = Utf8               setName1
//  #44 = Utf8               SourceFile
//  #45 = Utf8               ConstructorWithParamsTest.java
//{
//  private java.lang.String name1;
//    descriptor: Ljava/lang/String;
//    flags: ACC_PRIVATE
//
//  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=3, locals=2, args_size=1
//         0: new           #1                  // class com/zhyyu/learn/jvm/classstructure/ConstructorWithParamsTest
//         3: dup
//         4: ldc           #10                 // String value1
//         6: invokespecial #12                 // Method "<init>":(Ljava/lang/String;)V
//         9: astore_1
//        10: getstatic     #16                 // Field java/lang/System.out:Ljava/io/PrintStream;
//        13: aload_1
//        14: invokevirtual #22                 // Method getName1:()Ljava/lang/String;
//        17: invokevirtual #26                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        20: return
//      LineNumberTable:
//        line 11: 0
//        line 12: 10
//        line 13: 20
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      21     0  args   [Ljava/lang/String;
//           10      11     1 constructorWithParamsTest   Lcom/zhyyu/learn/jvm/classstructure/ConstructorWithParamsTest;
//
//  public com.zhyyu.learn.jvm.classstructure.ConstructorWithParamsTest(java.lang.String);
//    descriptor: (Ljava/lang/String;)V
//    flags: ACC_PUBLIC
//    Code:
//      stack=2, locals=2, args_size=2
//         0: aload_0
//         1: invokespecial #37                 // Method java/lang/Object."<init>":()V
//         4: aload_0
//         5: aload_1
//         6: putfield      #40                 // Field name1:Ljava/lang/String;
//         9: return
//      LineNumberTable:
//        line 18: 0
//        line 19: 4
//        line 20: 9
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      10     0  this   Lcom/zhyyu/learn/jvm/classstructure/ConstructorWithParamsTest;
//            0      10     1 name1   Ljava/lang/String;
//
//  public java.lang.String getName1();
//    descriptor: ()Ljava/lang/String;
//    flags: ACC_PUBLIC
//    Code:
//      stack=1, locals=1, args_size=1
//         0: aload_0
//         1: getfield      #40                 // Field name1:Ljava/lang/String;
//         4: areturn
//      LineNumberTable:
//        line 24: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       5     0  this   Lcom/zhyyu/learn/jvm/classstructure/ConstructorWithParamsTest;
//
//  public void setName1(java.lang.String);
//    descriptor: (Ljava/lang/String;)V
//    flags: ACC_PUBLIC
//    Code:
//      stack=2, locals=2, args_size=2
//         0: aload_0
//         1: aload_1
//         2: putfield      #40                 // Field name1:Ljava/lang/String;
//         5: return
//      LineNumberTable:
//        line 28: 0
//        line 29: 5
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       6     0  this   Lcom/zhyyu/learn/jvm/classstructure/ConstructorWithParamsTest;
//            0       6     1 name1   Ljava/lang/String;
//}
//SourceFile: "ConstructorWithParamsTest.java"