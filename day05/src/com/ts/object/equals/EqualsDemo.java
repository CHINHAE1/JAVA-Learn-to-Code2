package com.ts.object.equals;

import com.ts.object.Student;

/**
 * @Author CHINHAE @Date 2024/5/20 7:11 @PackageName:com.ts.object.equals @ClassName:
 * EqualsDemo @Description: TODO @Version 1.0
 */
public class EqualsDemo {
    /*
      Object类中的equals方法：
         public boolean equals(object obj)：对象之间进行比较，返回true，或者是false，
         public boolean equals(object obj){
            //this :stu1
            //obj : stu2
              return (this == obj);
            结论：Object类中的equals方法，默认比较的是对象内存地址
                    - 通常会重写equals方法,让对象 之间,比较内容
     */
    public static void main(String[] args){

        Student stu1 = new Student("张三", 23);
        Student stu2 = new Student("张三", 23);

    System.out.println(stu1.equals(stu2));
  }
}
