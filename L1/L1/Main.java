package piaps1;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------------");
        BoardTaxi Taxi = new BoardTaxi();
        Taxi.Go();
        System.out.println("--------------------------");
        BoardBus Bus = new BoardBus();
        Bus.Go();
    }
}
