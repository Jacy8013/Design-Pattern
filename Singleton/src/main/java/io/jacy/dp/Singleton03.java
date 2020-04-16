package io.jacy.dp;

/**
 * 利用Java对内部内的使用才加载机制实现另一种懒加载方式单例模式
 * 什么时候调用{@link Singleton03#getInstance()} 什么时候加载并初始化{@link Inner#INSTANCE}
 *
 * @author Jacy
 */
public class Singleton03 {
    private Singleton03() {
    }

    public static Singleton03 getInstance() {
        return Inner.INSTANCE;
    }

    private static class Inner {
        private static final Singleton03 INSTANCE = new Singleton03();
    }
}
