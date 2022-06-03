package piaps3_2;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    private final List<Component> components = new ArrayList<>();

    public Composite(String status) {
        super(status);
    }

    @Override
    public void Add(Component component) {
        components.add(component);
    }

    @Override
    public void Remove(Component component) {
        components.remove(component);
    }

    @Override
    public int getBaggage() {
        int totalSum = 0;
        for (Component component : components) {
            totalSum += component.getBaggage();
        }
        return totalSum;
    }

    @Override
    public void setBaggage() { }

    public void getBaggageFinal(int totalSum, int max){
        for (Component component : components) {
            if (totalSum > max) {
                totalSum -= component.getBaggage();
                component.setBaggage();
            }
        }
    }
    @Override
    public void Info() {
        System.out.println("------------   ------------");
        for (Component component:components){
            component.Info();
        }
    }

    public void CreateAir(){
        Pilot pilot = new Pilot("Пилот", "Николай", "Языков", "Капитан коробля", 50);
        Pilot secondPilot = new Pilot("Пилот", "Иван", "Иванов", "Второй пилот", 35);
        Stuard stewardess = new Stuard("Стюардесса", "Анна", "Васильева", "Бортпроводник", 25);
        Stuard stewardess2 = new Stuard("Стюардесса", "Виктория", "Сухумова", "Бортпроводник", 26);
        Stuard stuard= new Stuard("Стюардесса", "Иван", "Иванович", "Бортпроводник", 27);
        components.add(pilot);
        components.add(secondPilot);
        components.add(stewardess);
        components.add(stewardess2);
        components.add(stuard);
    }

    public void AddClassForPlane(int passCount, int BaggageMax){
        int maxBussines = 35, maxFirst = 60, maxEconomy = 20;
        String statusPassenger = null;
        if(BaggageMax == maxBussines){
            statusPassenger = "Пассажир бизнес класса";
        } else if (BaggageMax == maxFirst){
            statusPassenger = "Пассажир первого класса";
        } else if (BaggageMax == maxEconomy){
            statusPassenger = "Пассажир эконом класса";
        } else {
            System.out.println("С пассажиром что-то не так!");
        }

        for(int i=0; i < passCount ; i++){
            components.add(new Passenger(statusPassenger, "PassName" + (i+1), "PassSurname" +(i+1),
                    20+i, (int) (Math.random() * 55)));
        }
    }

}
