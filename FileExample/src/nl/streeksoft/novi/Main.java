package nl.streeksoft.novi;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String name = "Frits Bosschert";
        int age = 36;

        for(int i = 0; i < 10; i++) {
            FileManager.writeData(name, age);
        }

        System.out.println("Inhoud van bestand:");
        ArrayList<String> names = new ArrayList<>();
        names = FileManager.readData();

        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

    }

}
