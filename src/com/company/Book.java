package com.company;

import java.util.Scanner;

public class Book {
    private  String bookTitle, author, description;
    private double price;
    private boolean isInStock;
    Scanner scanner = new Scanner(System.in);


    // Constructor runs when the keyword 'new' is encountered
    public Book(){
        System.out.println("The book constructor has run");
    }
    // Overloaded constructor allows us to pass parameters
    public Book(String greeting,String sender){
        this.bookTitle = bookTitle;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public String getDisplayText(){
        return "Author name: " + author + " Title: " + bookTitle + " Description: " + description;
    }


    public Double getBookOrder(){
        System.out.println("How many " + bookTitle + " books at the price of " + price +  " do you want?");
        int num = scanner.nextInt();

        return (price * num);
    }
/*

    public String displayMessage(){
        return sender + " says " + greeting;
    }
    public String getGreeting(){
        return greeting;
    }
    public void setGreeting(String greeting){
        this.greeting = greeting;
    }

*/

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }
}
