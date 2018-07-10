package com.zhyyu.learn.jvm.compile;

/**
 * inner class suger test
 * @author zhyyu
 *
 */
public class InnerClassSugerTest {

	public static void main(String[] args) {
		System.out.println("main method");
	}
	
	public static class InnerClass {
		
		public void methodInInnerClass() {
			System.out.println("inner class method");
		}
		
	}
	
	public class InnerClass2 {
		
		public void methodInInnerClass2() {
			System.out.println("inner class method2");
		}
		
	}
	
}

//package com.zhyyu.learn.jvm.compile;
//
//import java.io.PrintStream;
//
//public class InnerClassSugerTest
//{
//  public static void main(String[] args)
//  {
//    System.out.println("main method");
//  }
//  
//  public static class InnerClass
//  {
//    public void methodInInnerClass()
//    {
//      System.out.println("inner class method");
//    }
//  }
//  
//  public class InnerClass2
//  {
//    public InnerClass2() {}
//    
//    public void methodInInnerClass2()
//    {
//      System.out.println("inner class method2");
//    }
//  }
//}




//PS C:\Users\zhyyu\Desktop\workspace-zhyyu-learn\learn-jvm\target\classes\com\zhyyu\learn\jvm\compile> javap -p -v '.\InnerClassSugerTest.class'
//Classfile /C:/Users/zhyyu/Desktop/workspace-zhyyu-learn/learn-jvm/target/classes/com/zhyyu/learn/jvm/compile/InnerClassSugerTest.class
//  Last modified 2018-7-10; size 811 bytes
//  MD5 checksum f85f3a98ce607739a82d31f866470e14
//  Compiled from "InnerClassSugerTest.java"
//public class com.zhyyu.learn.jvm.compile.InnerClassSugerTest
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Class              #2             // com/zhyyu/learn/jvm/compile/InnerClassSugerTest
//   #2 = Utf8               com/zhyyu/learn/jvm/compile/InnerClassSugerTest
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
//  #13 = Utf8               Lcom/zhyyu/learn/jvm/compile/InnerClassSugerTest;
//  #14 = Utf8               main
//  #15 = Utf8               ([Ljava/lang/String;)V
//  #16 = Fieldref           #17.#19        // java/lang/System.out:Ljava/io/PrintStream;
//  #17 = Class              #18            // java/lang/System
//  #18 = Utf8               java/lang/System
//  #19 = NameAndType        #20:#21        // out:Ljava/io/PrintStream;
//  #20 = Utf8               out
//  #21 = Utf8               Ljava/io/PrintStream;
//  #22 = String             #23            // main method
//  #23 = Utf8               main method
//  #24 = Methodref          #25.#27        // java/io/PrintStream.println:(Ljava/lang/String;)V
//  #25 = Class              #26            // java/io/PrintStream
//  #26 = Utf8               java/io/PrintStream
//  #27 = NameAndType        #28:#29        // println:(Ljava/lang/String;)V
//  #28 = Utf8               println
//  #29 = Utf8               (Ljava/lang/String;)V
//  #30 = Utf8               args
//  #31 = Utf8               [Ljava/lang/String;
//  #32 = Utf8               SourceFile
//  #33 = Utf8               InnerClassSugerTest.java
//  #34 = Utf8               InnerClasses
//  #35 = Class              #36            // com/zhyyu/learn/jvm/compile/InnerClassSugerTest$InnerClass
//  #36 = Utf8               com/zhyyu/learn/jvm/compile/InnerClassSugerTest$InnerClass
//  #37 = Utf8               InnerClass
//  #38 = Class              #39            // com/zhyyu/learn/jvm/compile/InnerClassSugerTest$InnerClass2
//  #39 = Utf8               com/zhyyu/learn/jvm/compile/InnerClassSugerTest$InnerClass2
//  #40 = Utf8               InnerClass2
//{
//  public com.zhyyu.learn.jvm.compile.InnerClassSugerTest();
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
//            0       5     0  this   Lcom/zhyyu/learn/jvm/compile/InnerClassSugerTest;
//
//  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=2, locals=1, args_size=1
//         0: getstatic     #16                 // Field java/lang/System.out:Ljava/io/PrintStream;
//         3: ldc           #22                 // String main method
//         5: invokevirtual #24                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//         8: return
//      LineNumberTable:
//        line 11: 0
//        line 12: 8
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       9     0  args   [Ljava/lang/String;
//}
//SourceFile: "InnerClassSugerTest.java"
//InnerClasses:
//     public static #37= #35 of #1; //InnerClass=class com/zhyyu/learn/jvm/compile/InnerClassSugerTest$InnerClass of class com/zhyyu/learn/jvm/compile/InnerClassSugerTest
//     public #40= #38 of #1; //InnerClass2=class com/zhyyu/learn/jvm/compile/InnerClassSugerTest$InnerClass2 of class com/zhyyu/learn/jvm/compile/InnerClassSugerTest