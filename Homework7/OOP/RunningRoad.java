package Homework7.OOP;

public class RunningRoad implements Obstacle {

    private int lengthRoad;

    public RunningRoad(int lengthRoad) {
        this.lengthRoad = lengthRoad;
    }

    public RunningRoad() {

    }

    @Override
    public boolean overcome(Participant p) {
        return p.run(lengthRoad, this.getClass().getSimpleName());
    }
}
