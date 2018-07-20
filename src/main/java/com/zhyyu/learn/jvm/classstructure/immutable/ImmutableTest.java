package com.zhyyu.learn.jvm.classstructure.immutable;

/**
 * test java immutable Object
 * @author Administrator
 *
 */
public class ImmutableTest {

	public static void main(String[] args) {
		int i1 = 1;
		add(i1);
		System.out.println(i1);
		
		Integer i2 = 1;
		add(i2);
		System.err.println(i2);
		
		MyInteger i3 = new MyInteger(1);
		add(i3);
		System.out.println(i3);
		
		String str1 = "hello wolrd";
		concatenate(str1);
		System.out.println(str1);
	}
	
	public static void add(int i) {
		i = i + 1;
	}
	
	public static void add(Integer i) {
		i = i + 1;
	}
	
	public static void add(MyInteger myI) {
		myI.add(1);
	}
	
	public static void concatenate(String str) {
		str = str + "_suffix";
	}
	
	static class MyInteger {
		
		int i;
		
		MyInteger(int i) {
			this.i = i;
		}

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}
		
		void add(int i) {
			this.i = this.i + i;
		}

		@Override
		public String toString() {
			return "MyInteger [i=" + i + "]";
		}
		
	}
	
}





//F:\workspace-zhyyu-learn\learn-jvm\target\classes\com\zhyyu\learn\jvm\classstructure\immutable>javap -p -v ImmutableTest.class
//Classfile /F:/workspace-zhyyu-learn/learn-jvm/target/classes/com/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest.class
//  Last modified 2018-7-20; size 1905 bytes
//  MD5 checksum 2baffe2e7d38d553e05b4432db6dce3e
//  Compiled from "ImmutableTest.java"
//public class com.zhyyu.learn.jvm.classstructure.immutable.ImmutableTest
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//    #1 = Class              #2            // com/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest
//    #2 = Utf8               com/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest
//    #3 = Class              #4            // java/lang/Object
//    #4 = Utf8               java/lang/Object
//    #5 = Utf8               <init>
//    #6 = Utf8               ()V
//    #7 = Utf8               Code
//    #8 = Methodref          #3.#9         // java/lang/Object."<init>":()V
//    #9 = NameAndType        #5:#6         // "<init>":()V
//   #10 = Utf8               LineNumberTable
//   #11 = Utf8               LocalVariableTable
//   #12 = Utf8               this
//   #13 = Utf8               Lcom/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest;
//   #14 = Utf8               main
//   #15 = Utf8               ([Ljava/lang/String;)V
//   #16 = Methodref          #1.#17        // com/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest.add:(I)V
//   #17 = NameAndType        #18:#19       // add:(I)V
//   #18 = Utf8               add
//   #19 = Utf8               (I)V
//   #20 = Fieldref           #21.#23       // java/lang/System.out:Ljava/io/PrintStream;
//   #21 = Class              #22           // java/lang/System
//   #22 = Utf8               java/lang/System
//   #23 = NameAndType        #24:#25       // out:Ljava/io/PrintStream;
//   #24 = Utf8               out
//   #25 = Utf8               Ljava/io/PrintStream;
//   #26 = Methodref          #27.#29       // java/io/PrintStream.println:(I)V
//   #27 = Class              #28           // java/io/PrintStream
//   #28 = Utf8               java/io/PrintStream
//   #29 = NameAndType        #30:#19       // println:(I)V
//   #30 = Utf8               println
//   #31 = Methodref          #32.#34       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
//   #32 = Class              #33           // java/lang/Integer
//   #33 = Utf8               java/lang/Integer
//   #34 = NameAndType        #35:#36       // valueOf:(I)Ljava/lang/Integer;
//   #35 = Utf8               valueOf
//   #36 = Utf8               (I)Ljava/lang/Integer;
//   #37 = Methodref          #1.#38        // com/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest.add:(Ljava/lang/Integer;)V
//   #38 = NameAndType        #18:#39       // add:(Ljava/lang/Integer;)V
//   #39 = Utf8               (Ljava/lang/Integer;)V
//   #40 = Fieldref           #21.#41       // java/lang/System.err:Ljava/io/PrintStream;
//   #41 = NameAndType        #42:#25       // err:Ljava/io/PrintStream;
//   #42 = Utf8               err
//   #43 = Methodref          #27.#44       // java/io/PrintStream.println:(Ljava/lang/Object;)V
//   #44 = NameAndType        #30:#45       // println:(Ljava/lang/Object;)V
//   #45 = Utf8               (Ljava/lang/Object;)V
//   #46 = Class              #47           // com/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest$MyInteger
//   #47 = Utf8               com/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest$MyInteger
//   #48 = Methodref          #46.#49       // com/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest$MyInteger."<init>":(I)V
//   #49 = NameAndType        #5:#19        // "<init>":(I)V
//   #50 = Methodref          #1.#51        // com/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest.add:(Lcom/zhyyu/learn/jvm/classstructure/immut
//able/ImmutableTest$MyInteger;)V
//   #51 = NameAndType        #18:#52       // add:(Lcom/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest$MyInteger;)V
//   #52 = Utf8               (Lcom/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest$MyInteger;)V
//   #53 = String             #54           // hello wolrd
//   #54 = Utf8               hello wolrd
//   #55 = Methodref          #1.#56        // com/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest.concatenate:(Ljava/lang/String;)V
//   #56 = NameAndType        #57:#58       // concatenate:(Ljava/lang/String;)V
//   #57 = Utf8               concatenate
//   #58 = Utf8               (Ljava/lang/String;)V
//   #59 = Methodref          #27.#60       // java/io/PrintStream.println:(Ljava/lang/String;)V
//   #60 = NameAndType        #30:#58       // println:(Ljava/lang/String;)V
//   #61 = Utf8               args
//   #62 = Utf8               [Ljava/lang/String;
//   #63 = Utf8               i1
//   #64 = Utf8               I
//   #65 = Utf8               i2
//   #66 = Utf8               Ljava/lang/Integer;
//   #67 = Utf8               i3
//   #68 = Utf8               Lcom/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest$MyInteger;
//   #69 = Utf8               str1
//   #70 = Utf8               Ljava/lang/String;
//   #71 = Utf8               i
//   #72 = Methodref          #32.#73       // java/lang/Integer.intValue:()I
//   #73 = NameAndType        #74:#75       // intValue:()I
//   #74 = Utf8               intValue
//   #75 = Utf8               ()I
//   #76 = Methodref          #46.#17       // com/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest$MyInteger.add:(I)V
//   #77 = Utf8               myI
//   #78 = Class              #79           // java/lang/StringBuilder
//   #79 = Utf8               java/lang/StringBuilder
//   #80 = Methodref          #81.#83       // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
//   #81 = Class              #82           // java/lang/String
//   #82 = Utf8               java/lang/String
//   #83 = NameAndType        #35:#84       // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
//   #84 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
//   #85 = Methodref          #78.#86       // java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
//   #86 = NameAndType        #5:#58        // "<init>":(Ljava/lang/String;)V
//   #87 = String             #88           // _suffix
//   #88 = Utf8               _suffix
//   #89 = Methodref          #78.#90       // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//   #90 = NameAndType        #91:#92       // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//   #91 = Utf8               append
//   #92 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
//   #93 = Methodref          #78.#94       // java/lang/StringBuilder.toString:()Ljava/lang/String;
//   #94 = NameAndType        #95:#96       // toString:()Ljava/lang/String;
//   #95 = Utf8               toString
//   #96 = Utf8               ()Ljava/lang/String;
//   #97 = Utf8               str
//   #98 = Utf8               SourceFile
//   #99 = Utf8               ImmutableTest.java
//  #100 = Utf8               InnerClasses
//  #101 = Utf8               MyInteger
//{
//  public com.zhyyu.learn.jvm.classstructure.immutable.ImmutableTest();
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
//            0       5     0  this   Lcom/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest;
//
//  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=3, locals=5, args_size=1
//         0: iconst_1
//         1: istore_1
//         2: iload_1
//         3: invokestatic  #16                 // Method add:(I)V
//         6: getstatic     #20                 // Field java/lang/System.out:Ljava/io/PrintStream;
//         9: iload_1
//        10: invokevirtual #26                 // Method java/io/PrintStream.println:(I)V
//        13: iconst_1
//        14: invokestatic  #31                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
//        17: astore_2
//        18: aload_2
//        19: invokestatic  #37                 // Method add:(Ljava/lang/Integer;)V
//        22: getstatic     #40                 // Field java/lang/System.err:Ljava/io/PrintStream;
//        25: aload_2
//        26: invokevirtual #43                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
//        29: new           #46                 // class com/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest$MyInteger
//        32: dup
//        33: iconst_1
//        34: invokespecial #48                 // Method com/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest$MyInteger."<init>":(I)V
//        37: astore_3
//        38: aload_3
//        39: invokestatic  #50                 // Method add:(Lcom/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest$MyInteger;)V
//        42: getstatic     #20                 // Field java/lang/System.out:Ljava/io/PrintStream;
//        45: aload_3
//        46: invokevirtual #43                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
//        49: ldc           #53                 // String hello wolrd
//        51: astore        4
//        53: aload         4
//        55: invokestatic  #55                 // Method concatenate:(Ljava/lang/String;)V
//        58: getstatic     #20                 // Field java/lang/System.out:Ljava/io/PrintStream;
//        61: aload         4
//        63: invokevirtual #59                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        66: return
//      LineNumberTable:
//        line 11: 0
//        line 12: 2
//        line 13: 6
//        line 15: 13
//        line 16: 18
//        line 17: 22
//        line 19: 29
//        line 20: 38
//        line 21: 42
//        line 23: 49
//        line 24: 53
//        line 25: 58
//        line 26: 66
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      67     0  args   [Ljava/lang/String;
//            2      65     1    i1   I
//           18      49     2    i2   Ljava/lang/Integer;
//           38      29     3    i3   Lcom/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest$MyInteger;
//           53      14     4  str1   Ljava/lang/String;
//
//  public static void add(int);
//    descriptor: (I)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=0, locals=1, args_size=1
//         0: iinc          0, 1
//         3: return
//      LineNumberTable:
//        line 29: 0
//        line 30: 3
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       4     0     i   I
//
//  public static void add(java.lang.Integer);
//    descriptor: (Ljava/lang/Integer;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=2, locals=1, args_size=1
//         0: aload_0
//         1: invokevirtual #72                 // Method java/lang/Integer.intValue:()I
//         4: iconst_1
//         5: iadd
//         6: invokestatic  #31                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
//         9: astore_0
//        10: return
//      LineNumberTable:
//        line 33: 0
//        line 34: 10
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      11     0     i   Ljava/lang/Integer;
//
//  public static void add(com.zhyyu.learn.jvm.classstructure.immutable.ImmutableTest$MyInteger);
//    descriptor: (Lcom/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest$MyInteger;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=2, locals=1, args_size=1
//         0: aload_0
//         1: iconst_1
//         2: invokevirtual #76                 // Method com/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest$MyInteger.add:(I)V
//         5: return
//      LineNumberTable:
//        line 37: 0
//        line 38: 5
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       6     0   myI   Lcom/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest$MyInteger;
//
//  public static void concatenate(java.lang.String);
//    descriptor: (Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=3, locals=1, args_size=1
//         0: new           #78                 // class java/lang/StringBuilder
//         3: dup
//         4: aload_0
//         5: invokestatic  #80                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
//         8: invokespecial #85                 // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
//        11: ldc           #87                 // String _suffix
//        13: invokevirtual #89                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//        16: invokevirtual #93                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
//        19: astore_0
//        20: return
//      LineNumberTable:
//        line 41: 0
//        line 42: 20
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      21     0   str   Ljava/lang/String;
//}
//SourceFile: "ImmutableTest.java"
//InnerClasses:
//     static #101= #46 of #1; //MyInteger=class com/zhyyu/learn/jvm/classstructure/immutable/ImmutableTest$MyInteger of class com/zhyyu/learn/jvm/class
//structure/immutable/ImmutableTest