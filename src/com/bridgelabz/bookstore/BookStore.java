package com.bridgelabz.bookstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookStore {

    static Scanner sc = new Scanner(System.in);
    List<Books> booksList = new ArrayList<>();

    public void addBookDetails() {

        Books books = new Books();

        System.out.println("Enter Book Name :");
        String bookName = sc.next();
        books.setBookName(bookName);

        System.out.println("Enter Author :");
        String author = sc.next();
        books.setAuthor(author);

        System.out.println("Enter Release Date :");
        String releaseDate = sc.next();
        books.setReleaseDate(releaseDate);

        System.out.println("Enter Genre :");
        String genre = sc.next();
        books.setGenre(genre);

        booksList.add(books);

    }


    public void displayBooks() {

        for (Books bookElement: booksList) {

            System.out.println(bookElement);

        }

    }

    public void deleteBook() {

        boolean isBookExist = false;

        System.out.println("Enter Book Name :");
        String bookName = sc.next();

        for (Books bookElement: booksList) {

            if(bookElement.getBookName().equalsIgnoreCase(bookName)){

                booksList.remove(bookElement);
                System.out.println("Book : "+bookName+" has been removed.");
                isBookExist = true;

            }

        }

        if(!isBookExist){
            System.out.println("Book : "+bookName+" doesn't exist.");
        }

    }
}
