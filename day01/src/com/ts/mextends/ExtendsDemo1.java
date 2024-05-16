package com.ts.mextends;

/**
 * @Author CHINHAE @Date 2024/5/16 20:19 @PackageName:com.ts.mextends @ClassName:
 * ExtendsDemo1 @Description: TODO @Version 1.0
 */
public class ExtendsDemo1 {
    public static void main(String[] args){
        Coder coder = new Coder();
        coder.setName("张三");
    System.out.println(coder.getName());
    }
}

/*
    创建类的细节：
        一个.java文件中可以编写多个class
        1.保证类与类之间是平级关系
        2.只能有一个被public修饰
 */

class Employee{
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee{name = " + name + ", age = " + age + ", salary = " + salary + "}";
    }
}

class Coder extends Employee{

}

class Manager extends Employee{

}
