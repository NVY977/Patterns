package piaps1;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.random;

public class BoardTaxi extends BoardAnyCar {
    protected ArrayList<DriverTaxi> drivers;
    protected ArrayList<PassengerTaxi> passengers;


    public BoardTaxi() {
        driverLimit = 1;
        passengerLimit = 4;
        drivers = new ArrayList<DriverTaxi>(driverLimit);
        passengers = new ArrayList<PassengerTaxi>(passengerLimit);

    }

    public int boardDriver() {
        new Random();
        System.out.println("Начало поездки на такси");
        if (drivers.size() < driverLimit) {
            for (int i = 0; i < random() * 2; i++) {
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

    public int boardPassenger() {
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

    public void Go() {
        boardDriver();
        boardPassenger();
        if (drivers.size() > 0 && passengers.size() > 0 && drivers.size() <= driverLimit && passengers.size() <= passengerLimit) {
            System.out.println("Можно ехать!");
        } else {
            System.out.println("Не выполнены условия");
        }
    }
}