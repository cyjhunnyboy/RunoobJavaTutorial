package com.runoob.java._07_variabletypes;

/**
 * Java局部变量
 *
 * @author chenyongjun
 * @since 2022-02-24
 */
public class _03_LocalVariableTest {

    public void pupAge() {
        /*
            Java 局部变量
                --局部变量声明在方法、构造方法或者语句块中；
                --局部变量在方法、构造方法、或者语句块被执行的时候创建，当它们执行完成后，变量将会被销毁；
                --访问修饰符不能用于局部变量；
                --局部变量只在声明在它的方法、构造方法或者语句块中可见；
                --局部变量在栈上分配的。
                --局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。
         */
        // 局部变量age没有初始化，编译时会报错
        // Error:(25, 15) java: 可能尚未初始化变量age
        // int age;
        int age = 0;
        age = age + 7;
        System.out.println("小狗的年龄是：" + age);
    }

    public static void main(String[] args) {
        _03_LocalVariableTest localVariable = new _03_LocalVariableTest();
        localVariable.pupAge();
    }
}
