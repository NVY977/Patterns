package piaps2;

public abstract class BuilderAnyCar {

    public abstract int setDriver();

    public abstract int setPassenger();

    public abstract void Go();

    public abstract int createSeat();

    public abstract int createWheels();

    public abstract int createKidSeat();

    public abstract int createEngine();

    public abstract int createButtons();

    public abstract String createPanel();

    public abstract BuildCar build();
}