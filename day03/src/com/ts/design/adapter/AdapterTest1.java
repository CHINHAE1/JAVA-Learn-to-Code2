package com.ts.design.adapter;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @Author CHINHAE @Date 2024/5/19 3:19 @PackageName:com.ts.frame.adapter @ClassName:
 * AdapterTest1 @Description: TODO @Version 1.0
 */
public class AdapterTest1 {
    public static void main(String[] args){
        /*JFrame jFrame = new JFrame();
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jFrame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("键盘按下了...");
            }
        });
        jFrame.setVisible(true);
    }*/

        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("键盘按下了...");
            }
        });
        frame.setVisible(true);
    }
}

