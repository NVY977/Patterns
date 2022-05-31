package piaps2;

public class Lab2 {
    public static void main(String[] args) {
        BuilderAnyCar builder = new BuilderBus();
        BuilderDirector engineer = new BuilderDirector(builder);
        BuildCar car = engineer.manufactureCar();
        System.out.println("-------------Итог-------------");
        System.out.println(car.toString());

        System.out.println("--------------------------------------");
        BuilderAnyCar builder1 = new BuilderTaxi();
        BuilderDirector engineer1 = new BuilderDirector(builder1);
        BuildCar car1 = engineer1.manufactureCar();
        System.out.println("-------------Итог-------------");
        System.out.println(car1.toString());

        System.out.println("--------------------------------------");
        BuilderAnyCar builder2 = new BuilderDeliv();
        BuilderDirector engineer2 = new BuilderDirector(builder2);
        BuildCar car2 = engineer2.manufactureCar();
        System.out.println("-------------Итог-------------");
        System.out.println(car2.toString());
    }
}
