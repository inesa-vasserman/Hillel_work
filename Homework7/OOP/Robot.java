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
    public boolean jump(int heightWall, String nameBarrier) {
        if (limitationJump >= heightWall) {
            System.out.printf("%s has overcame the barrier (%s) on the distance %s%n", this.getClass().getSimpleName(), nameBarrier, heightWall);
            return true;
        } else {
            System.out.printf("%s has not overcame the barrier (%s) on the distance %s%n", this.getClass().getSimpleName(), nameBarrier, heightWall);
            return false;
        }
    }

    @Override
    public boolean run(int lengthRoad, String nameBarrier) {
        if (lengthRoad <= limitationRun) {
            System.out.format("%s has overcame the barrier (%s) on the distance %s%n", this.getClass().getSimpleName(), nameBarrier, lengthRoad);
        } else {
            System.out.format("%s has not overcame the barrier (%s) on the distance %s%n", this.getClass().getSimpleName(), nameBarrier, lengthRoad);
        }
        return true;
    }
}
