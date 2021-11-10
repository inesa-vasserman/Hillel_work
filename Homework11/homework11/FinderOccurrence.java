package Homework11.homework11;

public class FinderOccurrence {
    public String name;
    public int occurrence;

    public FinderOccurrence(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }

    @Override
    public String toString() {
        return "FinderOccurrence{" +
                "name='" + name + '\'' +
                ", occurrence=" + occurrence +
                '}';
    }
}
