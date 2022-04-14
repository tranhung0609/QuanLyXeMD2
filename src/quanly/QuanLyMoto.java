package quanly;

import java.util.Arrays;

public class QuanLyMoto implements Manage<Moto> {
    private Moto[] list = new Moto[3];
    private int size = 0;

    @Override
    public void add(Moto moto) {
        list[size] = moto;
        size++;
    }

    @Override
    public void edit(String name, Moto moto) {
        list[find(name)] = moto;
    }

    @Override
    public int delete(String name) {
        for (int i=0;i<size;i--){
            if (name == list[i].getName()){
                return i;
            }
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
        for (int i=0; i<size;i++){
            System.out.println(list[i]);
        }
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        QuanLyMoto quanLyMoto=new QuanLyMoto();
        Moto moto1= new Moto("Kawasaki","Xanh đen","H2R",800,300);
        Moto moto2= new Moto("Yamaha","Đen Nhám","R1",500,1000);
        Moto moto3= new Moto("Honda","Đỏ Đen","CBR150",80,155);
        quanLyMoto.add(moto1);
        quanLyMoto.add(moto2);
        quanLyMoto.add(moto3);
        quanLyMoto.print();
        Moto moto4= new Moto("Yamaha","Xanh ","R6",400,600);
        quanLyMoto.edit("CBR150", moto4);
        quanLyMoto.print();
        System.out.println(quanLyMoto.find("H2R"));
        quanLyMoto.arrange();
        quanLyMoto.print();


    }
}
