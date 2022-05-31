package piaps2;

public class BuilderDirector {
    private BuilderAnyCar builder;

    public BuilderDirector(BuilderAnyCar builder) {
        super();
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("Automotive Engineer can't work without Car Builder!");
        }
    }

    public BuildCar manufactureCar() {
        builder.setPassenger();
        builder.setDriver();
        builder.createKidSeat();
        builder.createSeat();
        builder.createWheels();
        builder.createButtons();
        builder.createEngine();
        builder.createPanel();
        builder.Go();
        return builder.build();
    }
}
