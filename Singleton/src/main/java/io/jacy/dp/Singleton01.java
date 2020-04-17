package io.jacy.dp;

/**
 * 饿汉式, 先初始化实例, 之后随意使用
 *
 * @author Jacy
 */
public class Singleton01 {
    private static volatile boolean CREATED = false;
    private static final Singleton01 INSTANCE = new Singleton01();

    private Singleton01() {
        synchronized (Singleton01.class) {
            if (CREATED) {
                throw new IllegalAccessError("can not access private constructor.");
            }
            CREATED = true;
        }
    }

    public static Singleton01 getInstance() {
        return Singleton01.INSTANCE;
    }
}
