package quanly;

import java.util.Arrays;

public class QuanLyCar implements Manage<Car> {
    private Car[] list = new Car[3];
    private int size = 0;

    @Override
    public void add(Car car) {
        list[size] = car;
        size++;
    }

    @Override
    public void edit(String name, Car car) {
        list[find(name)] = car;
    }

    @Override
    public int delete(String name) {
        int viTri = find(name);
        if (viTri != -1) {
            list[viTri] = null;
        } else {
            System.out.println("Không tìm thấy!!!");
        }
        return -1;
    }

    @Override
    public void arrange() {
        Arrays.sort(list);
    }

    @Override
    public int find(String name) {
        for (int i = 0; i < size; i++) {
            if (name == list[i].getName()) {
                return i;
            }
        }
        return -1;

    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(list[i]);
        }
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        QuanLyCar quanLyCar = new QuanLyCar();
        Car car1 = new Car("Mec", "Đen", "G63-Hiền Hồ", 1300000000, 4);
        Car car2 = new Car("Mazda", "Đen Ánh Đỏ", "Mazda-CX8", 1000000000, 7);
        Car car3 = new Car("HonDa", "Trắng", "Civic", 500000000, 4);
        quanLyCar.add(car1);
        quanLyCar.add(car2);
        quanLyCar.add(car3);
        quanLyCar.print();
        Car car4 = new Car("Vinfast", "Xanh Ngọc", "LuxA2.0", 1300000000, 4);
        quanLyCar.edit("Civic", car4);
        quanLyCar.print();
        System.out.println(quanLyCar.find("G63-Hiền Hồ"));
        quanLyCar.arrange();
        quanLyCar.print();

    }
}
