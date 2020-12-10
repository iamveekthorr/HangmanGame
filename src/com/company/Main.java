package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Hangman Java Application
        Scanner scanner = new Scanner(System.in);
        // object creation from hangMan class
        HangMan hangMan = new HangMan();

        System.out.println("Welcome to the hangman game " +
                "\nEnter 1 to play game \nEnter 2 to view instructions \nEnter 3 to exit game ");


        int choice = scanner.nextInt();

        if( choice == 1){
            // 1) Call play game method
            hangMan.playGame();
        }else if (choice == 2){
            hangMan.displayInstructions();
        }else if (choice == 3){
            hangMan.exitGame();
        }else{
            System.out.println("Input out of range, please enter a number between 1-3");
            hangMan.playGame();
        }
    }
}
