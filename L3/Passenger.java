package piaps3_2;

public class Passenger extends Component{
    public String name, surname;
    public int age, baggageKG;

    public Passenger(String Status, String Name, String Surname, int Age, int BaggageKG) {
        super(Status);
        name = Name;
        surname = Surname;
        age = Age;
        baggageKG = BaggageKG;
    }

    @Override
    public void Add(Component component) { }

    @Override
    public void Remove(Component component) { }

    @Override
    public int getBaggage() {
        return baggageKG;
    }

    @Override
    public void setBaggage() {
        baggageKG = 0;
    }

    @Override
    public void Info() {
        System.out.println("Status: "+status+" Name: "+name+" Surname: "+surname+" Age: "+age+" Baggage: "+baggageKG);
    }
}
