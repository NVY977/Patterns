package piaps2;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.random;

// конкретная фабрика: реализует операции, создающие конкретные объекты-продукты;
public class BuilderTaxi extends BuilderAnyCar {
    public int passengerLimit;
    public int driverLimit;
    public int countSeat;
    public int countWheels;
    public int сountKidSeat;
    protected ArrayList<DriverTaxi> drivers;
    protected ArrayList<PassengerTaxi> passengers;


    public BuilderTaxi() {
        driverLimit = 1;
        passengerLimit = 4;
        drivers = new ArrayList<DriverTaxi>(driverLimit);
        passengers = new ArrayList<PassengerTaxi>(passengerLimit);

    }

    public int setDriver() {
        new Random();
        System.out.println("Начало поездки на такси");
        if (drivers.size() < driverLimit) {
            for (int i = 0; i < random() * 1; i++) {
                drivers.add(new DriverTaxi());
            }
            System.out.println("Число водителей: " + drivers.size());
            if (drivers.size() > driverLimit) {
                System.out.println("В такси не может быть больше 2 водителей");
            } else if (drivers.size() == 0) {
                System.out.println("Такси не поедет без водителя");
            }
        }

        return drivers.size();
    }

    public int setPassenger() {
        new Random();
        if (passengers.size() < passengerLimit) {
            for (int i = 0; i < random() * 5; i++) {
                passengers.add(new PassengerTaxi());
            }
            System.out.println("Число пассажиров: " + passengers.size());
            if (passengers.size() > passengerLimit) {
                System.out.println("В такси максимум 4 пассажира");
            } else if (passengers.size() == 0) {
                System.out.println("Такси не поедет пустое");
            }
        }
        return passengers.size();
    }

    @Override
    public int createSeat() {
        new Random();
        if (countSeat == random() * 5) {
            System.out.println("Количество мест - устраивает!");
            return countSeat;
        } else {
            System.out.println("Количество не устраивает");
            return 0;
        }
    }

    @Override
    public int createWheels() {
        new Random();
        if (countWheels == random() * 5) {
            System.out.println("Количество колес - устраивает (" + countWheels + ")");
            return countWheels;
        } else {
            System.out.println("Количество не устраивает");
            return 0;
        }
    }

    @Override
    public int createKidSeat() {
        new Random();
        if (сountKidSeat == random() * 2) {
            System.out.println("Количество детских кресел - устраивает (" + сountKidSeat + ")");
            return сountKidSeat;
        } else {
            System.out.println("Количество не устраивает");
            return 0;
        }
    }

    public void Go() {
        setDriver();
        setPassenger();
        if (drivers.size() > 0 && passengers.size() > 0 && drivers.size() <= driverLimit && passengers.size() <= passengerLimit) {
            System.out.println("Можно ехать!");
        } else {
            System.out.println("Не выполнены условия");
        }
    }
}