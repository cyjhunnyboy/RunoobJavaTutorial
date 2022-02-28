package com.runoob.java._07_variabletypes;

/**
 * 实例变量
 *
 * @author chenyongjun
 * @since 2022-02-24
 */
public class _07_04_EmployeeTest {

    /*
        这个实例变量对子类可见
     */
    public String name;

    /*
        私有变量，仅在该类可见
     */
    private double salary;

    /**
     * 在构造器中对name赋值
     *
     * @param empName 员工姓名
     */
    public _07_04_EmployeeTest(String empName) {
        name = empName;
    }

    /**
     * 设定salary的值
     *
     * @param empSalary 薪水
     */
    public void setSalary(double empSalary) {
        salary = empSalary;
    }

    /**
     * 打印信息
     */
    public void printEmp() {
        System.out.println("姓名：" + name);
        System.out.println("薪水：" + salary);
    }

    public static void main(String[] args) {
        _07_04_EmployeeTest empOne = new _07_04_EmployeeTest("Candy");
        empOne.setSalary(10000.0);
        empOne.printEmp();
    }
}
