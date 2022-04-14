package quanly;

public class Car extends Vehicle{
    private int seat;

    public Car() {
    }

    public Car(String firm, String color, String name, int worth, int seat) {
        super(firm, color, name, worth);
        this.seat = seat;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Car{ name " + getName()+" , Worth : " + getWorth() + " , Color : " + getColor() +
                '}';
    }
}
