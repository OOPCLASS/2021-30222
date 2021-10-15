package com.company;

import java.util.Scanner;

public class VowelConsonantCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String!");
        String string = sc.nextLine();
        countVowels(string);
    }

    private static void countVowels(String cuvant) {
        int vowelCount = 0;
        int consonantCount = 0;
        for(int i=0; i<cuvant.length(); i++){
            if(isVowel(cuvant.charAt(i))){
                ++vowelCount;
            }
            else {
                ++consonantCount;
            }
        }
        System.out.println("Number of vowels is " + vowelCount);
        System.out.println("Number of consonants is " + consonantCount);
    }

    private static boolean isVowel(char litera) {
        litera = Character.toLowerCase(litera);
        return litera == 'a' || litera == 'e' || litera == 'i' || litera == 'o' || litera == 'u';
    }
}
