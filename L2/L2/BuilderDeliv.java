package piaps2;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.random;

public class BuilderDeliv extends BuilderAnyCar {
    public int passengerLimit , driverLimit, countSeat, countWheels, engine, buttons;
    protected ArrayList<DriverDeliv> drivers;
    protected ArrayList<PassengerDeliv> passengers;


    public BuilderDeliv() {
        super();
        driverLimit = 1;
        passengerLimit = 6;
        drivers = new ArrayList<>(driverLimit);
        passengers = new ArrayList<>(passengerLimit);
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
        if (countSeat == random() * 16 && countSeat < passengers.size()) {
            return countSeat;
        } else {
            System.out.println("Количество мест не устраивает!");
            return 0;
        }
    }

    @Override
    public int createWheels() {
        new Random();
        if (countWheels == random() * 7) {
            return countWheels;
        } else {
            return 0;
        }
    }

    @Override
    public int createKidSeat() {
        return 0;
    }

    @Override
    public int createEngine() {
        new Random();
        if (engine == random() * 5 && engine >  1) {
            return engine;
        } else {
            System.out.println("Что-то пошло не так! Доставщик без двигателя!");
            return 0;
        }
    }

    @Override
    public int createButtons() {
        new Random();
        if (buttons == random() * 5 && engine > 1) {
            return buttons;
        } else {
            System.out.println("Что-то пошло не так! Кнопок недостаточно!");
            return 0;
        }
    }

    @Override
    public String createPanel() {
        return null;
    }

    @Override
    public BuildCar build() {
        return new BuildCar(passengerLimit, driverLimit, countSeat, countWheels, buttons, engine, null);
    }

    public void Go() {
        setDriver();
        setPassenger();
        if (drivers.size() > 0 && passengers.size() > 0 && drivers.size() <= driverLimit
                && passengers.size() <= passengerLimit && countSeat != 0 && countWheels !=0
                && buttons != 0 && engine != 0) {
            System.out.println("Можно ехать!");
        } else {
            System.out.println("Не выполнены условия");
        }
    }
}