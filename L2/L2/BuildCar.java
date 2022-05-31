package piaps2;

import java.util.ArrayList;

public class BuildCar {
    public ArrayList<DriverBus> drivers;
    public ArrayList<PassengerBus> passengers;
    public int passengerLimit, driverLimit, countSeat, countWheels,
            buttons, engine, countKidSeat = 0;
    public String panel;

    public BuildCar(int passengerLimit, int driverLimit, int countSeat,
                    int countWheels, int buttons, int engine, String panel) {

        this.passengerLimit = passengerLimit;
        this.driverLimit = driverLimit;
        this.countSeat = countSeat;
        this.countWheels = countWheels;
        this.buttons = buttons;
        this.engine = engine;
        this.panel = panel;
    }

    @Override
    public String toString() {
        // StringBuilder class also uses Builder Design Pattern with implementation of java.lang.Appendable interface
        StringBuilder builder = new StringBuilder();
        builder.append("Pass Limit = ").append(passengerLimit).append("\nDriver Limit =").append(driverLimit)
                .append("\nSeat = ").append(countSeat).append("\nWheels = ").append(countWheels).append("\nButtons = ")
                .append(buttons).append("\nEngine = ").append(engine).append("\nKid Seat = ").append(countKidSeat)
                .append("\nPanel = ").append(panel);
        return builder.toString();
    }
}
