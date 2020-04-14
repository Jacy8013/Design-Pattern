package io.jacy.dp;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {
    @Test
    public void test01() {
        Assert.assertSame(Singleton01.getInstance(), Singleton01.getInstance());
        Assert.assertEquals(Singleton01.getInstance(), Singleton01.getInstance());
    }
}
