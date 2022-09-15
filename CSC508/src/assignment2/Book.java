/*
 Name : SITI NURHIDAYAH BINTI HALIZAN
Sid# : 2021477726
Course: CSC508
Group#: CS2304A
Assign#: LAB 2 (ON STACK)
Due Date: 10 JUN 2022
Program Description: Book
 */
package assignment2;

public class Book {

    private String ISBN_numbers;
    private String author;
    private String title;
    private double price;

    //default constructor
    public Book() {
        ISBN_numbers = "";
        author = "";
        title = "";
        price = 0.00;
    }

    //normal constructor
    public Book(String ISBN_numbers, String author, String title, double price) {
        this.ISBN_numbers = ISBN_numbers;
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public void setBook(String ISBN_numbers, String author, String title, double price) {
        this.ISBN_numbers = ISBN_numbers;
        this.author = author;
        this.title = title;
        this.price = price;
    }

    //retriever
    public String getISBN() {
        return ISBN_numbers;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "\nISBN Number: " + getISBN() + "\nAuthor: " + getAuthor() + "\nTitle: " + getTitle() + "\nPrice: RM " + getPrice() + "\n";
    }
}
