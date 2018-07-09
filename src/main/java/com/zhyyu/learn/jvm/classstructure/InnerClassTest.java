package com.zhyyu.learn.jvm.classstructure;

/**
 * 内部内class 文件不在外部内中
 * @author zhyyu
 *
 */
public class InnerClassTest {

	private class InnerClass1 {
		
	}
	
}

//PS C:\Users\zhyyu\Desktop\workspace-zhyyu-learn\learn-jvm\target\classes\com\zhyyu\learn\jvm\classstructure> javap -v -p '.\InnerClassTest.class'
//Classfile /C:/Users/zhyyu/Desktop/workspace-zhyyu-learn/learn-jvm/target/classes/com/zhyyu/learn/jvm/classstructure/InnerClassTest.class
//  Last modified 2018-7-10; size 449 bytes
//  MD5 checksum a1b4254486bb1627b3374ba8dbdbc29c
//  Compiled from "InnerClassTest.java"
//public class com.zhyyu.learn.jvm.classstructure.InnerClassTest
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Class              #2             // com/zhyyu/learn/jvm/classstructure/InnerClassTest
//   #2 = Utf8               com/zhyyu/learn/jvm/classstructure/InnerClassTest
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
//  #13 = Utf8               Lcom/zhyyu/learn/jvm/classstructure/InnerClassTest;
//  #14 = Utf8               SourceFile
//  #15 = Utf8               InnerClassTest.java
//  #16 = Utf8               InnerClasses
//  #17 = Class              #18            // com/zhyyu/learn/jvm/classstructure/InnerClassTest$InnerClass1
//  #18 = Utf8               com/zhyyu/learn/jvm/classstructure/InnerClassTest$InnerClass1
//  #19 = Utf8               InnerClass1
//{
//  public com.zhyyu.learn.jvm.classstructure.InnerClassTest();
//    descriptor: ()V
//    flags: ACC_PUBLIC
//    Code:
//      stack=1, locals=1, args_size=1
//         0: aload_0
//         1: invokespecial #8                  // Method java/lang/Object."<init>":()V
//         4: return
//      LineNumberTable:
//        line 3: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       5     0  this   Lcom/zhyyu/learn/jvm/classstructure/InnerClassTest;
//}
//SourceFile: "InnerClassTest.java"
//InnerClasses:
//     private #19= #17 of #1; //InnerClass1=class com/zhyyu/learn/jvm/classstructure/InnerClassTest$InnerClass1 of class com/zhyyu/learn/jvm/classstructure/InnerClassTest

















//PS C:\Users\zhyyu\Desktop\workspace-zhyyu-learn\learn-jvm\target\classes\com\zhyyu\learn\jvm\classstructure> javap -v -p '.\InnerClassTest$InnerClass1.class'
//Classfile /C:/Users/zhyyu/Desktop/workspace-zhyyu-learn/learn-jvm/target/classes/com/zhyyu/learn/jvm/classstructure/InnerClassTest$InnerClass1.class
//  Last modified 2018-7-10; size 604 bytes
//  MD5 checksum c25c5a816b541419b9bc66890d68526e
//  Compiled from "InnerClassTest.java"
//class com.zhyyu.learn.jvm.classstructure.InnerClassTest$InnerClass1
//  minor version: 0
//  major version: 52
//  flags: ACC_SUPER
//Constant pool:
//   #1 = Class              #2             // com/zhyyu/learn/jvm/classstructure/InnerClassTest$InnerClass1
//   #2 = Utf8               com/zhyyu/learn/jvm/classstructure/InnerClassTest$InnerClass1
//   #3 = Class              #4             // java/lang/Object
//   #4 = Utf8               java/lang/Object
//   #5 = Utf8               this$0
//   #6 = Utf8               Lcom/zhyyu/learn/jvm/classstructure/InnerClassTest;
//   #7 = Utf8               <init>
//   #8 = Utf8               (Lcom/zhyyu/learn/jvm/classstructure/InnerClassTest;)V
//   #9 = Utf8               Code
//  #10 = Fieldref           #1.#11         // com/zhyyu/learn/jvm/classstructure/InnerClassTest$InnerClass1.this$0:Lcom/zhyyu/learn/jvm/classstructure/InnerClassTest;
//  #11 = NameAndType        #5:#6          // this$0:Lcom/zhyyu/learn/jvm/classstructure/InnerClassTest;
//  #12 = Methodref          #3.#13         // java/lang/Object."<init>":()V
//  #13 = NameAndType        #7:#14         // "<init>":()V
//  #14 = Utf8               ()V
//  #15 = Utf8               LineNumberTable
//  #16 = Utf8               LocalVariableTable
//  #17 = Utf8               this
//  #18 = Utf8               Lcom/zhyyu/learn/jvm/classstructure/InnerClassTest$InnerClass1;
//  #19 = Utf8               SourceFile
//  #20 = Utf8               InnerClassTest.java
//  #21 = Utf8               InnerClasses
//  #22 = Class              #23            // com/zhyyu/learn/jvm/classstructure/InnerClassTest
//  #23 = Utf8               com/zhyyu/learn/jvm/classstructure/InnerClassTest
//  #24 = Utf8               InnerClass1
//{
//  final com.zhyyu.learn.jvm.classstructure.InnerClassTest this$0;
//    descriptor: Lcom/zhyyu/learn/jvm/classstructure/InnerClassTest;
//    flags: ACC_FINAL, ACC_SYNTHETIC
//
//  private com.zhyyu.learn.jvm.classstructure.InnerClassTest$InnerClass1(com.zhyyu.learn.jvm.classstructure.InnerClassTest);
//    descriptor: (Lcom/zhyyu/learn/jvm/classstructure/InnerClassTest;)V
//    flags: ACC_PRIVATE
//    Code:
//      stack=2, locals=2, args_size=2
//         0: aload_0
//         1: aload_1
//         2: putfield      #10                 // Field this$0:Lcom/zhyyu/learn/jvm/classstructure/InnerClassTest;
//         5: aload_0
//         6: invokespecial #12                 // Method java/lang/Object."<init>":()V
//         9: return
//      LineNumberTable:
//        line 10: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      10     0  this   Lcom/zhyyu/learn/jvm/classstructure/InnerClassTest$InnerClass1;
//}
//SourceFile: "InnerClassTest.java"
//InnerClasses:
//     private #24= #1 of #22; //InnerClass1=class com/zhyyu/learn/jvm/classstructure/InnerClassTest$InnerClass1 of class com/zhyyu/learn/jvm/classstructure/InnerClassTest