package com.ts.stream;

import java.util.*;

/**
 * @Author CHINHAE @Date 2024/5/22 18:32 @PackageName:com.ts.stream @ClassName:
 * StreamDemo1 @Description: TODO @Version 1.0
 */
public class StreamDemo1 {
  /*
     获取Stream流对象演示
         - 将数据放在流水线的传送带上
         
         *Map集合获取Stream流对象，需要间接获取
                -map.entrySet().stream()

         1.集合获取Stream流对象（使用CoLLection接口中的默认方法）
             default Stream<E> stream()
         2.数组获取Stream流对象（使用Arrays数组工具类中的静态方法）
             static <T> Stream<T> stream （T[] array)
         3.零散的数据获取Stream流对象（使用Stream类中的静态方法）
             static <T> Stream<T> of（T...values)
  */
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("张三丰");
    list.add("张无忌");
    list.add("张翠山");
    list.add("王二麻子");
    list.add("张亮");
    list.add("谢广坤");

    list.stream().forEach(s -> System.out.println(s));

    HashSet<String> set = new HashSet<>();
    set.add("张三丰");
    set.add("张无忌");
    set.add("张翠山");
    set.add("王二麻子");
    set.add("张亮");
    set.add("谢广坤");

    set.stream().forEach(s -> System.out.println(s));

    Map<String,Integer> map = new HashMap<>();
    map.put("张三丰",100);
    map.put("张无忌",35);
    map.put("张翠山",23);
    map.put("王二麻子",345);
    map.put("张亮",21);
    map.put("谢广坤",88);

    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
    entrySet.stream().forEach(s -> System.out.println(s));
  }
}
