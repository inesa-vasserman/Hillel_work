package Homework5.details;

public class Engine {
    private int power;
    private String company;

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", company='" + company + '\'' +
                '}';
    }
}