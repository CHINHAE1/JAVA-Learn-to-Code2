package com.ts.recursion;

/**
 * @Author CHINHAE @Date 2024/5/21 19:31 @PackageName:com.ts.recursion @ClassName:
 * RecursionDemo3 @Description: TODO @Version 1.0
 */
public class RecursionDemo3 {
    public static void main(String[] args){

        int re = sumNum(5);
        System.out.println(re);
    }

    private static int sumNum(int num) {
        if (num == 1){
            return 1;
        }   else {
            return num += sumNum(num-1);
        }
    }
}
