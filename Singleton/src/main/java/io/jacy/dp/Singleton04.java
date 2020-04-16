package io.jacy.dp;

/**
 * 枚举, 最简单的单例
 * <p>
 * 但语义上来讲, 一般单例对象是实际的事物时, 不适合用枚举. 比如老婆, 只能有1个老婆, 搞个枚举就有点奇怪. 当然,代码没有任何问题!
 *
 * @author Jacy
 */
public enum Singleton04 {
    /**
     * instance
     */
    INSTANCE;

    public Singleton04 getInstance() {
        return INSTANCE;
    }
}