package org.example;

public class Product implements IEntity {
    private int Id;
    private String Name;
    private double Price;

    public Product(int id, String name, double price) {
        Id = id;
        Name = name;
        Price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
