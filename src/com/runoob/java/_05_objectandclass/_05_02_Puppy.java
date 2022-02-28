package com.runoob.java._05_objectandclass;

/**
 * 一个简单的Puppy类
 *
 * @author chenyongjun
 * @since 2022-02-24
 */
public class _05_02_Puppy {

    /**
     * 年龄
     */
    int puppyAge;

    /**
     * 无参构造方法
     */
    public _05_02_Puppy() {
    }

    /**
     * 带一个参数name的构造方法
     *
     * @param name 名称
     */
    public _05_02_Puppy(String name) {
        // 这个构造器仅有一个参数：name
        System.out.println("小狗的名字是：" + name);
    }

    /**
     * setXXX方法
     *
     * @param age 年龄
     */
    public void setPuppyAge(int age) {
        puppyAge = age;
    }

    /**
     * getXXX方法
     *
     * @return 年龄
     */
    public int getPuppyAge() {
        return puppyAge;
    }

    /**
     * main方法，程序入口
     *
     * @param args 字符串数组
     */
    public static void main(String[] args) {
        // 创建一个Puppy对象
        _05_02_Puppy myPuppy = new _05_02_Puppy("tommy");
        // 通过方法设定age
        myPuppy.setPuppyAge(2);
        /* 调用另一个方法获取age */
        System.out.println("小狗的年龄是：" + myPuppy.getPuppyAge());
        /* 你也可以像下面这样访问  成员变量 */
        System.out.println("小狗的年龄是：" + myPuppy.puppyAge);
    }
}
