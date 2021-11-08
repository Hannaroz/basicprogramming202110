package nl.streeksoft.novi;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class FileManager {
    public static void writeData(String name, int age) {
        // Proberen om data weg te schrijven naar een bestand
        try {
            FileWriter writer = new FileWriter("data.txt",true);
            writer.write(name + "="); // "\r" = enter
            writer.write(age + "\r");
            writer.close();
        }
        catch(Exception ex) { // als het niets is gelukt, dan probeer ik het onderstaande:
            System.out.println("Er is iets fout gegaan");
        }
    }

    public static ArrayList<String> readData() {
        ArrayList<String> list = new ArrayList<>();

        try {
            File data = new File("data.txt");
            Scanner myFileReader = new Scanner(data);
            while(myFileReader.hasNextLine()) {
                String dataline = myFileReader.nextLine();
                list.add(dataline);
                //System.out.println(dataline);
            }
            myFileReader.close();
        }
        catch(Exception ex) {

        }
        return list;
    }


}
