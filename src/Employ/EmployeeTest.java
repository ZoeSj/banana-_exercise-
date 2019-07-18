package Employ;

import java.io.*;

/**
 * @Auther shengjia
 * @Create 2019/7/18
 * @description:
 **/
public class EmployeeTest {
    public static void main(String[] args) {
        Employee empOne = new Employee("zoe");
        Employee empTwo = new Employee("Jack");

        empOne.empAge(25);
        empOne.empDesignation("high coder");
        empOne.emSalary(100000);
        empOne.printEmployee();

        empTwo.empAge(22);
        empTwo.empDesignation("coder");
        empTwo.emSalary(1000);
        empTwo.printEmployee();
    }
}
