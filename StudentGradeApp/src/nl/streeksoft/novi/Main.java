package nl.streeksoft.novi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Stap 1: Aanmaken van variabelen / verzamelingen die ik later nodig heb
        String[] studentNames = new String[5];
        int[] grades = new int[5];


        // Stap 2: Vragen aan de gebruiker om gegevens in te voeren
      /*  // Onderstaande code werkt voor het invullen van 1 vakje (zonder lus)
        System.out.print("Naam: ");
        studentNames[0] = input.nextLine();
        System.out.print("Cijfer: ");
        grades[0] = input.nextInt();

       */

        // Stap 2b: Invoer van gebruiker in een while-lus
        int counter = 0;
        // while(true) is ook mogelijk, dan dienen regel 34 t/m 37 uit commentaar gehaald worden.
        while(counter < 2) {   // for-loop had ook toegepast kunnen worden: for (int counter = 0; counter < 5; counter++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Naam: ");
            studentNames[counter] = input.nextLine();
            System.out.print("Cijfer: ");
            grades[counter] = input.nextInt();

            counter++;
            /*
            if(counter == 5) {
                break;
            }*/
        }

        // Aanroep van printData-methode
        printData(studentNames, grades);
    }

    // Declaratie van printData-methode met 2 parameters
    public static void printData(String[] names, int[] grades) {
        for(int i = 0; i < names.length; i++) {
            System.out.println("Naam: " + names[i]);
            System.out.println("Cijfer: " + grades[i]);
        }
    }

}
