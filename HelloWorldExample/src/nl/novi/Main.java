package nl.novi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Aanmaken van een variabele
        char currentPlayerToken = 'Y';
        int age = 22;

        // Aanpassen van de variabele
        currentPlayerToken = 'Z';
        //age = 37;
        //age++;
        //age = age + 1;
        age++;

        if(age < 18) {
            System.out.println("de leeftijd is onder de 18, je mag niet gokken.");
            System.exit(0);
        }
        else {
            System.out.println("de leeftijd is boven de 18. Je mag gokken");
        }

        // Waarde van variabele weer geven op scherm
        System.out.println("De waarde van de variabele is: " + currentPlayerToken);
        System.out.println("De leeftijd is: " + age);




    }
}