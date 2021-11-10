package Homework11.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook extends Record {

    public static ArrayList<Record> arrayList = new ArrayList<>();

    public static void main(String[] args) {

    }

    public static void addRecord(Record object) {
        arrayList.add(object);
    }

    public static String findRecord(String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (((Record) arrayList.get(i)).getName().equals(str)) {
                return arrayList.toString();
            }
        }
        return null;
    }

    public static List<Object> findAll(String str) {
        List<Object> listOfNames = new ArrayList<>();
        for (Record record : arrayList) {
            if (((Record) record).getName().equals(str)) {
                listOfNames.add(record);
            }
        }
        if (listOfNames.isEmpty()) {
            return null;
        }
        return listOfNames;
    }

}


