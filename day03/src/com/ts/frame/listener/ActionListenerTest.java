package com.ts.frame.listener;

import javax.swing.*;

/**
 * @Author CHINHAE @Date 2024/5/18 10:20 @PackageName:com.ts.frame.listener @ClassName:
 * ActionListenerTest @Description: TODO @Version 1.0
 */
public class ActionListenerTest {
  /*
         动作事件：ActionListener

         1.鼠标点击    2.空格按键
  */
  public static void main(String[] args) {
    //  创建窗体对象
    JFrame jFrame = new JFrame();

    //  设置窗体标题
    jFrame.setTitle("窗口");

    //  设置窗体大小
    jFrame.setSize(500, 500);

    //  修改窗体的关闭模式
    jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    //  取消窗体的默认布局
    //  注意：如果取消了窗体的默认布局，就需要手动指定组件的摆放位置了
    jFrame.setLayout(null);

    //  创建按钮对象  创建一个带文本的按钮
    JButton jButton = new JButton("登录");

    //  设置按钮的位置和大小 (x,y代表坐标)
    jButton.setBounds(0, 0, 100, 100);

    //  将按钮添加到窗体的 [面板对象] 中
    jFrame.getContentPane().add(jButton);

    //  监听源
    jButton.addActionListener(
            e -> System.out.println("点击了按钮"));

    //  设置窗体可见(等其他操作完成,最后才能展示窗体)
    jFrame.setVisible(true);
  }
}
