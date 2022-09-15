/*
 Name : 
Sid# : 
Course: CSC508
Group#: 
Assign#: LAB 2 (ON STACK)
Due Date: 10 JUN 2022
Program Description: BookApp (main)
 */
package assignment2;

import java.util.*;

public class BookApp {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {

            String isbn, author, title;
            double price = 0.00;

            Book book = new Book();

            //b: i
            MyStack stack = new MyStack();

            //b: ii
            for (int i = 0; i < 4; i++) {
                System.out.println(i + 1);
                System.out.println("Enter book ISBN number: ");
                isbn = in.nextLine();
                System.out.println("Enter book author: ");
                author = in.nextLine();
                System.out.println("Enter book title: ");
                title = in.nextLine();
                System.out.println("Enter book price: ");
                String em = in.nextLine();
                price = Double.parseDouble(em);
                System.out.println("\n");
                book = new Book(isbn, author, title, price);

                stack.push(book);
            }

            // Book[] book2 = new Book[4];
            // book2[0] = new Book("1111","Akhmal","Little Prince",420.00);
            // book2[1] = new Book("2222","Raziq","Pride and Prejudice",65.00);
            // book2[2] = new Book("3333","Arifin","Letter to God",50.00);
            // book2[3] = new Book("4444","Atiah","Norweign Wood",35.00);
            // for(int i = 0; i<4; i++)
            // {
            //     // System.out.println(book2[i].toString());
            //     stack.push(book2[i]);
            //     // System.out.println(stack.top());
            // }
            // b: iii
            MyStack temp = new MyStack();
            temp = clone(stack);

            //b: iv
            stack.displayStack();

            //b: v
            double total = 0.00;

            book = (Book) stack.top();
            while (book != null) {
                total += book.getPrice();
                book = (Book) stack.getNext();
            }
            System.out.printf("v. The total price of the book is RM %.2f", total);
            System.out.println("\n");

            // //b: vi
            double max = 0.00;
            String detailsMax = null;
            book = (Book) stack.top();
            while (book != null) {
                if (book.getPrice() > max) {
                    max = book.getPrice();
                    detailsMax = book.toString();
                }
                book = (Book) stack.getNext();
            }
            System.out.printf("vi. The most expensive book is\n" + detailsMax);    
            //"with a price of RM %.2f"
            System.out.println("\n");            

            // //b: vii
            System.out.println("vii. Book at the top of the stack.");
            System.out.println(stack.top());

            //b: viii
            System.out.println("viii. Book at the top stack has been removed\n");
            stack.pop();

            //b: ix
            System.out.println("ix.");
            stack.displayStack();

            //b: x
            String search;
            stack = clone(temp);

            System.out.println("x. Search for book via ISBN ");

            System.out.println("Enter book ISBN: ");
            search = in.nextLine();

            book = (Book) stack.top();
            while (book != null) {
                if (book.getISBN().equalsIgnoreCase(search)) {
                    System.out.println(book.toString());
                }

                book = (Book) stack.getNext();
            }

        }
    }

    public static MyStack clone(MyStack item) {
        Book book;
        MyStack cn = new MyStack();
        book = (Book) item.top();
        for (int i = 0; i < 4; i++) {
            cn.push(book);
            book = (Book) item.getNext();
        }

        return cn;
    }
}
