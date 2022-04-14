package quanly;

public class Moto extends Vehicle implements  Comparable<Moto>{
    private int capacity;

    public Moto() {
    }

    public Moto(String firm, String color, String name, int worth, int capacity) {
        super(firm, color, name, worth);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Moto{ name " + getName()+" , Worth : " + getWorth() + " , Color : " + getColor() +
                " , Capacity=" + capacity +
                '}';
    }

    @Override
    public int compareTo(Moto o) {
        return this.getWorth()- o.getWorth();
    }
}
