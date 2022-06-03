package piaps3_2;

abstract class Component {
    public String status;
    public Component(String Status){
        status = Status;
    }
    public abstract void Add(Component component);
    public abstract void Remove(Component component);
    public abstract int getBaggage();
    public abstract void setBaggage();
    public abstract void Info();

}
