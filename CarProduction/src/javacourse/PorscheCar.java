package javacourse;

public class PorscheCar extends Car implements DriveCar {

    public PorscheCar(String name) {
        super(name);
    }

    @Override
    public void accelarate() {
        System.out.println("Porsche - Speeding away");
    }

    @Override
    public void brake() {
        System.out.println("Porsche - Somebody comes in my way - Slow down!!!");
    }

    @Override
    public void changeGear(int gear) {
        System.out.println("Porsche - Shifting to gear " + gear);
    }

    @Override
    public void signalTurn(Direction direction) {
        System.out.println("Porsche - Signalling for turn towards " + direction.getDirection());
    }

    @Override
    public void turn(Direction direction, double radius, double startSpeed, double endSpeed) {
        System.out.println("Porsche Turning towards " + direction.getDirection() + " with a radius " + radius + " and start speed " + startSpeed + " and end speed " + endSpeed);
    }
}
