package Homework7.OOP;

public class Robot implements Participant {

    public Robot(int limitationJump, int limitationRun) {
        this.limitationJump = limitationJump;
        this.limitationRun = limitationRun;
    }

    public int limitationJump;
    public int limitationRun;

    public Robot() {
    }

    @Override
    public boolean jump(int heightWall) {
        if (limitationJump >= heightWall) {
            System.out.printf("%s has overcame the barrier (the jumping wall) on the distance %s%n", this.getClass().getSimpleName(), heightWall);
            return true;
        } else {
            System.out.printf("%s has not overcame the barrier (the jumping wall) on the distance %s%n", this.getClass().getSimpleName(), heightWall);
            return false;
        }
    }

    @Override
    public boolean run(int lengthRoad) {
        if (lengthRoad <= limitationRun) {
            System.out.format("%s has overcame the barrier (the running road) on the distance %s%n", this.getClass().getSimpleName(), lengthRoad);
            return true;
        } else {
            System.out.format("%s has not overcame the barrier (the running road) on the distance %s%n", this.getClass().getSimpleName(), lengthRoad);
            return true;
        }
    }
}
