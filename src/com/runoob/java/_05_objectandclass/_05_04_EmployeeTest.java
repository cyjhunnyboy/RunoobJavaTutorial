package com.runoob.java._05_objectandclass;

/**
 * 员工类测试类
 *
 * @author chenyongjun
 * @since 2022-02-24
 */
public class _05_04_EmployeeTest {

    public static void main(String[] args) {
        /* 使用构造器创建两个对象 */
        _05_03_Employee empOne = new _05_03_Employee("Tom");
        _05_03_Employee empTwo = new _05_03_Employee("John");

        // 调用这两个对象的成员方法
        empOne.setAge(26);
        empOne.setDesignation("高级程序员");
        empOne.setSalary(30000);
        empOne.printEmployee();

        empTwo.setAge(21);
        empTwo.setDesignation("菜鸟程序员");
        empTwo.setSalary(5000);
        empTwo.printEmployee();
    }
}
