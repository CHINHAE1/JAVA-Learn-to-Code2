package com.ts.frame;

import javax.swing.*;

/**
 * @Author CHINHAE @Date 2024/5/18 9:20 @PackageName:com.ts.frame @ClassName:
 * JFrameTest @Description: TODO @Version 1.0
 */
public class JFrameTest {
  public static void main(String[] args) {
    //  创建窗体对象
    JFrame jFrame = new JFrame();

    //  设置窗体标题
    jFrame.setTitle("窗口");

    //  设置窗体大小
    jFrame.setSize(600, 600);

    //  修改窗体的关闭模式
    jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    //  设置窗体可见(等其他操作完成,最后才能展示窗体)
    jFrame.setVisible(true);
  }
}
