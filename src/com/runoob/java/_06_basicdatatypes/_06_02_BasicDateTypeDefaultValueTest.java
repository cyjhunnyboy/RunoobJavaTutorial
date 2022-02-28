package com.runoob.java._06_basicdatatypes;

/**
 * 基本数据类型默认值
 *
 * @author chenyongjun
 * @since 2022-02-24
 */
public class _06_02_BasicDateTypeDefaultValueTest {

    static byte aByte;
    static short aShort;
    static int aInt;
    static long aLong;
    static float aFloat;
    static double aDouble;
    static char aChar;
    static boolean aBoolean;
    static String string;

    public static void main(String[] args) {
        System.out.println("Byte：" + aByte);
        System.out.println("Short：" + aShort);
        System.out.println("Integer：" + aInt);
        System.out.println("Long：" + aLong);
        System.out.println("Float：" + aFloat);
        System.out.println("Double：" + aDouble);
        System.out.println("Character：" + (int) aChar);
        System.out.println("Boolean：" + aBoolean);
        System.out.println("String：" + string);
    }
}
