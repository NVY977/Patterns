package piaps3_2;

public class Stuard extends Component{

    public String name, surname, position;
    public int age;

    public Stuard(String Status, String Name, String Surname, String Position, int Age) {
        super(Status);
        name = Name;
        surname = Surname;
        position = Position;
        age = Age;
    }

    @Override
    public void Add(Component component) {

    }

    @Override
    public void Remove(Component component) {

    }

    @Override
    public int getBaggage() {
        return 0;
    }

    @Override
    public void setBaggage() { }

    @Override
    public void Info() {
        System.out.println("Status: "+status+" Name: "+name+" Surname: "+surname+" Age: "+age+" Position: "+position);
    }
}
