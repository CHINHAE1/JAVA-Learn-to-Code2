package com.ts.frame.listener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 * @Author CHINHAE @Date 2024/5/18 10:20 @PackageName:com.ts.frame.listener @ClassName:
 * KeyListenerTest @Description: TODO @Version 1.0
 */
public class KeyListenerTest {
  /*
     键盘事件 : KeyListener
  */
  public static void main(String[] args) {
    JFrame jFrame = new JFrame();
    jFrame.setSize(500, 500);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jFrame.addKeyListener(
        new KeyListener() {
          @Override
          public void keyTyped(KeyEvent e) {
            // fn ctrl esc 上下左右
          }

          @Override
          public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (keyCode == 37) {
              System.out.println("左移动业务代码");
            } else if (keyCode == 38) {
              System.out.println("上移动业务代码");
            } else if (keyCode == 39) {
              System.out.println("右移动业务代码");
            } else if (keyCode == 40) {
              System.out.println("下移动业务代码");
            }
          }

          @Override
          public void keyReleased(KeyEvent e) {}
        });

    jFrame.setVisible(true);
  }
}
