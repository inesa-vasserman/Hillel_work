package Homework5.professions;

import Homework5.Person;

public class Driver extends Person {
    private int experience;
    private Person person;

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                ", person=" + person +
                '}';
    }


}