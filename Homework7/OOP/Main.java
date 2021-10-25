package Homework7.OOP;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = getParticipants();
        Obstacle[] obstacles = getObstacle();
        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(participant)) {
                    break;
                }
            }
        }
    }

    static Participant[] getParticipants() {
        return new Participant[]{
                new Cat(), new Human(), new Robot()
        };
    }

    static Obstacle[] getObstacle() {
        return new Obstacle[]{
                new JumpingWall(), new RunningRoad()
        };
    }

}
