package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Exercise 15 Solution
 *  Copyright 2021 Drake Scott
 */

public class passwordclass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String password = "abc$123";

        System.out.print("What is the password? ");
        String attempt = input.nextLine();

        if(attempt.equals(password)){
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");
        }
    }
}
