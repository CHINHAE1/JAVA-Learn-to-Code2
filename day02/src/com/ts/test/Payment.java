package com.ts.test;

/**
 * @author Aim
 */
public interface Payment {
    void pay(double money);

    default void method(){
    System.out.println("method");
    }
}
