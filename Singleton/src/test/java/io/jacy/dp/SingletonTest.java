package io.jacy.dp;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class SingletonTest {
    @Test
    public void test01() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        // 正常检测
        Assert.assertSame(Singleton01.getInstance(), Singleton01.getInstance());

        // 反射测试
        Constructor<Singleton01> c00 = Singleton01.class.getDeclaredConstructor(null);
        c00.setAccessible(true);
        Singleton01 s01 = c00.newInstance();

        Assert.assertNotSame(s01, Singleton01.getInstance());
    }

    @Test
    public void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        // 正常检测
        Assert.assertSame(Singleton02.getInstance(), Singleton02.getInstance());

        // 反射测试
        Constructor<Singleton02> c00 = Singleton02.class.getDeclaredConstructor(null);
        c00.setAccessible(true);
        Singleton02 s02 = c00.newInstance();

        Assert.assertNotSame(s02, Singleton02.getInstance());
    }

    @Test
    public void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        // 正常检测
        Assert.assertSame(Singleton03.getInstance(), Singleton03.getInstance());

        // 反射测试
        Constructor<Singleton03> c00 = Singleton03.class.getDeclaredConstructor(null);
        c00.setAccessible(true);
        Singleton03 s03 = c00.newInstance();

        Assert.assertNotSame(s03, Singleton03.getInstance());
    }

    @Test
    public void test04() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        // 正常检测
        Assert.assertSame(Singleton04.INSTANCE, Singleton04.INSTANCE);

        // 反射测试
        Constructor<Singleton04> c00 = Singleton04.class.getDeclaredConstructor();
        c00.setAccessible(true);
        Singleton04 s04 = c00.newInstance();

        Assert.assertNotSame(s04, Singleton04.INSTANCE);
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(16384));
    }
}
