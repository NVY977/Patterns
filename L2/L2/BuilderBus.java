package piaps2;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.random;

public class BuilderBus extends BuilderAnyCar {
    public int passengerLimit , driverLimit, countSeat, countWheels, buttons, engine;
    public String panel;
    protected ArrayList<DriverBus> drivers;
    protected ArrayList<PassengerBus> passengers;

    public BuilderBus() {
        super();
        driverLimit = 1;
        passengerLimit = 30;
        drivers = new ArrayList<>(driverLimit);
        passengers = new ArrayList<>(passengerLimit);

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
        countSeat = (int) (Math.random() * 7);
        if (countSeat > 1) {
            return countSeat;
        } else {
            System.out.println("Что-то не так. Количество мест не подходит!");
            return 0;
        }
    }


    @Override
    public int createWheels() {
        countWheels = (int) (Math.random() * 10);
        if (countWheels > 2 && countWheels < 10) {
            return countWheels;
        } else {
            System.out.println("Что-то не так! Количество мест не подходит!");
            return 0;
        }
    }

    @Override
    public int createKidSeat() {
        return 0;
    }

    @Override
    public int createEngine() {
        engine = (int) (Math.random() * 40);
        if (engine > 4) {
            return engine;
        } else {
            System.out.println("Что-то пошло не так! Автобус без двигателя!");
            return 0;
        }
    }

    @Override
    public int createButtons() {
        buttons = (int) (Math.random() * 10);
        if (buttons > 1) {
            return buttons;
        } else {
            System.out.println("Что-то пошло не так! Кнопок недостаточно!");
            return 0;
        }
    }

    @Override
    public String createPanel() {
        panel = "Была создана панель ";
        return panel;
    }

    public void Go() {
        setDriver();
        setPassenger();
        if (drivers.size() > 0 && passengers.size() > 0 && drivers.size() <= driverLimit && passengers.size() <= passengerLimit
            && countSeat!=0 && countWheels!=0 && buttons!=0 && engine!=0 && panel!=null) {
            System.out.println("Можно ехать!");
        } else {
            System.out.println("Не выполнены нужные условия");
        }
    }


    @Override
    public BuildCar build() {
        return new BuildCar(passengerLimit, driverLimit, countSeat, countWheels, buttons, engine, panel);
    }
}