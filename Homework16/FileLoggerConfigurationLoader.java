package Homework16;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class FileLoggerConfigurationLoader {
    public FileLoggerConfiguration load(String filename) {
        FileLoggerConfiguration fileLoggerConfiguration = new FileLoggerConfiguration();
        try {
            HashMap<String, String> hashMap = new HashMap<>();
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] strings = data.split(":", 2);
                hashMap.put(strings[0], strings[1].trim());
            }
            myReader.close();
            fileLoggerConfiguration.initFileLoggerConfiguration(hashMap);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return fileLoggerConfiguration;
    }
}