package javacourse;

public class PorscheUnit implements CarFactory {

    @Override
    public Car createCar(String customerType, ColorType color) {
        System.out.println("Creating a Porsche Car for customer type: " + customerType + " and color:" + color.getColor());
        Car car = new Car("Porsche");
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
