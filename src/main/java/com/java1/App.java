package com.java1;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("==================================================");
        System.out.println("\tKODA ENTERPRISE");
        System.out.println("==================================================");
        
        Employee andi = new Employee("EMP001", "Andi Pratama", "Backend Developer", "IT", 5000000);
        
        EmployeeService andiService = new EmployeeService(andi);

        andiService.showEmployee();

        andiService.giveRaise(1000000);
        
        andiService.giveRaise(-500000);

    }
}
