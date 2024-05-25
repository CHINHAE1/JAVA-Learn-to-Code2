package com.ts.file;

import java.io.File;
import java.io.IOException;

/**
 * @Author CHINHAE @Date 2024/5/25 14:23 @PackageName:com.ts.file @ClassName:
 * FileDemo1 @Description: TODO @Version 1.0
 */
public class FileDemo1 {
  /*
     File类介绍：文件或文件夹对象
         构造方法：
             1.pubLic File（String pathname）：根据传入的字符串路径封装File对象
             2.pubLic File（String parent，String chiLd）：根据传入的父级路径和子级路径来封装File对象
             3.pubLic File（File parent，String child）：根据传入的父级路径（File类型）和子级路径来封装File对象
  */

  public static void main(String[] args) throws IOException {
    File f1 = new File("H:\\file\\A.txt");
    f1.createNewFile();

    File f2 = new File("H:\\file");
    System.out.println(f2.exists());

    File f3 = new File("H:\\", "file");
    System.out.println(f3.exists());
  }
}
