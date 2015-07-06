package javacourse;

public class MercedesUnit implements CarFactory {

    @Override
    public Car createCar(String customerType, ColorType color) {
        System.out.println("Creating a Mercedes Car for customer type: " + customerType + " and color:" + color.getColor());
        Car car = new Car("Mercedes");
        Body body = new Body();
        switch (customerType) {
            case "Privileged":
                body.setTexture(true);
                body.setColor(color.getColor());
                car.setBody(body);
                break;
            case "Special":
                body.setTexture(true);
                body.setColor("Black");
                car.setBody(body);
                break;
            default:
                body.setTexture(false);
                body.setColor("White");
                car.setBody(body);
                break;
        }
        return car;
    }

}
