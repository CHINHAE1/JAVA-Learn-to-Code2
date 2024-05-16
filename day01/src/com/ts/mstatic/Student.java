package com.ts.mstatic;

/**
 * @Author CHINHAE @Date 2024/5/16 19:38 @PackageName:com.ts.mstatic @ClassName:
 * Student @Description: TODO @Version 1.0
 */
public class Student {
    private String name;
    private int age;
    private String school;

    public Student() {
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
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
     * @return school
     */
    public String getSchool() {
        return school;
    }

    /**
     * 设置
     * @param school
     */
    public void setSchool(String school) {
        this.school = school;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", school = " + school + "}";
    }
}
