package com.runoob.java._06_basicdatatypes;

/**
 * 基本数据类型：强制类型转换
 *
 * @author chenyongjun
 * @since 2022-02-24
 */
public class Qiangzhizhuanhuan {

    public static void main(String[] args) {
        int i1 = 123;
        // 强制类型转换为byte
        byte b1 = (byte) i1;
        System.out.println("int强制类型转换为byte后的值等于：" + b1);
    }
}
