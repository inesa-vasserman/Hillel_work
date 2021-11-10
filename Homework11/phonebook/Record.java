package Homework11.phonebook;

public class Record {
    public Record(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    private String name;
    private String phoneNumber;

    public Record() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Recording{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
