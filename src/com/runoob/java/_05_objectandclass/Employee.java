package com.runoob.java._05_objectandclass;

/**
 * 一个简单的员工Employee类
 *
 * @author chenyongjun
 * @since 2022-02-24
 */
public class Employee {

    /**
     * 姓名
     */
    String name;

    /**
     * 年龄
     */
    int age;

    /**
     * 职位
     */
    String designation;

    /**
     * 薪水
     */
    double salary;

    /**
     * 带一个参数的构造器
     *
     * @param name 姓名
     */
    public Employee(String name) {
        this.name = name;
    }

    /**
     * 设置age的值
     *
     * @param empAge 年龄
     */
    public void setAge(int empAge) {
        age = empAge;
    }

    /**
     * 设置designation的值
     *
     * @param empDesignation 职位
     */
    public void setDesignation(String empDesignation) {
        designation = empDesignation;
    }

    /**
     * 设置salary的值
     *
     * @param empSalary 薪水
     */
    public void setSalary(double empSalary) {
        salary = empSalary;
    }

    /**
     * 向控制台打印员工信息
     */
    public void printEmployee() {
        System.out.println("员工姓名：" + name + "，年龄：" + age + "，职位：" + designation + "，薪水：" + salary);
    }
}
