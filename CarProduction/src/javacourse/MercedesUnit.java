package javacourse;

import annotations.GeneralInfo;

@GeneralInfo(regNum = "MER/100/001", address1 = "Test Street", city = "Test City", pin = 012345, state = "TE")
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
