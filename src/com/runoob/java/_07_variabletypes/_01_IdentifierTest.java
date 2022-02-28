package com.runoob.java._07_variabletypes;

/**
 * Java变量类型
 *
 * @author chenyongjun
 * @since 2022-02-24
 */
public class _01_IdentifierTest {

    /*
        声明变量的语法格式如下：
            type identifier [ = value][, identifier [= value] ...] ;
     */
    public static void main(String[] args) {
        // 声明三个int型整数：a、b、c
        int a, b, c;
        // 初始化a、b、c
        a = 1;
        b = 2;
        c = 3;
        System.out.println("a, b, c的值是：" + a + ", " + b + ", " + c);

        // 声明三个整数并赋予初值
        int d = 3, e = 4, f = 5;
        System.out.println("d, e, f的值是：" + d + ", " + e + ", " + f);

        // 声明并初始化：z
        byte z = 22;
        System.out.println("z的值是：" + z);

        // 声明并初始化字符串：s
        String s = "runoob";
        System.out.println("s的值是：" + s);

        // 声明了双精度浮点型变量：pi
        double pi = 3.14159;
        System.out.println("pi的值是：" + pi);

        // 声明变量x的值是字符'x'
        char x = 'x';
        System.out.println("x的值是：" + x);
    }
}
