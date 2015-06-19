package javacourse;

public class CarProduction {

    public static void main(String[] args) {
        String[] customerTypes = {"Privileged", "Special", "Ordinary", "Ordinary", "Ordinary"};
        Car[] mercedesCars = new Car[customerTypes.length];
        Car[] porscheCars = new Car[customerTypes.length];
        ColorType.printAllAvailableColors();
        ColorType myColor = ColorType.IVORY_SILVER;
        int cnt = 0;
        CarFactory mercedesUnit = new MercedesUnit();
        CarFactory porscheUnit = new PorscheUnit();
        mercedesUnit.roofWindowImplementation();
        porscheUnit.roofWindowImplementation();
        for (int i = 0; i < customerTypes.length; i++) {
            MercedesCar mc = (MercedesCar) mercedesUnit.createCar(new MercedesCar("Mercedes AMG 63"), customerTypes[i], myColor.getColor());
            //Test the porsche car before sending it
            mc.accelarate();
            mc.brake();
            mc.changeGear(5);
            mc.signalTurn(Direction.LEFT);
            mc.turn(Direction.LEFT, 5, 20, 10);
            mercedesCars[cnt] = mc;
            PorscheCar pc = (PorscheCar) porscheUnit.createCar(new PorscheCar("Porsche 911 Carrera GTS"), customerTypes[i], myColor.getColor());
            //Test the porsche car before sending it
            pc.accelarate();
            pc.brake();
            pc.changeGear(5);
            pc.signalTurn(Direction.LEFT);
            pc.turn(Direction.LEFT, 5, 20, 10);
            porscheCars[cnt] = pc;
            cnt++;
        }

        for (Car mercedesCar : mercedesCars) {
            System.out.println(mercedesCar.getName() + "=>" + mercedesCar.getBody().getColor());
        }

        int i = 0;
        do {
            System.out.println(porscheCars[i].getName() + "=>" + porscheCars[i].getBody().getColor());
            i++;
        } while (i < porscheCars.length);
    }
}
