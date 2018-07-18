package com.zhyyu.learn.jvm.compile;

import lombok.Data;

/**
 * test lombok compile
 * @author zhyyu
 *
 */
@Data
public class LombokTest {

	private int int1;
	
	private int int2;
	
}

//package com.zhyyu.learn.jvm.compile;
//
//public class LombokTest
//{
//  private int int1;
//  private int int2;
//  
//  public String toString()
//  {
//    return "LombokTest(int1=" + getInt1() + ", int2=" + getInt2() + ")";
//  }
//  
//  public int hashCode()
//  {
//    int PRIME = 59;int result = 1;result = result * 59 + getInt1();result = result * 59 + getInt2();return result;
//  }
//  
//  protected boolean canEqual(Object other)
//  {
//    return other instanceof LombokTest;
//  }
//  
//  public boolean equals(Object o)
//  {
//    if (o == this) {
//      return true;
//    }
//    if (!(o instanceof LombokTest)) {
//      return false;
//    }
//    LombokTest other = (LombokTest)o;
//    if (!other.canEqual(this)) {
//      return false;
//    }
//    if (getInt1() != other.getInt1()) {
//      return false;
//    }
//    return getInt2() == other.getInt2();
//  }
//  
//  public void setInt2(int int2)
//  {
//    this.int2 = int2;
//  }
//  
//  public void setInt1(int int1)
//  {
//    this.int1 = int1;
//  }
//  
//  public int getInt2()
//  {
//    return this.int2;
//  }
//  
//  public int getInt1()
//  {
//    return this.int1;
//  }
//}



