package com.ts.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author CHINHAE @Date 2024/5/21 7:41 @PackageName:com.ts.test @ClassName: DateTest1 @Description:
 * TODO @Version 1.0
 */
public class DateTest1 {
  /*
  需求：计算你来到了这个世界多少天
   */

  public static void main(String[] args) throws ParseException {

    Scanner scanner = new Scanner(System.in);

    System.out.println("请输入你的出生日期:");
    System.out.println("格式为yyyy-MM-dd");
    String bir = scanner.nextLine();
    

    //  定义日期格式
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    Date birthday = simpleDateFormat.parse(bir);
    System.out.println(birthday);

    Date date = new Date();

    // 计算从出生到现在的毫秒数
    long l = date.getTime() - birthday.getTime();
    System.out.println(l);

    // 将毫秒数转换为天数
    long daysAlive = l / (1000 * 60 * 60 * 24);

    System.out.println("你来到这个世界已经 " + daysAlive + " 天了。");
  }
}
