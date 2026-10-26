package com.java1;

// class
public class Employee {
    String employeeID;
    String name;
    String position;
    String department;
    // encapsulation
    private int salary;
    
    // Constructor
    public Employee(String employeeID, String name, String position, String department, int salary){
        this.employeeID = employeeID;
        this.name = name;
        this.position = position;
        this.department = department;
        this.salary = salary;
    }

    // method
    public void increaseSalary(int amount){
        System.out.println("Salary Increase: " + "Rp. " + amount);

        if(amount <= 0){
            System.out.println("Error: Kenaikan gaji harus lebih dari 0");
        } else{
            salary += amount;    
        }
        System.out.println("Current Salary: " + "Rp. " + salary + "\n");
    }

    public int getSalary(){
        return  salary;
    }
}
