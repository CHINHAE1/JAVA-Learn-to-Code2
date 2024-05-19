package com.ts.stonepuzzle;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.*;

/**
 * @Author CHINHAE @Date 2024/5/19 15:34 @PackageName:com.ts.stonepuzzle @ClassName:
 * MainFrame @Description: TODO @Version 1.0
 */
public class MainFrame extends JFrame implements KeyListener {

  /*
   数据在数组中改变之后，界面需要重新刷新
     1.每一次移动之后，调用paintView重新绘制界面
     2.paintView方法中，加载图片资源之前，需要将现有的组件移除
         getContentPane().removeAll();
     3.加载后，需要刷新界面
  */

  int[][] data = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0}};

  int row; //  0号元素行坐标位置
  int column; //  0号元素列坐标位置
  int count;  //  统计步数

  public MainFrame() {

    //  窗体对象.addKeyListener(addKeyListener实现类对象);
    //  this : 当前类对象
    //  1.窗体对象
    //  2.KeyListener实现类对象
    this.addKeyListener(this);
    //  初始化窗体
    initFrame();
    //  初始化数据
    initData();
    //  绘制游戏界面
    paintView();
    //  设置窗体可见
    setVisible(true);
  }

  /** 初始化数据(打乱二维数组) */
  public void initData() {
    //  准备Random对象
    Random random = new Random();
    //  遍历二维数组,获取到每一个元素
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) {
        int randomX = random.nextInt(4);
        int randomY = random.nextInt(4);
        //  data[i][j]和随机索引所只想的元素进行交换
        //  data[randomX][randomY]
        int temp = data[i][j];
        data[i][j] = data[randomX][randomY];
        data[randomX][randomY] = temp;
      }
    }

    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) {
        if (data[i][j] == 0) {
          row = i;
          column = j;
        }
      }
    }
  }

  /** 此方法用于初始化窗体 */
  public void initFrame() {
    //  设置窗体大小
    setSize(514, 595);
    //  设置窗体标题
    setTitle("石头迷阵单机版v1.0");
    //  设置窗体关闭模式
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    //  设置窗体始终在最上层
    setAlwaysOnTop(true);
    //  设置窗体居中
    setLocationRelativeTo(null);

    //  取消默认布局
    setLayout(null);
  }

  /** 此方法用于绘制游戏界面 */
  public void paintView() {

    //  清除之前的内容
    super.getContentPane().removeAll();

    if (victory()){
      //  加载胜利图片资源,添加到窗体中
      JLabel winLabel = new JLabel(new ImageIcon("H:\\image\\win.png"));
      winLabel.setBounds(124, 230, 266, 88);
      getContentPane().add(winLabel);
    }

    JButton btn = new JButton("重新游戏");
    btn.setBounds(350,20,100,20);
    getContentPane().add(btn);
    btn.setFocusable(false);
    btn.addActionListener(e -> {
      count = 0;
      initData();
      paintView();
    });

    JLabel scoreLabel = new JLabel("步数为:" + count);
    scoreLabel.setBounds(50, 20, 100, 20);
    getContentPane().add(scoreLabel);

    //  设置图片
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        JLabel imageLabel = new JLabel(new ImageIcon("H:\\image\\" + data[i][j] + ".png"));
        imageLabel.setBounds(50 + 100 * j, 90 + 100 * i, 100, 100);
        getContentPane().add(imageLabel);
      }
    }

    // 设置背景图片
    JLabel background = new JLabel(new ImageIcon("H:\\image\\background.png"));
    background.setBounds(26, 30, 450, 484);
    getContentPane().add(background);

    //  刷新界面
    super.getContentPane().repaint();

  }

  /**
   * 判断游戏是否胜利
   * @return
   */
  public boolean victory() {
    int[][] win = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0}};
    for (int i = 0; i < data.length; i++) {
      for(int j = 0; j < data[i].length; j++) {
        if (data[i][j] != win[i][j]) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public void keyPressed(KeyEvent e) {
    int keyCode = e.getKeyCode();
    move(keyCode);
    paintView();
  }

  /**
   * 此方法用于处理移动业务
   *
   * @param keyCode
   */
  private void move(int keyCode) {

    if (victory()){
      return;
    }

    if (keyCode == 37 && column < 3) {
      //  空白块和右侧数据交换 实际是左移动
      //  data[row][column] data[row][column+1]
      int temp = data[row][column];
      data[row][column] = data[row][column + 1];
      data[row][column + 1] = temp;
      column++;
      count++;
    } else if (keyCode == 38 && row < 3) {
      //  空白块和下面的数据交换 实际是上移动
      //  data[row][column] data[row+1][column]
      int temp = data[row][column];
      data[row][column] = data[row + 1][column];
      data[row + 1][column] = temp;
      row++;
      count++;
    } else if (keyCode == 39 && column > 0) {
      //  空白块和左侧数据交换 实际是右移动
      //  data[row][column] data[row][column-1]
      int temp = data[row][column];
      data[row][column] = data[row][column - 1];
      data[row][column - 1] = temp;
      column--;
      count++;
    } else if (keyCode == 40 && row > 0) {
      //  空白块和上面的数据交换 实际是下移动
      //  data[row][column] data[row-1][column]
      int temp = data[row][column];
      data[row][column] = data[row - 1][column];
      data[row - 1][column] = temp;
      row--;
      count++;
    } else if (keyCode == 90) {
      //  触发作弊器
      data = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0}};
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {}

  @Override
  public void keyTyped(KeyEvent e) {}
}
