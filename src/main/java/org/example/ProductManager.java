package org.example;

import java.util.Scanner;

public class ProductManager implements IProductService{
    private IBankService iBankService;
    public ProductManager(IBankService iBankService) {
        this.iBankService = iBankService;
    }

    @Override
    public void sell(Product product, Customer customer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ödemenizi TL olarak yapmak için 1'i , USD için 2'yi seçiniz ");
        int paymentType = scanner.nextInt();
        double price = product.getPrice();
        if(paymentType == 1){
            System.out.println("Ürünlerinizin toplam fiyatı: " + product.getPrice());
        }
        else if(paymentType ==2){
            price = product.getPrice();
            currencyRate currencyRate = new currencyRate(price,1);
            price = iBankService.convertRate(currencyRate);
            System.out.println("Ürünlerinizin toplam fiyatı: " + price + " USD");
        }
    }
    public void sell(Product product, Student student){
        double price = product.getPrice() * student.getDiscountRate();
        System.out.println("Ürünlerinizin toplam fiyatı: " + product.getPrice());
        System.out.println("Öğrenci indirimli fiyatınız: " + price);
    }
}

