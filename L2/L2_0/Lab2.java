package piaps2;


public class Lab2 {
    public static void main(String[] args) {
        System.out.println("--------------------------");
        BuilderTaxi Taxi = new BuilderTaxi();
        Taxi.Go();
        System.out.println("--------------------------");
        BuilderBus Bus = new BuilderBus();
        Bus.Go();
        System.out.println("--------------------------");
        //BoardDeliv Deliv = new BoardDeliv();
        //Deliv.Go();
    }
}
