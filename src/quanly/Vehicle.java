package quanly;

public abstract class Vehicle {
    private String firm;
    private String color;
    private String name;
    private int worth;

    public Vehicle(String firm, String color, String name, int worth) {
        this.firm = firm;
        this.color = color;
        this.name = name;
        this.worth = worth;
    }

    public Vehicle() {

    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorth() {
        return worth;
    }

    public void setWorth(int worth) {
        this.worth = worth;
    }
}
