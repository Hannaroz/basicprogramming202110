package nl.streeksoft.novi;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showOptions();

        // Aanmaken van variabelen
        String name = "Frits";
        int grade = 10;


        // Aanmaken van student object. Variabelen kopieren naar het student object
        Student student1 = new Student();
        student1.name = name;
        student1.grade = grade;
        student1.printDetails(); // Via printDetails-methode word de informatie op het scherm getoond. Deze methode staat in de Student.java

        // Aanmaken van nog 2 student objecten, gelijk variabelen invullen.
        Student arie = new Student();
        arie.name = "Arie";
        arie.grade = 3;
        arie.printDetails();

        Student fred = new Student();
        fred.name = "Fred";
        fred.grade = 1;
        fred.printDetails();

        // Lijst aanmaken voor student objecten, gelijk vullen met 3 objecten
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(arie);
        students.add(fred);

        // Random getal creeeren
        Random rand = new Random();
        int randomNo = rand.nextInt(3);
        System.out.println("Random getal: " + randomNo);

        // Random object uit de verzameling opvragen
        Student randomStudent = students.get(randomNo);
        randomStudent.printDetails();
    }
}
