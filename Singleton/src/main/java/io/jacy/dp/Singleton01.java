package io.jacy.dp;

/**
 * 饿汉式, 先初始化实例, 之后随意使用
 *
 * @author Jacy
 */
public class Singleton01 {
    private static final Singleton01 INSTANCE = new Singleton01();

    private Singleton01() {
    }

    public static Singleton01 getInstance() {
        return Singleton01.INSTANCE;
    }
}
