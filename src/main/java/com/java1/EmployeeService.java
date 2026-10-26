package com.java1;

public class EmployeeService {
    private Employee employee;

    public EmployeeService(Employee employee) {
        this.employee = employee;
    }

    public void showEmployee(){
        System.out.println("Employee ID: " + employee.employeeID);
        System.out.println("Name: " + employee.name);
        System.out.println("Position: " + employee.position);
        System.out.println("Department: " + employee.department);
        System.out.println("Salary: " + "Rp. " + employee.getSalary() + "\n");
    }

    public void giveRaise(int amount){
        employee.increaseSalary(amount);
    }

    public Employee getEmployee() {
        return employee;
    }
}
