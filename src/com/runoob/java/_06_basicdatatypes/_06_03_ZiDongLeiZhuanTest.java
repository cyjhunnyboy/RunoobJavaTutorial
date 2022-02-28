package com.runoob.java._06_basicdatatypes;

/**
 * 基本数据类型：自动类型转换
 *
 * @author chenyongjun
 * @since 2022-02-24
 */
public class _06_03_ZiDongLeiZhuanTest {

    public static void main(String[] args) {
        // 定义一个char类型
        char c1 = 'a';
        // char自动类型转换为int
        int i1 = c1;
        System.out.println("char自动类型转换为int后的值等于：" + i1);
        // 定义一个char类型
        char c2 = 'A';
        // char类型和int类型计算
        int i2 = c2 + 1;
        System.out.println("char类型和int计算后的值等于：" + i2);
    }
}
