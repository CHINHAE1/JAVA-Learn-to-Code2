package com.ts.calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author CHINHAE @Date 2024/5/21 8:48 @PackageName:com.ts.calendar @ClassName:
 * CalendarDemo @Description: TODO @Version 1.0
 */
public class CalendarDemo {
  /*
  Calendar：代表的是系统此刻时间对应的日历，通过它可以单独获取、修改时间中的年、月、日、时、分、秒等。
    1.创建对象：
        pubLic static Calendar getInstance（）：获取当前时间的日历对象
        YEAR 年
        MONTH 月，从0开始算起，最大11；0代表1月，11代表12月。
        DATE 天
        HOUR 时
        MINUTE分
        SECOND秒

    2.常用方法：
        public int get（int field）：取日历中的某个字段信息
        public void set（int field，int value）：修改日历的某个字段信息
        public void add（int field，int amount）：为某个字段增加/减少指定的值

        注意事项
          - 西方星期的开始为周日，中国为周一。
          - 在Calendar类中，月份的表示是以0-11代表1-12月。
          - 日期是有大小关系的，时间靠后，时间越大。
   */

  public static void main(String[] args) {
    //  Calendar instance : 抽象类
    //  Calendar.getInstance() : 获取的是子类对象
    Calendar instance = Calendar.getInstance();

    // 调用get方法,获取指定字段的信息
    int i = instance.get(Calendar.MONTH);
    System.out.println(i);
    // 修改当前时间为3天后
    instance.add(Calendar.DATE, 3);
    // 修改当前时间为5小时后
    instance.add(Calendar.HOUR, 5);

    instance.set(Calendar.YEAR,2000);
    System.out.println(instance.get(Calendar.YEAR));

    //  获取该日历对象转成的日期对象
    Date time = instance.getTime();
    System.out.println(time);
  }
}
