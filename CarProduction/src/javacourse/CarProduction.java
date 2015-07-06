package javacourse;

public class CarProduction {

    public static void main(String[] args) {
        String[] customerTypes = {"Privileged", "Special", "Ordinary", "Ordinary", "Ordinary"};
        Car[] mercedesCars = new Car[customerTypes.length];
        Car[] porscheCars = new Car[customerTypes.length];
        ColorType.printAllAvailableColors();
        ColorType myColor = ColorType.IVORY_SILVER;
        Counter counter = Counter.createInstance();
        int cnt = 0;
        CarFactory mercedesUnit = new MercedesUnit();
        CarFactory porscheUnit = new PorscheUnit();
        for (String customerType : customerTypes) {
            Car mc = mercedesUnit.createCar(customerType, myColor);
            //Test the mercedes car before sending it
            mercedesCars[cnt] = mc;
            counter.updateCounter();
            Car pc = porscheUnit.createCar(customerType, myColor);
            //Test the porsche car before sending it
            porscheCars[cnt] = pc;
            cnt++;
            counter.updateCounter();
        }

        for (Car mercedesCar : mercedesCars) {
            System.out.println(mercedesCar.getName() + "=>" + mercedesCar.getBody().getColor());
        }

        int i = 0;
        do {
            System.out.println(porscheCars[i].getName() + "=>" + porscheCars[i].getBody().getColor());
            i++;
        } while (i < porscheCars.length);
        System.out.println("The number of cars produced are: " + counter.getCounter());
    }
}
