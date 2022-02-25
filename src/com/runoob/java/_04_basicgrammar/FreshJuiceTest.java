package com.runoob.java._04_basicgrammar;

/**
 * 果汁枚举类测试类
 *
 * @author chenyongjun
 * @since 2022-02-24
 */
public class FreshJuiceTest {

    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("Hello World!");
    }
}
