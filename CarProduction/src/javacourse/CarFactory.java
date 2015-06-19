package javacourse;

public abstract class CarFactory {

    public Car createCar(Car car, String customerType, String myColor) {
        if (customerType.equals("Special")) {
            car.getBody().setTexture(true);
            car.getBody().setColor("Black");
        } else if (customerType.equals("Privileged")) {
            car.getBody().setTexture(true);
            car.getBody().setColor(myColor);
        } else {
            car.getBody().setColor("White");
        }
        car.setAcceleratingSystem(new AcceleratingSystem());
        car.setBrakingSystem(new BrakingSystem());
        car.setClutchingSystem(new ClutchingSystem());
        car.setEngine(new Engine());
        car.setMirrors(new Mirrors());
        car.setSeats(new Seats());
        car.setSteering(new Steering());
        car.setTyres(new Tyres());
        return car;
    }

    public abstract void roofWindowImplementation();
}
