package piaps1;

public abstract class BoardAnyCar {
    protected int passengerLimit;
    protected int driverLimit;

    public abstract int boardDriver();

    public abstract int boardPassenger();

    public abstract void Go();

}
