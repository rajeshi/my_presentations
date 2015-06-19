package javacourse;

public class MercedesCar extends Car implements DriveCar {

    public MercedesCar(String name) {
        super(name);
    }

    @Override
    public void accelarate() {
        System.out.println("Mercedes - Speeding away");
    }

    @Override
    public void brake() {
        System.out.println("Mercedes - Somebody comes in my way - Slow down!!!");
    }

    @Override
    public void changeGear(int gear) {
        System.out.println("Mercedes - Shifting to gear " + gear);
    }

    @Override
    public void signalTurn(Direction direction) {
        System.out.println("Mercedes - Signalling for turn towards " + direction.getDirection());
    }

    @Override
    public void turn(Direction direction, double radius, double startSpeed, double endSpeed) {
        System.out.println("Mercedes Turning towards " + direction.getDirection() + " with a radius " + radius + " and start speed " + startSpeed + " and end speed " + endSpeed);
    }
}
