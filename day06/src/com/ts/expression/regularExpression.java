package com.ts.expression;

/**
 * @Author CHINHAE @Date 2024/5/20 20:24 @PackageName:com.ts.expression @ClassName:
 * 正则表达式 @Description: TODO @Version 1.0
 */
public class regularExpression {
  /*
        正则表达式：本质来说就是一个字符串,可以指定一些规则,来校验其他字符串
  */
  /*
  1.字符类 :

  [abc]         只能是a，b，或c
  [^abc]        除了a，b，c之外的任何字符
  [a-zA-Z]      a到zA到z，包括（范围）
  [a-d[m-p]]        a到d，或m通过p：([a-dm-p]联合)
  [a-z&&[def]]      d，e，或f（交集）
  [a-z&&[^bc]]      a到z，除了b和c：（[ad-z]减法）
  [a-z&&[m-p]]      a到z，除了m到p：（[a-lq-z]减法）
       */

  public static void main(String[] args) {
    String regex = "[abc]";

    System.out.println("a".matches(regex));
  }
}
