package com.dea.books.aylin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
//    private int id;
//    private String name;
//    private double price;
//    private int pageCount;
//
//    public Book() {
//        this.id = 1;
//        this.name = "James Gosling";
//        this.price = 20.99;
//        this.pageCount = 600;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public int getPageCount() {
//        return pageCount;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public void setPageCount(int pageCount) {
//        this.pageCount = pageCount;
//    }
//
//    @Override
//    public String toString(){
//        return "Book{ " + "id = " + id +
//                ", " + "name = " + name +
//                ", " + "price = " + price +
//                ", " + "pageCount = " + pageCount +
//                " }";
//    }

//    @Value("${book.author}")
    private final Author author;

//    @Value("${book.title}")
    private final Title title;

//    @Value("${book.pages}")
//    private int pages;

//    @Value("${book.price}")
    private final Price price;


    @Autowired
    public Book(Author author, Title title, Price price){
        this.author = author;
        this.title = title;
        this.price = price;
    }
//    void printInfo(){
//        System.out.println(author);
//        System.out.println(title);
//        System.out.println(pages);
//        System.out.println(price);
//    }
    public void read() {
        System.out.println("Title: " + title.getTitle());
        System.out.println("Author: " + author.getName());
        System.out.println("Price: " + price.getPrice() + "$");
    }
}
