package com.hillel.hw3;

//1) Создать класс Person у котороего есть 3 поля - фамилия, имя, отчество.
//  Создать 2 конструктора - одни на все поля, во второй задается строка типа "Иванов Иван Иванович", он ее должен распарсить и задать значения полям.

public class Person {
    private String surname = "null";
    private String firstName = "null";
    private String secondName = "null";

    public Person(String surname, String firstName, String secondName) {
        this.surname = surname;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    public Person(String surname) {
        String[] personal = surname.split(" ");
        this.surname = personal[0];
        this.firstName = personal[1];
        this.secondName = personal[2];
    }
}


