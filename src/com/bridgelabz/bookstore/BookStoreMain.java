package com.bridgelabz.bookstore;

import java.util.Scanner;

public class BookStoreMain {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Bookstore Service:");
        int choice =0 ;
        BookStore bookStore = new BookStore();

        do{

            System.out.println("Select options (1 to 4) in the menu. Entering anything else will exit:");
            System.out.println("1. Add Books");
            System.out.println("2. Display Books");
            System.out.println("3. Delete Book");
            System.out.println("4. Search Book by Name or Author");
            choice = sc.nextInt();

            switch (choice){

                case 1:
                    bookStore.addBookDetails();
                    break;
                case 2:
                    bookStore.displayBooks();
                    break;
                case 3:
                    bookStore.deleteBook();
                    break;
                case 4:
                    bookStore.searchBook();
                    break;
                default:
                    System.out.println("Exiting program ...");

            }

        }while(choice>=1 && choice<=4);



    }

}
