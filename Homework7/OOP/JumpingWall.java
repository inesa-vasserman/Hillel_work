package Homework7.OOP;

public class JumpingWall implements Obstacle {

    private int heightWall;

    public JumpingWall(int heightWall) {
        this.heightWall = heightWall;
    }

    public JumpingWall() {

    }

    @Override
    public boolean overcome(Participant p) {
        return p.jump(heightWall);
    }

}
