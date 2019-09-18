package com.company;

import sun.font.TrueTypeFont;

import java.util.Scanner;

/*
Create a project in IntelliJ called BookApplication.

Create a Book class that allows for Book title, author, description, price and isInStock variables

The Book class shall contain private member variables, a default constructor, an overloaded constructor and a method called getDisplayText() which prints the author, title and description.



The application shall also contain getters and setters for each private member variable.

Create another class called BookApp which contains the main method. In the main method you shall create an instance of a Book and print the Author, Title and Description.



Publish your solution to GitHub and submit your GitHub url as the assignment.


 */
public class BookApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book b = new Book();
        b.setAuthor("Yusuke Sugomori");
        b.setBookTitle("Java Deep Learning Essentials");
        b.setDescription("This is a Java Book");
        b.setPrice(15.00);
        b.setInStock(true);
        System.out.println(b.getDisplayText());
        System.out.println(b.getBookOrder() + "\n");


        Book b2 = new Book();
        b2.setAuthor("Edward Lavieri, Peter Verhas");
        b2.setBookTitle("Mastering Java 9");
        b2.setDescription("This is a Java Book about Java 9");
        b2.setPrice(25.00);
        b2.setInStock(true);
        System.out.println(b2.getDisplayText());
        System.out.println(b2.getBookOrder() + "\n");

        /*   g.setSender("Dave");
                g.setGreeting("Hello");
                String message = g.displayMessage();
                System.out.println(message);

                Greeting g2 = new Greeting();
                g2.setSender("Melissa");
                g2.setGreeting("Hello from Melissa");
                System.out.println(g2.getSender());
                System.out.println(g2.getGreeting());

                Greeting g3 = new Greeting("Jennifer","I like Java");
                System.out.println(g3.displayMessage()
         */
    }


}
