package piaps2;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.random;

// конкретная фабрика: реализует операции, создающие конкретные объекты-продукты;
public class BuilderBus extends BuilderAnyCar {
    public int passengerLimit;
    public int driverLimit;
    public int countSeat;
    public int countWheels;
    protected ArrayList<DriverBus> drivers;
    protected ArrayList<PassengerBus> passengers;

    public BuilderBus() {
        driverLimit = 1;
        passengerLimit = 30;
        drivers = new ArrayList<DriverBus>(driverLimit);
        passengers = new ArrayList<PassengerBus>(passengerLimit);

    }

    public int setDriver() {
        new Random();
        System.out.println("Начало поездки на автобусе");
        if (drivers.size() < driverLimit) {
            for (int i = 0; i < random() * 1; i++) {
                drivers.add(new DriverBus());
            }
            System.out.println("Количество водителей : " + drivers.size());
            if (drivers.size() == 0) {
                System.out.println("В автобусе не может быть водителей");
            } else if (drivers.size() > driverLimit) {
                System.out.println("В автобусе должно быть не больше 1 водителя");
            }
        }
        return drivers.size();
    }

    public int setPassenger() {
        new Random();
        if (passengers.size() < passengerLimit) {
            for (int i = 0; i < random() * 40; i++) {
                passengers.add(new PassengerBus());
            }
            System.out.println("количество пассажиров : " + passengers.size());
            if (passengers.size() > passengerLimit) {
                System.out.println("В автобусе должно быть до 30 человек");
            } else if (passengers.size() == 0) {
                System.out.println("Автобус не поедет пустой");
            }
        }
        return passengers.size();
    }


    @Override
    public int createSeat() {
        new Random();
        if (countSeat == random() * 40) {
            System.out.println("Количество мест - устраивает (" + countSeat + ")");
            return countSeat;
        } else {
            return 0;
        }
    }


    @Override
    public int createWheels() {
        new Random();
        if (countWheels == random() * 9) {
            System.out.println("Количество колес - устраивает (" + countWheels + ")");
            return countWheels;
        } else {
            return 0;
        }
    }

    @Override
    public int createKidSeat() {
        return 0;
    }

    public void Go() {
        setDriver();
        setPassenger();
        if (drivers.size() > 0 && passengers.size() > 0 && drivers.size() <= driverLimit && passengers.size() <= passengerLimit) {
            System.out.println("Можно ехать!");
        } else {
            System.out.println("Не выполнены нужные условия");
        }
    }
}