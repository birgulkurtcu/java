package org.example;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1,"TV",1000);
        Customer customer1 = new Customer(1, "birgul");
        Student customer2 = new Student(2,"erdem");

        IBankService iBankService = new centralBankService();
        ProductManager productManager = new ProductManager(iBankService);

        productManager.sell(product1,customer1);
        productManager.sell(product1,customer2);
    }
}
