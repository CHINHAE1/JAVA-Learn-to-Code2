package com.ts.minterface;

/**
 * @Author CHINHAE @Date 2024/5/17 15:28 @PackageName:com.ts.minterface @ClassName:
 * interfaceDemo1 @Description: TODO @Version 1.0
 */
public class interfaceDemo1 {
  /*
     接口：体现的思想就是声明[规则]

     思路：如果发现一个类，所有的组成，都是抽象方法
         - 没有成员变量
         - 没有普通方法

         这种类，我们通常会设计为Java中的接口，因为现在这个类存在的唯一价值，就只是声明规则了

         -----------------------------------------------

         接口的定义格式 :

                     interface 接口名 {}

         注意 : 接口不允许实例化

         接口和类之间是实现关系,通过implements关键字来完成
  */

  public static void main(String[] args) {
    //  创建实现类对象
    InterImpl inter = new InterImpl();
    inter.method();
    inter.show();
  }
}

interface Inter {
  public abstract void show();

  public abstract void method();
}

class InterImpl implements Inter {

  @Override
  public void show() {
    System.out.println("show...");
  }

  @Override
  public void method() {
    System.out.println("method....");
  }
}
