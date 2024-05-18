package com.ts.frame.button;

import javax.swing.*;

/**
 * @Author CHINHAE @Date 2024/5/18 9:39 @PackageName:com.ts.frame.button @ClassName:
 * JButtonTest @Description: TODO @Version 1.0
 */
public class JButtonTest {

  /*
      案例演示：窗体中添加按钮组件

  -----------------------------------------------
      JButton构造方法 ：

              1.public JButton（）：创建一个空白的按钮
              2.pubLic JButton（String text）：创建一个带文本的按钮

      注意：如果取消了窗体的默认布局，就需要手动指定组件的摆放位置了

  ------------------------------------------------
     案例：使用JLabeL展示文本和图片

      JLabel构造方法：
      JLabel（String text）使用指定的文本创建一个JLabel对象
      JLabel（Icon image)创建一个具有指定图像的JLabel对象
            注意：如果多个组件摆放在同一个位置,后添加的组件会被压在底部
       */
  public static void main(String[] args) {
    //  创建窗体对象
    JFrame jFrame = new JFrame();

    //  设置窗体标题
    jFrame.setTitle("窗口");

    //  设置窗体大小
    jFrame.setSize(600, 600);

    //  修改窗体的关闭模式
    jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    //  取消窗体的默认布局
    //  注意：如果取消了窗体的默认布局，就需要手动指定组件的摆放位置了
    jFrame.setLayout(null);

    //  创建按钮对象  创建一个带文本的按钮
    JButton jButton = new JButton("登录");

    //  设置按钮的位置和大小 (x,y代表坐标)
    jButton.setBounds(250,250,100,100);

    //  将按钮添加到窗体的 [面板对象] 中
    jFrame.getContentPane().add(jButton);

    //  创建JLabel展示文本
    JLabel jLabel = new JLabel("请登录");
    jLabel.setBounds(200,200,50,50);
    jFrame.getContentPane().add(jLabel);

    //  JLabel展示图片
    JLabel imgLabel = new JLabel(new ImageIcon("H:\\2.png"));
    imgLabel.setBounds(1,1,500,500);
    jFrame.getContentPane().add(imgLabel);

    //  设置窗体可见(等其他操作完成,最后才能展示窗体)
    jFrame.setVisible(true);
  }
}
