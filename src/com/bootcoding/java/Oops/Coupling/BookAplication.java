package com.bootcoding.java.Oops.Coupling;

public class BookAplication {
    public static void main(String[] args) {
        // dependency - Author
        Author author = new Author();
        author.name = "Bootcoding";
        author.education = "B.E CSE";
        author.phone = 917123574418L;
        Book book = new Book();
        book.title = "Backend Development - Java Addiction";
        book.publisher = "Navneet";
        book.price = 500.00;
        book.author = author;
        System.out.println("Book Title: " + book.title);
        System.out.println("Book Publisher: " + book.publisher);
        System.out.println("Book Price: " + book.price);
        System.out.println("Book Author's Name: " + book.author.name);
        System.out.println("Book Author's Education: " + book.author.education);
        System.out.println("Book Author's Phone: " + book.author.phone);
    }
}
