package Homework7.OOP;

public class Human implements Participant {

    public int limitationJump;
    public int limitationRun;

    public Human(int limitationJump, int limitationRun) {
        this.limitationJump = limitationJump;
        this.limitationRun = limitationRun;
    }

    public Human() {

    }

    @Override
    public boolean jump(int heightWall, String nameBarrier) {
        if (limitationJump >= heightWall) {
            System.out.printf("The %s has overcame the barrier (%s) on the distance %s%n", this.getClass().getSimpleName(), nameBarrier, heightWall);
            return true;
        } else {
            System.out.printf("The %s has not overcame the barrier (%s) on the distance %s%n", this.getClass().getSimpleName(), nameBarrier, heightWall);
            return false;
        }
    }

    @Override
    public boolean run(int lengthRoad, String nameBarrier) {
        if (lengthRoad <= limitationRun) {
            System.out.format("The %s has overcame the barrier (%s) on the distance %s%n", this.getClass().getSimpleName(), nameBarrier, lengthRoad);
            return true;
        } else {
            System.out.format("The %s has not overcame the barrier (%s) on the distance %s%n", this.getClass().getSimpleName(), nameBarrier, lengthRoad);
            return true;
        }
    }
}
