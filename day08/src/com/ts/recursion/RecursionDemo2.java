package com.ts.recursion;

/**
 * @Author CHINHAE @Date 2024/5/21 19:20 @PackageName:com.ts.recursion @ClassName:
 * RecursionDemo2 @Description: TODO @Version 1.0
 */
public class RecursionDemo2 {
    public static void main(String[] args){

        int result = jc(5);
        System.out.println(result);

    }

    private static int jc(int num) {
        if (num == 1){
            return 1;
        }   else {
            //  num : 5
            return num * jc(num-1);
        }
    }


}
