package com.tang.structuralmode.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weepppp 2022/7/13 8:04
 **/
public class Manager extends Employees {

    // Composite，起组合作用

    List<Employees> employeesList = new ArrayList<Employees>();

    public Manager(String name) {
        super(name);
    }

    @Override
    public void addEmployees(Employees employees) {
        employeesList.add(employees);
    }

    void work() {
        System.out.println("我是"+name+":开始布置任务");
        for(Employees employees : employeesList){
            employees.work();
        }
    }
}
