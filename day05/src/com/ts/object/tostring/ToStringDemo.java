package com.ts.object.tostring;

import com.ts.object.Student;

/**
 * @Author CHINHAE @Date 2024/5/20 5:28 @PackageName:com.ts.object.tostring @ClassName:
 * ToStringDemo @Description: TODO @Version 1.0
 */
public class ToStringDemo {

  /*
  public String toString() 返回该对象的字符串表示

  public String toString(){
  return getClass().getName()+"@"+Integer.toHexString(hashCode());
  }

  getClass().getName()：类名称，全类名（包名+类名）
  Integer.toHexString()：转十六进制
  hashCode()：返回的是对象内存地址+哈希算法，算出来的整数

  ------------------------------------------

  细节：使用打印语句，打印对象名的时候，println方法，
  源码层面，会自动调用该对象的toString方法。
   */

  public static void main(String[] args) {
    A a = new A();
    String name = "安慰";
    System.out.println(a);
    System.out.println(a.toString());

    Student stu = new Student("张三", 23);
    System.out.println(stu);
  }
}

class A {
  @Override
  public String toString() {
    return "重写toString方法";
  }
}
