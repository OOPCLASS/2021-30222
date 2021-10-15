package com.company;

import java.util.Scanner;

public class TestDrive {

    public static void main(String[] args) {
        Autovehicul masina1 = new Autovehicul ("Audi", "rosu", 60, 4, 180,6);
        Autovehicul masina2 = new Autovehicul ("BMW", "negru", 100, 5, 200,6);
        int kilometriiParcursi = 0;
        System.out.println("Starea curenta a masinii este: ");
        afisareStareCurenta(masina1);

        System.out.println("Alegeti optiunea dorita!");
        System.out.println("1. Accelerare");
        System.out.println("2. Decelerare");
        System.out.println("3. Schimbare treapta de viteza");
        System.out.println("4. Afisare numar de kilometrii parcursi");
        System.out.println("5. Oprire");

        Scanner scanner = new Scanner (System.in);

        boolean check = false;
        do{
            int optiune = scanner.nextInt();
            switch (optiune) {
                case 1 -> {
                    kilometriiParcursi++;
                    masina1.setVitezaCurenta(masina1.getVitezaCurenta() + 1);
                    System.out.println("Noua stare este ");
                    afisareStareCurenta(masina1);
                }
                case 2 -> {
                    kilometriiParcursi++;
                    masina1.setVitezaCurenta(masina1.getVitezaCurenta() - 1);
                    System.out.println("Noua stare este ");
                    afisareStareCurenta(masina1);
                }
                case 3 -> {
                    kilometriiParcursi++;
                    masina1.setTreaptaDeVitezaCurenta(2);
                    System.out.println("Noua stare este ");
                    afisareStareCurenta(masina1);
                }
                case 4 -> {
                    kilometriiParcursi++;
                    System.out.println("Kilometrii parcursi: " + kilometriiParcursi);
                    System.out.println("Noua stare este ");
                    afisareStareCurenta(masina1);
                }
                case 5 -> {
                    System.out.println("Masina a fost oprita!");
                    check = true;
                }
            }
        } while (!check);
    }


    private static void afisareStareCurenta(Autovehicul s) {
        System.out.println(s);
    }

}
