package com.zhyyu.learn.jvm.compile;

/**
 * java 假泛型测试
 * @author Administrator
 *
 */
public class GenericTest {

	public static void main(String[] args) {
		ClassA classA = new ClassA();
		ClassA classAByGeneric = getClassByGeneric(classA);
		ClassA classAByNoGeneric = getClassByNoGeneric(classA);
		
		if (classAByGeneric == classAByNoGeneric) {
			System.out.println("equal");
		}
		
		System.out.println(classAByGeneric);
	}
	
	public static <T> T getClassByGeneric(T t) {
		return t;
	}
	
	public static ClassA getClassByNoGeneric(ClassA classA) {
		return classA;
	}
	
	static class ClassA {
		
	}
	
}

//F:\workspace-zhyyu-learn\learn-jvm\target\classes\com\zhyyu\learn\jvm\compile>javap -p -v GenericTest.class
//Classfile /F:/workspace-zhyyu-learn/learn-jvm/target/classes/com/zhyyu/learn/jvm/compile/GenericTest.class
//  Last modified 2018-7-18; size 1381 bytes
//  MD5 checksum 6c344f018a319c77629af712f8a300aa
//  Compiled from "GenericTest.java"
//public class com.zhyyu.learn.jvm.compile.GenericTest
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Class              #2             // com/zhyyu/learn/jvm/compile/GenericTest
//   #2 = Utf8               com/zhyyu/learn/jvm/compile/GenericTest
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
//  #13 = Utf8               Lcom/zhyyu/learn/jvm/compile/GenericTest;
//  #14 = Utf8               main
//  #15 = Utf8               ([Ljava/lang/String;)V
//  #16 = Class              #17            // com/zhyyu/learn/jvm/compile/GenericTest$ClassA
//  #17 = Utf8               com/zhyyu/learn/jvm/compile/GenericTest$ClassA
//  #18 = Methodref          #16.#9         // com/zhyyu/learn/jvm/compile/GenericTest$ClassA."<init>":()V
//  #19 = Methodref          #1.#20         // com/zhyyu/learn/jvm/compile/GenericTest.getClassByGeneric:(Ljava/lang/Object;)Ljava/lang/Object;
//  #20 = NameAndType        #21:#22        // getClassByGeneric:(Ljava/lang/Object;)Ljava/lang/Object;
//  #21 = Utf8               getClassByGeneric
//  #22 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
//  #23 = Methodref          #1.#24         // com/zhyyu/learn/jvm/compile/GenericTest.getClassByNoGeneric:(Lcom/zhyyu/learn/jvm/compile/GenericTest$Cla
//ssA;)Lcom/zhyyu/learn/jvm/compile/GenericTest$ClassA;
//  #24 = NameAndType        #25:#26        // getClassByNoGeneric:(Lcom/zhyyu/learn/jvm/compile/GenericTest$ClassA;)Lcom/zhyyu/learn/jvm/compile/Generi
//cTest$ClassA;
//  #25 = Utf8               getClassByNoGeneric
//  #26 = Utf8               (Lcom/zhyyu/learn/jvm/compile/GenericTest$ClassA;)Lcom/zhyyu/learn/jvm/compile/GenericTest$ClassA;
//  #27 = Fieldref           #28.#30        // java/lang/System.out:Ljava/io/PrintStream;
//  #28 = Class              #29            // java/lang/System
//  #29 = Utf8               java/lang/System
//  #30 = NameAndType        #31:#32        // out:Ljava/io/PrintStream;
//  #31 = Utf8               out
//  #32 = Utf8               Ljava/io/PrintStream;
//  #33 = String             #34            // equal
//  #34 = Utf8               equal
//  #35 = Methodref          #36.#38        // java/io/PrintStream.println:(Ljava/lang/String;)V
//  #36 = Class              #37            // java/io/PrintStream
//  #37 = Utf8               java/io/PrintStream
//  #38 = NameAndType        #39:#40        // println:(Ljava/lang/String;)V
//  #39 = Utf8               println
//  #40 = Utf8               (Ljava/lang/String;)V
//  #41 = Methodref          #36.#42        // java/io/PrintStream.println:(Ljava/lang/Object;)V
//  #42 = NameAndType        #39:#43        // println:(Ljava/lang/Object;)V
//  #43 = Utf8               (Ljava/lang/Object;)V
//  #44 = Utf8               args
//  #45 = Utf8               [Ljava/lang/String;
//  #46 = Utf8               classA
//  #47 = Utf8               Lcom/zhyyu/learn/jvm/compile/GenericTest$ClassA;
//  #48 = Utf8               classAByGeneric
//  #49 = Utf8               classAByNoGeneric
//  #50 = Utf8               StackMapTable
//  #51 = Utf8               Signature
//  #52 = Utf8               <T:Ljava/lang/Object;>(TT;)TT;
//  #53 = Utf8               t
//  #54 = Utf8               Ljava/lang/Object;
//  #55 = Utf8               LocalVariableTypeTable
//  #56 = Utf8               TT;
//  #57 = Utf8               SourceFile
//  #58 = Utf8               GenericTest.java
//  #59 = Utf8               InnerClasses
//  #60 = Utf8               ClassA
//{
//  public com.zhyyu.learn.jvm.compile.GenericTest();
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
//            0       5     0  this   Lcom/zhyyu/learn/jvm/compile/GenericTest;
//
//  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=2, locals=4, args_size=1
//         0: new           #16                 // class com/zhyyu/learn/jvm/compile/GenericTest$ClassA
//         3: dup
//         4: invokespecial #18                 // Method com/zhyyu/learn/jvm/compile/GenericTest$ClassA."<init>":()V
//         7: astore_1
//         8: aload_1
//         9: invokestatic  #19                 // Method getClassByGeneric:(Ljava/lang/Object;)Ljava/lang/Object;
//        12: checkcast     #16                 // class com/zhyyu/learn/jvm/compile/GenericTest$ClassA
//        15: astore_2
//        16: aload_1
//        17: invokestatic  #23                 // Method getClassByNoGeneric:(Lcom/zhyyu/learn/jvm/compile/GenericTest$ClassA;)Lcom/zhyyu/learn/jvm/com
//pile/GenericTest$ClassA;
//        20: astore_3
//        21: aload_2
//        22: aload_3
//        23: if_acmpne     34
//        26: getstatic     #27                 // Field java/lang/System.out:Ljava/io/PrintStream;
//        29: ldc           #33                 // String equal
//        31: invokevirtual #35                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        34: getstatic     #27                 // Field java/lang/System.out:Ljava/io/PrintStream;
//        37: aload_2
//        38: invokevirtual #41                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
//        41: return
//      LineNumberTable:
//        line 6: 0
//        line 7: 8
//        line 8: 16
//        line 10: 21
//        line 11: 26
//        line 14: 34
//        line 15: 41
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      42     0  args   [Ljava/lang/String;
//            8      34     1 classA   Lcom/zhyyu/learn/jvm/compile/GenericTest$ClassA;
//           16      26     2 classAByGeneric   Lcom/zhyyu/learn/jvm/compile/GenericTest$ClassA;
//           21      21     3 classAByNoGeneric   Lcom/zhyyu/learn/jvm/compile/GenericTest$ClassA;
//      StackMapTable: number_of_entries = 1
//        frame_type = 254 /* append */
//          offset_delta = 34
//          locals = [ class com/zhyyu/learn/jvm/compile/GenericTest$ClassA, class com/zhyyu/learn/jvm/compile/GenericTest$ClassA, class com/zhyyu/learn
///jvm/compile/GenericTest$ClassA ]
//
//  public static <T extends java.lang.Object> T getClassByGeneric(T);
//    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
//    flags: ACC_PUBLIC, ACC_STATIC
//    Signature: #52                          // <T:Ljava/lang/Object;>(TT;)TT;
//    Code:
//      stack=1, locals=1, args_size=1
//         0: aload_0
//         1: areturn
//      LineNumberTable:
//        line 18: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       2     0     t   Ljava/lang/Object;
//      LocalVariableTypeTable:
//        Start  Length  Slot  Name   Signature
//            0       2     0     t   TT;
//
//  public static com.zhyyu.learn.jvm.compile.GenericTest$ClassA getClassByNoGeneric(com.zhyyu.learn.jvm.compile.GenericTest$ClassA);
//    descriptor: (Lcom/zhyyu/learn/jvm/compile/GenericTest$ClassA;)Lcom/zhyyu/learn/jvm/compile/GenericTest$ClassA;
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=1, locals=1, args_size=1
//         0: aload_0
//         1: areturn
//      LineNumberTable:
//        line 22: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       2     0 classA   Lcom/zhyyu/learn/jvm/compile/GenericTest$ClassA;
//}
//SourceFile: "GenericTest.java"
//InnerClasses:
//     static #60= #16 of #1; //ClassA=class com/zhyyu/learn/jvm/compile/GenericTest$ClassA of class com/zhyyu/learn/jvm/compile/GenericTest