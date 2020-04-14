package io.jacy.dp;

/**
 * 懒汉式, 使用的时候再实例化, DCL(Double Check Lock)
 * <p>
 * volatile 必须要加, 不加cpu指令重排可能会造成单例对象属性为空:
 * <p>
 * 与new Object() 创建过程有关
 * 1. 分配内存, 成员变量设置为默认值
 * 2. 调用构造方法, 赋值成员变量
 * 3. 对象引用指向内存空间
 *
 * @author Jacy
 */
public class Singleton02 {
    private static volatile Singleton02 INSTANCE;

    private Singleton02() {
    }

    public static Singleton02 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton02.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton02();
                }
            }
        }
        return INSTANCE;
    }
}
