package com.dea.books.aylin;


import org.springframework.stereotype.Component;

@Component
public class Book {
    private int id;
    private String name;
    private double price;
    private int pageCount;

    public Book() {
        this.id = 1;
        this.name = "James Gosling";
        this.price = 20.99;
        this.pageCount = 600;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString(){
        return "Book{ " + "id = " + id +
                ", " + "name = " + name +
                ", " + "price = " + price +
                ", " + "pageCount = " + pageCount +
                " }";
    }
}
