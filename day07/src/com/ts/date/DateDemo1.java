package com.ts.date;

import java.util.Date;

/**
 * @Author CHINHAE @Date 2024/5/21 6:59 @PackageName:com.ts.date @ClassName: DateDemo1 @Description:
 * TODO @Version 1.0
 */
public class DateDemo1 {
  /*
     Date类：表示时间的类

         1.构造方法：

             pubLic Date（）：将当前时间，封装为Date日期对象
             public Date（Longtime）：把时间毫秒值转换成Date日期对象

         2.常见方法：

             public long getTime（）：返回从1970年1月1日00：00：00走到此刻的总的毫秒数
             pubLic void setTime（Longtime）：设置日期对象的时间为当前时间毫秒值对应的时间
  */

  public static void main(String[] args) {
    //  将当前时间，封装为Date日期对象
    Date date = new Date();
    System.out.println(date);

    //  把时间毫秒值转换成Date日期对象
    Date date1 = new Date(1000L);
    System.out.println(date1);

    //  返回从1970年1月1日00：00：00走到此刻的总的毫秒数
    long time = date.getTime();
    System.out.println(time);

    //  把时间毫秒值转换成Date日期对象(也就是从1970+毫秒=现在的时间)
    Date date2 = new Date(time);
    System.out.println(date2);

    //  设置日期对象的时间为当前时间毫秒值对应的时间
    Date date3 = new Date();
    date3.setTime(0L);
    System.out.println(date3);
  }
}