//F:\workspace-zhyyu-learn\learn-jvm\target\classes\com\zhyyu\learn\jvm\compile>javap -p -v LombokTest.class
//Classfile /F:/workspace-zhyyu-learn/learn-jvm/target/classes/com/zhyyu/learn/jvm/compile/LombokTest.class
//  Last modified 2018-7-18; size 1512 bytes
//  MD5 checksum 3089b28cd8dc1621569aade1581f0a99
//  Compiled from "LombokTest.java"
//public class com.zhyyu.learn.jvm.compile.LombokTest
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Class              #2             // com/zhyyu/learn/jvm/compile/LombokTest
//   #2 = Utf8               com/zhyyu/learn/jvm/compile/LombokTest
//   #3 = Class              #4             // java/lang/Object
//   #4 = Utf8               java/lang/Object
//   #5 = Utf8               int1
//   #6 = Utf8               I
//   #7 = Utf8               int2
//   #8 = Utf8               getInt1
//   #9 = Utf8               ()I
//  #10 = Utf8               Code
//  #11 = Fieldref           #1.#12         // com/zhyyu/learn/jvm/compile/LombokTest.int1:I
//  #12 = NameAndType        #5:#6          // int1:I
//  #13 = Utf8               LineNumberTable
//  #14 = Utf8               LocalVariableTable
//  #15 = Utf8               this
//  #16 = Utf8               Lcom/zhyyu/learn/jvm/compile/LombokTest;
//  #17 = Utf8               getInt2
//  #18 = Fieldref           #1.#19         // com/zhyyu/learn/jvm/compile/LombokTest.int2:I
//  #19 = NameAndType        #7:#6          // int2:I
//  #20 = Utf8               setInt1
//  #21 = Utf8               (I)V
//  #22 = Utf8               setInt2
//  #23 = Utf8               equals
//  #24 = Utf8               (Ljava/lang/Object;)Z
//  #25 = Methodref          #1.#26         // com/zhyyu/learn/jvm/compile/LombokTest.canEqual:(Ljava/lang/Object;)Z
//  #26 = NameAndType        #27:#24        // canEqual:(Ljava/lang/Object;)Z
//  #27 = Utf8               canEqual
//  #28 = Methodref          #1.#29         // com/zhyyu/learn/jvm/compile/LombokTest.getInt1:()I
//  #29 = NameAndType        #8:#9          // getInt1:()I
//  #30 = Methodref          #1.#31         // com/zhyyu/learn/jvm/compile/LombokTest.getInt2:()I
//  #31 = NameAndType        #17:#9         // getInt2:()I
//  #32 = Utf8               o
//  #33 = Utf8               Ljava/lang/Object;
//  #34 = Utf8               other
//  #35 = Utf8               StackMapTable
//  #36 = Utf8               hashCode
//  #37 = Utf8               PRIME
//  #38 = Utf8               result
//  #39 = Utf8               toString
//  #40 = Utf8               ()Ljava/lang/String;
//  #41 = Class              #42            // java/lang/StringBuilder
//  #42 = Utf8               java/lang/StringBuilder
//  #43 = String             #44            // LombokTest(int1=
//  #44 = Utf8               LombokTest(int1=
//  #45 = Methodref          #41.#46        // java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
//  #46 = NameAndType        #47:#48        // "<init>":(Ljava/lang/String;)V
//  #47 = Utf8               <init>
//  #48 = Utf8               (Ljava/lang/String;)V
//  #49 = Methodref          #41.#50        // java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
//  #50 = NameAndType        #51:#52        // append:(I)Ljava/lang/StringBuilder;
//  #51 = Utf8               append
//  #52 = Utf8               (I)Ljava/lang/StringBuilder;
//  #53 = String             #54            // , int2=
//  #54 = Utf8               , int2=
//  #55 = Methodref          #41.#56        // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//  #56 = NameAndType        #51:#57        // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//  #57 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
//  #58 = String             #59            // )
//  #59 = Utf8               )
//  #60 = Methodref          #41.#61        // java/lang/StringBuilder.toString:()Ljava/lang/String;
//  #61 = NameAndType        #39:#40        // toString:()Ljava/lang/String;
//  #62 = Utf8               ()V
//  #63 = Methodref          #3.#64         // java/lang/Object."<init>":()V
//  #64 = NameAndType        #47:#62        // "<init>":()V
//  #65 = Utf8               SourceFile
//  #66 = Utf8               LombokTest.java
//{
//  private int int1;
//    descriptor: I
//    flags: ACC_PRIVATE
//
//  private int int2;
//    descriptor: I
//    flags: ACC_PRIVATE
//
//  public int getInt1();
//    descriptor: ()I
//    flags: ACC_PUBLIC
//    Code:
//      stack=1, locals=1, args_size=1
//         0: aload_0
//         1: getfield      #11                 // Field int1:I
//         4: ireturn
//      LineNumberTable:
//        line 10: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       5     0  this   Lcom/zhyyu/learn/jvm/compile/LombokTest;
//
//  public int getInt2();
//    descriptor: ()I
//    flags: ACC_PUBLIC
//    Code:
//      stack=1, locals=1, args_size=1
//         0: aload_0
//         1: getfield      #18                 // Field int2:I
//         4: ireturn
//      LineNumberTable:
//        line 10: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       5     0  this   Lcom/zhyyu/learn/jvm/compile/LombokTest;
//
//  public void setInt1(int);
//    descriptor: (I)V
//    flags: ACC_PUBLIC
//    Code:
//      stack=2, locals=2, args_size=2
//         0: aload_0
//         1: iload_1
//         2: putfield      #11                 // Field int1:I
//         5: return
//      LineNumberTable:
//        line 10: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       6     0  this   Lcom/zhyyu/learn/jvm/compile/LombokTest;
//            0       6     1  int1   I
//
//  public void setInt2(int);
//    descriptor: (I)V
//    flags: ACC_PUBLIC
//    Code:
//      stack=2, locals=2, args_size=2
//         0: aload_0
//         1: iload_1
//         2: putfield      #18                 // Field int2:I
//         5: return
//      LineNumberTable:
//        line 10: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       6     0  this   Lcom/zhyyu/learn/jvm/compile/LombokTest;
//            0       6     1  int2   I
//
//  public boolean equals(java.lang.Object);
//    descriptor: (Ljava/lang/Object;)Z
//    flags: ACC_PUBLIC
//    Code:
//      stack=2, locals=3, args_size=2
//         0: aload_1
//         1: aload_0
//         2: if_acmpne     7
//         5: iconst_1
//         6: ireturn
//         7: aload_1
//         8: instanceof    #1                  // class com/zhyyu/learn/jvm/compile/LombokTest
//        11: ifne          16
//        14: iconst_0
//        15: ireturn
//        16: aload_1
//        17: checkcast     #1                  // class com/zhyyu/learn/jvm/compile/LombokTest
//        20: astore_2
//        21: aload_2
//        22: aload_0
//        23: invokevirtual #25                 // Method canEqual:(Ljava/lang/Object;)Z
//        26: ifne          31
//        29: iconst_0
//        30: ireturn
//        31: aload_0
//        32: invokevirtual #28                 // Method getInt1:()I
//        35: aload_2
//        36: invokevirtual #28                 // Method getInt1:()I
//        39: if_icmpeq     44
//        42: iconst_0
//        43: ireturn
//        44: aload_0
//        45: invokevirtual #30                 // Method getInt2:()I
//        48: aload_2
//        49: invokevirtual #30                 // Method getInt2:()I
//        52: if_icmpeq     57
//        55: iconst_0
//        56: ireturn
//        57: iconst_1
//        58: ireturn
//      LineNumberTable:
//        line 10: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      59     0  this   Lcom/zhyyu/learn/jvm/compile/LombokTest;
//            0      59     1     o   Ljava/lang/Object;
//           21      38     2 other   Lcom/zhyyu/learn/jvm/compile/LombokTest;
//      StackMapTable: number_of_entries = 5
//        frame_type = 7 /* same */
//        frame_type = 8 /* same */
//        frame_type = 252 /* append */
//          offset_delta = 14
//          locals = [ class com/zhyyu/learn/jvm/compile/LombokTest ]
//        frame_type = 12 /* same */
//        frame_type = 12 /* same */
//
//  protected boolean canEqual(java.lang.Object);
//    descriptor: (Ljava/lang/Object;)Z
//    flags: ACC_PROTECTED
//    Code:
//      stack=1, locals=2, args_size=2
//         0: aload_1
//         1: instanceof    #1                  // class com/zhyyu/learn/jvm/compile/LombokTest
//         4: ireturn
//      LineNumberTable:
//        line 10: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       5     0  this   Lcom/zhyyu/learn/jvm/compile/LombokTest;
//            0       5     1 other   Ljava/lang/Object;
//
//  public int hashCode();
//    descriptor: ()I
//    flags: ACC_PUBLIC
//    Code:
//      stack=2, locals=3, args_size=1
//         0: bipush        59
//         2: istore_1
//         3: iconst_1
//         4: istore_2
//         5: iload_2
//         6: bipush        59
//         8: imul
//         9: aload_0
//        10: invokevirtual #28                 // Method getInt1:()I
//        13: iadd
//        14: istore_2
//        15: iload_2
//        16: bipush        59
//        18: imul
//        19: aload_0
//        20: invokevirtual #30                 // Method getInt2:()I
//        23: iadd
//        24: istore_2
//        25: iload_2
//        26: ireturn
//      LineNumberTable:
//        line 10: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      27     0  this   Lcom/zhyyu/learn/jvm/compile/LombokTest;
//            3      24     1 PRIME   I
//            5      22     2 result   I
//
//  public java.lang.String toString();
//    descriptor: ()Ljava/lang/String;
//    flags: ACC_PUBLIC
//    Code:
//      stack=3, locals=1, args_size=1
//         0: new           #41                 // class java/lang/StringBuilder
//         3: dup
//         4: ldc           #43                 // String LombokTest(int1=
//         6: invokespecial #45                 // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
//         9: aload_0
//        10: invokevirtual #28                 // Method getInt1:()I
//        13: invokevirtual #49                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
//        16: ldc           #53                 // String , int2=
//        18: invokevirtual #55                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//        21: aload_0
//        22: invokevirtual #30                 // Method getInt2:()I
//        25: invokevirtual #49                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
//        28: ldc           #58                 // String )
//        30: invokevirtual #55                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//        33: invokevirtual #60                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
//        36: areturn
//      LineNumberTable:
//        line 10: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0      37     0  this   Lcom/zhyyu/learn/jvm/compile/LombokTest;
//
//  public com.zhyyu.learn.jvm.compile.LombokTest();
//    descriptor: ()V
//    flags: ACC_PUBLIC
//    Code:
//      stack=1, locals=1, args_size=1
//         0: aload_0
//         1: invokespecial #63                 // Method java/lang/Object."<init>":()V
//         4: return
//      LineNumberTable:
//        line 10: 0
//      LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//            0       5     0  this   Lcom/zhyyu/learn/jvm/compile/LombokTest;
//}
//SourceFile: "LombokTest.java"
