package com.runoob.java._04_basicgrammar;

/**
 * 果汁枚举类测试类
 *
 * @author chenyongjun
 * @since 2022-02-24
 */
public class _04_03_FreshJuiceTest {

    public static void main(String[] args) {
        _04_02_FreshJuice juice = new _04_02_FreshJuice();
        juice.size = _04_02_FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("Hello World!");
    }
}
