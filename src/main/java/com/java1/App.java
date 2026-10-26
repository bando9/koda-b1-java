package com.java1;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("==================================================");
        System.out.println("\tKODA ENTERPRISE");
        System.out.println("==================================================");
        
        // Dependency Injection
        Employee andi = new Employee("EMP001", "Andi Pratama", "Backend Developer", "IT", 5000000);
        
        EmployeeService andiService = new EmployeeService(andi);

        andiService.showEmployee();

        andiService.giveRaise(1000000);
        
        andiService.giveRaise(-500000);


        System.out.println();
        System.out.println();

        PhysicalProduct cabai = new PhysicalProduct("C001", "Cabai 1kg", 25000, 50);
        
        DigitalProduct ebook = new DigitalProduct("E001", "Ebook", 35000);

        cabai.showInfo();
        
        ebook.showInfo();

        cabai.addStock(50);
    }
}
