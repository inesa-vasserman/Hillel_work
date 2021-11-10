package Homework11.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook extends Record {

    public static ArrayList<Record> arrayList = new ArrayList<>();

    public static void main(String[] args) {

        Record oleg = new Record("oleg", "0552898075");
        Record sam = new Record("sam", "0552898075");
        Record viktor = new Record("viktor", "0552898075");

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

    public static ArrayList findAll(String str) {
        List<Object> listOfNames = new ArrayList<Object>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (((Record) arrayList.get(i)).getName().equals(str)) {
                listOfNames.add(arrayList.get(i));
            }
        }
        return null;
    }

}


