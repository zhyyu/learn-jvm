package com.zhyyu.learn.jvm.classstructure;

import java.util.concurrent.locks.ReentrantLock;

/**
 * synchronized reentrantLock classfile analyze
 * @author Administrator
 *
 */
public class SynchronizedJvmCommandTest {

	public static void main(String[] args) {
		synMethod1();
		synMethod2();
	}
	
	public static synchronized void synMethod1() {
		System.out.println("synMethod1 invoked");
	}
	
	public static void synMethod2() {
		ReentrantLock reentrantLock = new ReentrantLock();
		reentrantLock.lock();
		
		try {
			System.out.println("synMethod2 invoked");
		} finally {
			reentrantLock.unlock();
		}
	}
	
}


//F:\workspace-zhyyu-learn\learn-jvm\target\classes\com\zhyyu\learn\jvm\classstructure>javap -p -v SynchronizedJvmCommandTest.class
//Classfile /F:/workspace-zhyyu-learn/learn-jvm/target/classes/com/zhyyu/learn/jvm/classstructure/SynchronizedJvmCommandTest.class
//  Last modified 2018-7-16; size 1127 bytes
//  MD5 checksum 8a72ee603ca2a1f37e69670c76874d90
//  Compiled from "SynchronizedJvmCommandTest.java"
//public class com.zhyyu.learn.jvm.classstructure.SynchronizedJvmCommandTest
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Class              #2             // com/zhyyu/learn/jvm/classstructure/SynchronizedJvmCommandTest
//   #2 = Utf8               com/zhyyu/learn/jvm/classstructure/SynchronizedJvmCommandTest
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
//  #13 = Utf8               Lcom/zhyyu/learn/jvm/classstructure/SynchronizedJvmCommandTest;
//  #14 = Utf8               main
//  #15 = Utf8               ([Ljava/lang/String;)V
//  #16 = Methodref          #1.#17         // com/zhyyu/learn/jvm/classstructure/SynchronizedJvmCommandTest.synMethod1:()V
//  #17 = NameAndType        #18:#6         // synMethod1:()V
//  #18 = Utf8               synMethod1
//  #19 = Methodref          #1.#20         // com/zhyyu/learn/jvm/classstructure/SynchronizedJvmCommandTest.synMethod2:()V
//  #20 = NameAndType        #21:#6         // synMethod2:()V
//  #21 = Utf8               synMethod2
//  #22 = Utf8               args
//  #23 = Utf8               [Ljava/lang/String;
//  #24 = Fieldref           #25.#27        // java/lang/System.out:Ljava/io/PrintStream;
//  #25 = Class              #26            // java/lang/System
//  #26 = Utf8               java/lang/System
//  #27 = NameAndType        #28:#29        // out:Ljava/io/PrintStream;
//  #28 = Utf8               out
//  #29 = Utf8               Ljava/io/PrintStream;
//  #30 = String             #31            // synMethod1 invoked
//  #31 = Utf8               synMethod1 invoked
//  #32 = Methodref          #33.#35        // java/io/PrintStream.println:(Ljava/lang/String;)V
//  #33 = Class              #34            // java/io/PrintStream
//  #34 = Utf8               java/io/PrintStream
//  #35 = NameAndType        #36:#37        // println:(Ljava/lang/String;)V
//  #36 = Utf8               println
//  #37 = Utf8               (Ljava/lang/String;)V
//  #38 = Class              #39            // java/util/concurrent/locks/ReentrantLock
//  #39 = Utf8               java/util/concurrent/locks/ReentrantLock
//  #40 = Methodref          #38.#9         // java/util/concurrent/locks/ReentrantLock."<init>":()V
//  #41 = Methodref          #38.#42        // java/util/concurrent/locks/ReentrantLock.lock:()V
//  #42 = NameAndType        #43:#6         // lock:()V
//  #43 = Utf8               lock
//  #44 = String             #45            // synMethod2 invoked
//  #45 = Utf8               synMethod2 invoked
//  #46 = Methodref          #38.#47        // java/util/concurrent/locks/ReentrantLock.unlock:()V
//  #47 = NameAndType        #48:#6         // unlock:()V
//  #48 = Utf8               unlock
//  #49 = Utf8               reentrantLock
//  #50 = Utf8               Ljava/util/concurrent/locks/ReentrantLock;
//  #51 = Utf8               StackMapTable
//  #52 = Class              #53            // java/lang/Throwable
//  #53 = Utf8               java/lang/Throwable
//  #54 = Utf8               SourceFile
//  #55 = Utf8               SynchronizedJvmCommandTest.java
//{
//  public com.zhyyu.learn.jvm.classstructure.SynchronizedJvmCommandTest();
//    descriptor: ()V
//    flags: ACC_PUBLIC
//    Code:
//      stack=1, locals=1, args_size=1
//         0: aload_0
//         1: invokespecial #8                  // Method java/lang/Object."<init>":()V
//         4: return
//      LineNumberTable:
//        line 10: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       5     0  this   Lcom/zhyyu/learn/jvm/classstructure/SynchronizedJvmCommandTest;
//
//  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=0, locals=1, args_size=1
//         0: invokestatic  #16                 // Method synMethod1:()V
//         3: invokestatic  #19                 // Method synMethod2:()V
//         6: return
//      LineNumberTable:
//        line 13: 0
//        line 14: 3
//        line 15: 6
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       7     0  args   [Ljava/lang/String;
//
//  public static synchronized void synMethod1();
//    descriptor: ()V
//    flags: ACC_PUBLIC, ACC_STATIC, ACC_SYNCHRONIZED
//    Code:
//      stack=2, locals=0, args_size=0
//         0: getstatic     #24                 // Field java/lang/System.out:Ljava/io/PrintStream;
//         3: ldc           #30                 // String synMethod1 invoked
//         5: invokevirtual #32                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//         8: return
//      LineNumberTable:
//        line 18: 0
//        line 19: 8
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//
//  public static void synMethod2();
//    descriptor: ()V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=2, locals=2, args_size=0
//         0: new           #38                 // class java/util/concurrent/locks/ReentrantLock
//         3: dup
//         4: invokespecial #40                 // Method java/util/concurrent/locks/ReentrantLock."<init>":()V
//         7: astore_0
//         8: aload_0
//         9: invokevirtual #41                 // Method java/util/concurrent/locks/ReentrantLock.lock:()V
//        12: getstatic     #24                 // Field java/lang/System.out:Ljava/io/PrintStream;
//        15: ldc           #44                 // String synMethod2 invoked
//        17: invokevirtual #32                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        20: goto          30
//        23: astore_1
//        24: aload_0
//        25: invokevirtual #46                 // Method java/util/concurrent/locks/ReentrantLock.unlock:()V
//        28: aload_1
//        29: athrow
//        30: aload_0
//        31: invokevirtual #46                 // Method java/util/concurrent/locks/ReentrantLock.unlock:()V
//        34: return
//      Exception table:
//         from    to  target type
//            12    23    23   any
//      LineNumberTable:
//        line 22: 0
//        line 23: 8
//        line 26: 12
//        line 27: 20
//        line 28: 24
//        line 29: 28
//        line 28: 30
//        line 30: 34
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            8      27     0 reentrantLock   Ljava/util/concurrent/locks/ReentrantLock;
//      StackMapTable: number_of_entries = 2
//        frame_type = 255 /* full_frame */
//          offset_delta = 23
//          locals = [ class java/util/concurrent/locks/ReentrantLock ]
//          stack = [ class java/lang/Throwable ]
//        frame_type = 6 /* same */
//}
//SourceFile: "SynchronizedJvmCommandTest.java"
