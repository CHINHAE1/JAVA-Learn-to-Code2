package com.ts.arrays;

import java.util.Arrays;

/**
 * @Author CHINHAE @Date 2024/5/20 17:43 @PackageName:com.ts.arrays @ClassName:
 * ArraysDemo @Description: TODO @Version 1.0
 */
public class ArraysDemo {
  /*
     Arrays类常用方法：
         public static String toString（类型[]a）：
         将数组元素拼接为带有格式的字符中
         public static boolean equals（类型[]a，类型[]b）：
         比较两个数组内容是否相同
         public static int binarySearch（int[]a，intkey）：
         查找元素在数组中的索引（二分查找法：保证数组的元素是排好序的)
         public static void sort（类型[]a）：
         对数组进行默认升序排序
  */

  public static void main(String[] args) {
    int[] arr1 = {11, 22, 33, 44, 55};
    int[] arr2 = {11, 22, 33, 44, 55};

    //  将数组元素拼接为带有格式的字符中
    System.out.println(Arrays.toString(arr1));

    //  比较两个数组内容是否相同
    System.out.println(Arrays.equals(arr1, arr2));

    //  查找元素在数组中的索引（二分查找法：保证数组的元素是排好序的
    int[] arr3 = {22, 11, 55, 44, 33};
    System.out.println(Arrays.binarySearch(arr3, 33));

    //  对数组进行默认升序排序
    Arrays.sort(arr3);
    System.out.println(Arrays.toString(arr3));
    System.out.println(Arrays.binarySearch(arr3, 33));
  }
}
