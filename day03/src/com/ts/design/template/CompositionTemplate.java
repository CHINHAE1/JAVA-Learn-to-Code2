package com.ts.design.template;

/**
 * @Author CHINHAE @Date 2024/5/19 4:09 @PackageName:com.ts.design.template @ClassName:
 * CompositionTemplate @Description: TODO @Version 1.0
 */
public abstract class CompositionTemplate {

  public final void write() {
    System.out.println("我的爸爸");

    body();

    System.out.println("啊~ 这就是我的爸爸~");
  }

  public abstract void body();
}
