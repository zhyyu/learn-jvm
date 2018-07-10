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
