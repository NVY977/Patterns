package piaps2;

public abstract class BuilderAnyCar {
    // Засунуть поля в отдельный класс
    public abstract int setDriver();
    public abstract int setPassenger();
    public abstract void Go();

    public abstract int createSeat();
    public abstract int createWheels();
    public abstract int createKidSeat();
}