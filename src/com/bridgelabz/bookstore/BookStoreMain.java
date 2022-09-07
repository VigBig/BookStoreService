package com.bridgelabz.bookstore;

import java.util.Scanner;

public class BookStoreMain {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Bookstore Service:");
        int choice =0 ;
        BookStore bookStore = new BookStore();

        do{

            System.out.println("Select options (1 to 2) in the menu. Entering anything else will exit:");
            System.out.println("1. Add Books");
            System.out.println("2. Display Books.");
            choice = sc.nextInt();

            switch (choice){

                case 1:
                    bookStore.addBookDetails();
//                    for (Books bookElement:
//                            bookStore.booksList) {
//
//                        System.out.println(bookElement);
//
//                    }
                    break;
                case 2:
                    bookStore.displayBooks();
                    break;
                default:
                    System.out.println("Exiting program ...");

            }

        }while(choice>=1 || choice<=2);



    }

}
