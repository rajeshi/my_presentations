package javacourse;

public enum Direction {

    LEFT("Left"),
    RIGHT("Right");

    private final String direction;

    Direction(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
