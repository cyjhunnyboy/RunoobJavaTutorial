package com.runoob.java._07_variabletypes;

/**
 * Java变量类型
 *
 * @author chenyongjun
 * @since 2022-02-24
 */
public class _02_VariableTypeTest {

    /*
        类变量：allClicks
            独立于方法之外的变量，用static修饰。
     */
    static int allClicks = 0;

    /**
     * 实例变量：str
     * 独立于方法之外的变量，不过没有static修饰。
     */
    String str = "Hello World!";

    public void method() {
        /*
         * 局部变量：i
         *      类的方法中的变量。
         */
        int i = 0;
        System.out.println(str);
    }

    public static void main(String[] args) {
        _02_VariableTypeTest variable = new _02_VariableTypeTest();
        variable.method();
    }
}
