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

    public void searchBook() {

        System.out.println("Search Book Menu:");
        System.out.println("Select options (1 to 2) in the search book menu. Entering anything else will exit:");
        System.out.println("1. Name");
        System.out.println("2. Author");
        int searchChoice = sc.nextInt();

        boolean isBookExist = false;

        if(searchChoice == 1){

            System.out.println("Enter Book Name :");
            String bookName = sc.next();

            for (Books bookElement: booksList) {

                if(bookElement.getBookName().equalsIgnoreCase(bookName)){

                    System.out.println("Book : "+bookName+" exists :");
                    System.out.println(bookElement);
                    isBookExist = true;

                }
//                else{
//                    System.out.println("Book : "+bookName+" doesn't exist.");
//                }

            }

            if(!isBookExist){
                System.out.println("Book : "+bookName+" doesn't exist.");
            }

        } else if (searchChoice == 2) {

            System.out.println("Enter Author :");
            String author = sc.next();

            for (Books bookElement: booksList) {

                if(bookElement.getAuthor().equalsIgnoreCase(author)){

                    System.out.println("Author : "+author+" exists.");
                    System.out.println(bookElement);
                    isBookExist = true;

                }
//                else{
//                    System.out.println("Book of author : "+author+" doesn't exist.");
//                }

            }

            if(!isBookExist){
                System.out.println("Book : "+author+" doesn't exist.");
            }

        }else{

            System.out.println("Exiting Search menu ...");

        }


    }
}
