package com.ts.object;

/**
 * @Author CHINHAE @Date 2024/5/20 5:29 @PackageName:com.ts.object @ClassName: Student @Description:
 * TODO @Version 1.0
 */
public class Student {
  private String name;
  private int age;

  @Override
  public boolean equals(Object obj) {

    if (obj instanceof Student) {
      //  this : 代表调用的那个对象 stu1
      //  obj : 代表另一个对象 stu2

      // 向下转型的目的,是为了调用子类特有的成员
      Student stu = (Student) obj;
      return this.age == stu.age && this.name.equals(stu.name);
    } else {
      return false;
    }
  }

  public Student() {
  }

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
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

  public String toString() {
    return "Student{name = " + name + ", age = " + age + "}";
  }
}
