package com.java1;

public class Product {
    String productCode;
    String name;
    int price;
    int stock;

    public Product(String productCode, String name, int price, int stock){
        this.productCode = productCode;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void showInfo(){
        System.out.println("\nProduct Code: " + productCode);
        System.out.println("Name: " + name);
        System.out.println("Price: " + "Rp." + price);
        System.out.println("Stock: " + stock);
    }

    public void addStock(int num){
        System.out.println("\n"+ name + "\ncurrent stock: " + stock);
        if(num <= 0){
            System.out.println("gabisa nambah stock dibawah 0 dong !");
        } else{
            stock += num;
        }
        

        System.out.println("next stock: " + stock);
    }
}
