package com.company;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;
        ArrayList<Cat> cats = new ArrayList<>();



        while(true)
        {
            System.out.println("---MENU---");
            System.out.println("1. Dodaj kota.");
            System.out.println("2. Usuń kota.");
            System.out.println("3. Edytuj kota.");
            System.out.println("4. Zobacz kota.");
            System.out.println("5. Wyjdź.");

            choice = input.nextInt();

            switch (choice)
            {
                case 1 ->{
                    cats.add(new Cat("Eine", "Katze", "german", "biały", "man", 10));
                    System.out.println("dodano kota");
                }
                case 2 ->{
                    System.out.println("usunięto kota :|");
                }
                case 3 ->{
                    System.out.println("edytowano kota :|");
                }
                case 4 ->{
                    cats.forEach(System.out::println);
                    input.next();
                }
                case 5 ->{
                    System.out.println("wyjście z kota5 :|");
                }

            }
        }

    }
}
