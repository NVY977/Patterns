package piaps2;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.random;
// конкретная фабрика: реализует операции, создающие конкретные объекты-продукты;

public class BuilderDeliv extends BuilderAnyCar {
    public int passengerLimit;
    public int driverLimit;
    public int countSeat;
    public int countWheels;
    protected ArrayList<DriverDeliv> drivers;
    protected ArrayList<PassengerDeliv> passengers;


    public BuilderDeliv() {
        driverLimit = 1;
        passengerLimit = 6;
        drivers = new ArrayList<DriverDeliv>(driverLimit);
        passengers = new ArrayList<PassengerDeliv>(passengerLimit);
    }

    public int setDriver() {
        new Random();
        System.out.println("Начало поездки на доставке");
        if (drivers.size() < driverLimit) {
            for (int i = 0; i < random() * 2; i++) {
                drivers.add(new DriverDeliv());
            }
            System.out.println("Число водителей: " + drivers.size());
            if (drivers.size() > driverLimit) {
                System.out.println("В доставке не может быть больше 1 водителя");
            } else if (drivers.size() == 0) {
                System.out.println("Такси не поедет без водителя");
            }
        }

        return drivers.size();
    }

    public int setPassenger() {
        new Random();
        if (passengers.size() < passengerLimit) {
            for (int i = 0; i < random() * 7; i++) {
                passengers.add(new PassengerDeliv());
            }
            System.out.println("Число пассажиров: " + passengers.size());
            if (passengers.size() > passengerLimit) {
                System.out.println("В доставкке максимум 6 предметов");
            } else if (passengers.size() == 0) {
                System.out.println("Такси не поедет пустое");
            }
        }
        return passengers.size();
    }

    @Override
    public int createSeat() {
        new Random();
        if (countSeat == random() * 6) {
            System.out.println("Количество мест - устраивает!");
            return countSeat;
        } else {
            return 0;
        }
    }

    @Override
    public int createWheels() {
        new Random();
        if (countWheels == random() * 7) {
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
            System.out.println("Не выполнены условия");
        }
    }
}