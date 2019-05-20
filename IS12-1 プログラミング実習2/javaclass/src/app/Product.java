package app;

import java.time.LocalDate;

public class Product{
    private String number;
    private String name;
    private int price;
    private LocalDate date;
    private boolean stock;

    Product(String number, String name, int price, LocalDate date, boolean stock) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.date = date;
        this.stock = stock;
    }
}