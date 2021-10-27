import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1: Aanmaken 2 variabelen
        int age = -1;
        //int length; // double variabele toepassen
        String name;
        String address;

        // 2: Variabelen vullen met gebruikersinvoer
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Voer naam in:");
        name = inputUser.nextLine();

        System.out.println("Voer leeftijd in: ");
        //int age = input.nextInt();
        age = inputUser.nextInt();

        Scanner inputaddress = new Scanner(System.in); // extra Scanner object om bug op te lossen
        System.out.println("Voer adres in:");
        address = inputaddress.nextLine();

        System.out.println(name + ",voer lengte in, eerst meter: ");
        int lengthM = inputUser.nextInt();
        System.out.println("Voer lengte in, cm (achter de komma)");
        int lengthCM = inputUser.nextInt();


        // 3: Waarden van variabelen tonen op het scherm
        // System.out.println() toepassen
        System.out.println("Leeftijd is: " + age);
        System.out.println("Lengte is: " + lengthM + "," + lengthCM);
        System.out.println("Naam is: " + name.toUpperCase() );
        System.out.println("Naam bestaat uit: " + name.length() + " karakters ");
        System.out.println("Adres is: " + address);

    }

}
