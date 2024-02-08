package org.example;

public class Student  extends Customer{
    private double discountRate = 0.9;

    public Student(int id, String name) {
        super(id, name);
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
