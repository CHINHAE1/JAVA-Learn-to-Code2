package com.ts.test;

import java.util.Arrays;

/**
 * @Author CHINHAE @Date 2024/5/20 18:39 @PackageName:com.ts.test @ClassName:
 * SelectSort @Description: TODO @Version 1.0
 */
public class SelectSort {
    /*
        选择排序：从日索引开始，拿若每一个索引上的元素跟后面的元素依次比较

        第-轮：arr[0]-arr[1] arr[0]-arr[2] arr[0]-arr[3] arr[0]-arr[4]
        第二轮：arr[1]-arr[2] arr[1]-arr[3] arr[1]-arr[4]
        第三轮：arr[2]-arr[3] arr[2]-arr[4]
        第四轮：arr[3]-arr[4]
     */
    public static void main(String[] args){
        int[] arr = {22,11,55,44,33};

        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    System.out.println(Arrays.toString(arr));
    }
}
