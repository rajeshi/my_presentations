package com.xpanxion.design.patterns.chain_of_responsibility.car;

public class LuxuryCar {

    private static int noOfCars = 0;
    private String serialNumber;
    private String name;
    private AcceleratingSystem acceleratingSystem;
    private Body body;
    private BrakingSystem brakingSystem;
    private ClutchingSystem clutchingSystem;
    private Engine engine;
    private Mirrors mirrors;
    private Seats seats;
    private Steering steering;
    private Tyres tyres;
    private final int maxSpeed = 100;

    public LuxuryCar(String name) {
        this.name = name;
        this.body = new Body();
        this.acceleratingSystem = new AcceleratingSystem();
        this.brakingSystem = new BrakingSystem();
        this.clutchingSystem=new ClutchingSystem();
        this.engine = new Engine();
        this.mirrors = new Mirrors();
        this.seats = new Seats();
        this.steering = new Steering();
        this.tyres = new Tyres();
        noOfCars++;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public static int getCarCount() {
        return noOfCars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AcceleratingSystem getAcceleratingSystem() {
        return acceleratingSystem;
    }

    public void setAcceleratingSystem(AcceleratingSystem acceleratingSystem) {
        this.acceleratingSystem = acceleratingSystem;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public BrakingSystem getBrakingSystem() {
        return brakingSystem;
    }

    public void setBrakingSystem(BrakingSystem brakingSystem) {
        this.brakingSystem = brakingSystem;
    }

    public ClutchingSystem getClutchingSystem() {
        return clutchingSystem;
    }

    public void setClutchingSystem(ClutchingSystem clutchingSystem) {
        this.clutchingSystem = clutchingSystem;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Mirrors getMirrors() {
        return mirrors;
    }

    public void setMirrors(Mirrors mirrors) {
        this.mirrors = mirrors;
    }

    public Seats getSeats() {
        return seats;
    }

    public void setSeats(Seats seats) {
        this.seats = seats;
    }

    public Steering getSteering() {
        return steering;
    }

    public void setSteering(Steering steering) {
        this.steering = steering;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

}
