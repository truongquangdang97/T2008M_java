package ok;

import java.util.ArrayList;
import java.util.Scanner;

public class lop {
    ArrayList<sinhvien> list;

    public lop() {
        list= new ArrayList<>();
    }

    public lop(ArrayList<sinhvien> list) {
        this.list = list;
    }

    public ArrayList<sinhvien> getList() {
        return list;
    }

    public void setList(ArrayList<sinhvien> list) {
        this.list = list;
    }


    public void input(){
        Scanner sc = new Scanner(System.in);
        sinhvien s= new sinhvien();

        System.out.println("nhap Id");
        s.setId(sc.nextInt());
        System.out.println("Nhap ten :");
        s.setName(sc.nextInt());

        list.add(s);
    }


    public void show(){
        for (sinhvien sv :list){
            System.out.println(":::::::"+sv.getName());
        }
    }
}
