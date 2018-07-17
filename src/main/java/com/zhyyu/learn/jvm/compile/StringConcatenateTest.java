package com.zhyyu.learn.jvm.compile;

/**
 * string concatenate test(use StringBuilder)
 * @author Administrator
 *
 */
public class StringConcatenateTest {

	public static void main(String[] args) {
		String str1 = "hello ";
		String str2 = "world ";
		String str3 = "I come ";
		
		String str4 = str1 + str2 + str3;
		System.out.println(str4);
	}
	
}

//F:\workspace-zhyyu-learn\learn-jvm\target\classes\com\zhyyu\learn\jvm\compile>javap -p -v StringConcatenateTest.class
//Classfile /F:/workspace-zhyyu-learn/learn-jvm/target/classes/com/zhyyu/learn/jvm/compile/StringConcatenateTest.class
//  Last modified 2018-7-17; size 1013 bytes
//  MD5 checksum c6e7458632db0a2a8cbb868b2542343c
//  Compiled from "StringConcatenateTest.java"
//public class com.zhyyu.learn.jvm.compile.StringConcatenateTest
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Class              #2             // com/zhyyu/learn/jvm/compile/StringConcatenateTest
//   #2 = Utf8               com/zhyyu/learn/jvm/compile/StringConcatenateTest
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
//  #13 = Utf8               Lcom/zhyyu/learn/jvm/compile/StringConcatenateTest;
//  #14 = Utf8               main
//  #15 = Utf8               ([Ljava/lang/String;)V
//  #16 = String             #17            // hello
//  #17 = Utf8               hello
//  #18 = String             #19            // world
//  #19 = Utf8               world
//  #20 = String             #21            // I come
//  #21 = Utf8               I come
//  #22 = Class              #23            // java/lang/StringBuilder
//  #23 = Utf8               java/lang/StringBuilder
//  #24 = Methodref          #25.#27        // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
//  #25 = Class              #26            // java/lang/String
//  #26 = Utf8               java/lang/String
//  #27 = NameAndType        #28:#29        // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
//  #28 = Utf8               valueOf
//  #29 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
//  #30 = Methodref          #22.#31        // java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
//  #31 = NameAndType        #5:#32         // "<init>":(Ljava/lang/String;)V
//  #32 = Utf8               (Ljava/lang/String;)V
//  #33 = Methodref          #22.#34        // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//  #34 = NameAndType        #35:#36        // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//  #35 = Utf8               append
//  #36 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
//  #37 = Methodref          #22.#38        // java/lang/StringBuilder.toString:()Ljava/lang/String;
//  #38 = NameAndType        #39:#40        // toString:()Ljava/lang/String;
//  #39 = Utf8               toString
//  #40 = Utf8               ()Ljava/lang/String;
//  #41 = Fieldref           #42.#44        // java/lang/System.out:Ljava/io/PrintStream;
//  #42 = Class              #43            // java/lang/System
//  #43 = Utf8               java/lang/System
//  #44 = NameAndType        #45:#46        // out:Ljava/io/PrintStream;
//  #45 = Utf8               out
//  #46 = Utf8               Ljava/io/PrintStream;
//  #47 = Methodref          #48.#50        // java/io/PrintStream.println:(Ljava/lang/String;)V
//  #48 = Class              #49            // java/io/PrintStream
//  #49 = Utf8               java/io/PrintStream
//  #50 = NameAndType        #51:#32        // println:(Ljava/lang/String;)V
//  #51 = Utf8               println
//  #52 = Utf8               args
//  #53 = Utf8               [Ljava/lang/String;
//  #54 = Utf8               str1
//  #55 = Utf8               Ljava/lang/String;
//  #56 = Utf8               str2
//  #57 = Utf8               str3
//  #58 = Utf8               str4
//  #59 = Utf8               SourceFile
//  #60 = Utf8               StringConcatenateTest.java
//{
//  public com.zhyyu.learn.jvm.compile.StringConcatenateTest();
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
//            0       5     0  this   Lcom/zhyyu/learn/jvm/compile/StringConcatenateTest;
//
//  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=3, locals=5, args_size=1
//         0: ldc           #16                 // String hello
//         2: astore_1 
//         3: ldc           #18                 // String world
//         5: astore_2
//         6: ldc           #20                 // String I come
//         8: astore_3
//         9: new           #22                 // class java/lang/StringBuilder
//        12: dup
//        13: aload_1
//        14: invokestatic  #24                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
//        17: invokespecial #30                 // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
//        20: aload_2
//        21: invokevirtual #33                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//        24: aload_3
//        25: invokevirtual #33                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//        28: invokevirtual #37                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
//        31: astore        4
//        33: getstatic     #41                 // Field java/lang/System.out:Ljava/io/PrintStream;
//        36: aload         4
//        38: invokevirtual #47                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        41: return
//      LineNumberTable:
//        line 11: 0
//        line 12: 3
//        line 13: 6
//        line 15: 9
//        line 16: 33
//        line 17: 41
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      42     0  args   [Ljava/lang/String;
//            3      39     1  str1   Ljava/lang/String;
//            6      36     2  str2   Ljava/lang/String;
//            9      33     3  str3   Ljava/lang/String;
//           33       9     4  str4   Ljava/lang/String;
//}
//SourceFile: "StringConcatenateTest.java"