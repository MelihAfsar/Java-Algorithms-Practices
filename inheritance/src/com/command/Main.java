package com.command;

public class Main {
    //inheritance | miras
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();
        customer.age = 11;
        employee.salary = 4520;

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.BestEmployee();
        PersonManager personManager = new PersonManager();
        personManager.List();
    }
}
