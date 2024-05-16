package com.ts.mstatic;

/**
 * @Author CHINHAE @Date 2024/5/16 19:36 @PackageName:com.ts.mstatic @ClassName:
 * StaticDemo1 @Description: TODO @Version 1.0
 */

/*
       static关键字：修饰符，可以修饰成员变量，成员方法

       特点：
           1.被类的所有对象所共享
           2.多了一种调用方式，可以通过类名进行调用
           3.随着类的加载而加载，优先于对象存在
*/
public class StaticDemo1 {
    public static void main(String[] args){
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(23);
        stu1.setSchool("传智学院");

    System.out.println(stu1.getName() + " "
            + stu1.getAge() + " "
            + stu1.getSchool());

    System.out.println("---------------------------");

        Student stu2 = new Student();
        stu2.setName("李四");
        stu2.setAge(16);

        System.out.println(stu2.getName() + " "
                + stu2.getAge() + " "
                + stu2.getSchool());
    }
}
