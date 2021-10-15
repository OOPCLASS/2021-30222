package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
        List<Integer> winningNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            while (true) {
                int winningNumber = random.nextInt(49) + 1;
                if (!winningNumbers.contains(winningNumber)) {
                    winningNumbers.add(winningNumber);
                    break;
                }
            }
        }
        System.out.println("Enter your 6 numbers between 1 and 49");
        Scanner scanner = new Scanner(System.in);
        List<Integer> guessedNumbers = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            if (i > 0) {
                System.out.println("Your current numbers are: " + guessedNumbers);
                System.out.println("Enter another number!");
            }
            while (true) {
                try {
                    String numberString = scanner.nextLine();
                    int number = Integer.parseInt(numberString);
                    if (number >= 1 && number <= 49) {
                        guessedNumbers.add(number);
                        break;
                    } else {
                        System.out.println(number + " is not between 1 and 49. Try again! ");
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("That's not a number! Please try again!");
                }
            }
        }
        System.out.println("The winning numbers are: " + winningNumbers);
        System.out.println("Your numbers are: " + guessedNumbers);
        guessedNumbers.retainAll(winningNumbers);
        System.out.println("Your matched numbers are: " + guessedNumbers);
        if(guessedNumbers.containsAll(winningNumbers)) {
            System.out.println("You won the big prize!");
        }
        else
            System.out.println("You lost the big prize!");
    }
}
