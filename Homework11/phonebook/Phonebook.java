package Homework11.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

    public static ArrayList<Record> arrayList = new ArrayList<>();

    public static void main(String[] args) {

    }

    public void addRecord(Record object) {
        arrayList.add(object);
    }

    public String findRecord(String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getName().equals(str)) {
                return arrayList.toString();
            }
        }
        return null;
    }

    public List<Record> findAll(String str) {
        List<Record> listOfNames = new ArrayList<>();
        for (Record record : arrayList) {
            if (record.getName().equals(str)) {
                listOfNames.add(record);
            }
        }
        if (listOfNames.isEmpty()) {
            return null;
        }
        return listOfNames;
    }

}


