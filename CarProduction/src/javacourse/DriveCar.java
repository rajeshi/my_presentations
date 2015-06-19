package javacourse;

public interface DriveCar {

    public void accelarate();

    public void brake();

    public void changeGear(int gear);

    public void signalTurn(Direction direction);

    public void turn(Direction direction, double radius, double startSpeed, double endSpeed);
}
