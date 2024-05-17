package com.ts.test;

/**
 * @Author CHINHAE @Date 2024/5/17 17:56 @PackageName:com.ts.test @ClassName:
 * creditCardPaymentImpl @Description: TODO @Version 1.0
 */
public class creditCardPaymentImpl implements Payment{

    @Override
    public void pay(double money) {
        System.out.println("通过信用卡快捷支付了:" + money + "元!");
    }
}
