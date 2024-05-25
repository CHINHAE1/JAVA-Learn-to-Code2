package com.ts.collection;

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

    //  以多态的形式创建集合对象,调用单列集合中的共有方法
    Collection<String> c = new ArrayList<>();

    boolean a = c.add("A");
    boolean b = c.add("A");
    boolean d = c.add("A");
    System.out.println(a);
    System.out.println(b);
    System.out.println(d);

    System.out.println(c);
  }
}
