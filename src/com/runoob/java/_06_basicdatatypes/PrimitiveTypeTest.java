package com.runoob.java._06_basicdatatypes;

/**
 * 基本数据类型取值范围
 *
 * @author chenyongjun
 * @since 2022-02-24
 */
public class PrimitiveTypeTest {

    public static void main(String[] args) {
        // byte数据类型
        System.out.println("基本类型byte二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值Byte.MIN_BALUE：" + Byte.MIN_VALUE);
        System.out.println("最大值Byte.MAX_VALUE：" + Byte.MAX_VALUE);

        // short数据类型
        System.out.println("基本类型short二进制位数：" + Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值Short.MIN_BALUE：" + Short.MIN_VALUE);
        System.out.println("最大值Short.MAX_VALUE：" + Short.MAX_VALUE);

        // int数据类型
        System.out.println("基本类型int二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值Integer.MIN_BALUE：" + Integer.MIN_VALUE);
        System.out.println("最大值Integer.MAX_VALUE：" + Integer.MAX_VALUE);

        // long数据类型
        System.out.println("基本类型long二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值Long.MIN_BALUE：" + Long.MIN_VALUE);
        System.out.println("最大值Long.MAX_VALUE：" + Long.MAX_VALUE);

        // float数据类型
        System.out.println("基本类型float二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值Float.MIN_BALUE：" + Float.MIN_VALUE);
        System.out.println("最大值Float.MAX_VALUE：" + Float.MAX_VALUE);

        // double数据类型
        System.out.println("基本类型double二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值Double.MIN_BALUE：" + Double.MIN_VALUE);
        System.out.println("最大值Double.MAX_VALUE：" + Double.MAX_VALUE);

        // char数据类型
        System.out.println("基本类型char二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值Character.MIN_BALUE：" + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值Character.MAX_VALUE：" + (int) Character.MAX_VALUE);
    }
}
