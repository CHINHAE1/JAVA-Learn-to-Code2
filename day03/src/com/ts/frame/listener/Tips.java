package com.ts.frame.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 * @Author CHINHAE @Date 2024/5/18 10:20 @PackageName:com.ts.frame.listener @ClassName:
 * Tips @Description: TODO @Version 1.0
 */
public class Tips {
    /*
        焦点：程序的注意力集中在了某一个组件上

        注意：按钮组件比较特殊，在创建好之后，程序的焦点，默认就停留在按钮组件上面
                但按钮组件，其实不需要占用程序的焦点
                可以通过 setFocusable(false); 取消焦点
setFocusable(false):
     */

    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        JButton jButton = new JButton("按钮");
        jButton.setBounds(0,0,100,100);
        jFrame.getContentPane().add(jButton);

    jButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("我被点了");
        }
    });

        jButton.setFocusable(false);

        jFrame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("键盘按下了");
            }
        });


        jFrame.setVisible(true);
    }
}
