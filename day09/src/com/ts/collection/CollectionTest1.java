package com.ts.collection;

import com.ts.domain.Student;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author CHINHAE @Date 2024/5/21 21:19 @PackageName:com.ts.collection @ClassName:
 * CollectionTest1 @Description: TODO @Version 1.0
 */
public class CollectionTest1 {

  /*
     Collection的常用方法：
         public boolean add（E e）：把给定的对象添加到当前集合中
         public void clear（）：清空集合中所有的元素
         public boolean remove（E e）：把给定的对象在当前集合中删除
         public boolean contains（Object obj）：判断当前集合中是否包含给定的对象
         public boolean isEmpty()：判断当前集合是否为空
         public int size（）：返回集合中元素的个数（集合的长度）
  */
  public static void main(String[] args) {
    Collection<Student> c = new ArrayList<>();

    c.add(new Student("李四",17));
    c.add(new Student("王五",11));
    c.add(new Student("赵一",14));

    c.remove(new Student("李四",17));
    System.out.println(c);
  }

  private static void method() {
    //  以多态的形式创建集合对象,调用单列集合中的共有方法
    Collection<String> c = new ArrayList<>();

    c.add("李四");
    c.add("王五");
    c.add("赵一");
    c.add("李四");
    System.out.println(c);

    c.remove("李四");
    System.out.println(c);
  }
}
