package piaps3_2;

public class Main {

    public static void main(String[] args) {

        Composite plane = new Composite("Сухой Супер Джет 100");
        plane.CreateAir();
        Composite FirstClass = new Composite("Первый класс");
        FirstClass.AddClassForPlane(10, 60);
        Composite BusinessClass = new Composite("Бизнесс класс");
        BusinessClass.AddClassForPlane(20, 35);
        Composite EconomyClass = new Composite("Эконом класс");
        EconomyClass.AddClassForPlane(150, 20);

        plane.Add(FirstClass);
        plane.Add(BusinessClass);
        plane.Add(EconomyClass);
        System.out.println("Вес: "+plane.getBaggage());
        int maxKG = 2400;
        if (plane.getBaggage() > maxKG)
        {
            System.out.println("Вес превышен!");
            EconomyClass.getBaggageFinal(plane.getBaggage(), maxKG);
            System.out.println("Новый вес: "+plane.getBaggage());
        }
        plane.Info();
	// write your code here
    }
}
