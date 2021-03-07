package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Giaovien extends Person {
    int wage;//luong
    int amount;//so luong giang day
    ArrayList<String> danhSachMonHoc;//các môn giảng dạyc;
    ArrayList<String> danhSachLop;//Danh sách lớp giảng dạy
    public void inputInfo(){
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so lương :");
        setWage(sc.nextInt());
        System.out.println("Nhao só lượng  giang day");
        setAmount(sc.nextInt());
        sc.nextLine();
        System.out.println("danh sach cac mon :");
        for (int i=0;i<amount;i++){
            danhSachMonHoc.add(sc.nextLine());
        }
    System.out.println("so luong day");
        int sl = sc.nextInt();
        sc.nextLine();
        System.out.println("danh sach lop");
        for (int i=0;i<sl;i++){
            danhSachLop.add(sc.nextLine());
        }
    }


    public void showInfo(){
        super.showInfo();
        System.out.println("Nhan duoc so luong :" + getWage());
        System.out.println("So luong giang day"+getAmount());
        System.out.println("Cac mon hoc " );
        for (String s:danhSachMonHoc)
            System.out.println(s);
        System.out.println("danh sach lop ho ");
        for (String x:danhSachLop){
            System.out.println(x);
        }



    }











    public Giaovien() {
        danhSachLop = new ArrayList<>();
        danhSachMonHoc = new ArrayList<>();
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public ArrayList<String> getDanhSachMonHoc() {
        return danhSachMonHoc;
    }

    public void setDanhSachMonHoc(ArrayList<String> danhSachMonHoc) {
        this.danhSachMonHoc = danhSachMonHoc;
    }

    public ArrayList<String> getDanhSachLop() {
        return danhSachLop;
    }

    public void setDanhSachLop(ArrayList<String> danhSachLop) {
        this.danhSachLop = danhSachLop;
    }



















//    ArrayList<String> danhSachLop;
//    double mucLuong;
//    int soMonDay;
//    ArrayList<String> danhSachMonHoc;
//
//    public Giaovien() {
//        danhSachLop = new ArrayList<>();
//        danhSachMonHoc = new ArrayList<>();
//    }
//
//    public double getMucLuong() {
//        return mucLuong;
//    }
//
//    public void setMucLuong(double mucLuong) {
//        this.mucLuong = mucLuong;
//    }
//
//    public int getSoMonDay() {
//        return soMonDay;
//    }
//
//    public void setSoMonDay(int soMonDay) {
//        this.soMonDay = soMonDay;
//    }
//
//    public void inputInfo(){
//      //  super.inputInfo();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Muc luong:");
//        setMucLuong(sc.nextDouble());
//        System.out.println("So mon day:");
//        setSoMonDay(sc.nextInt());
//        sc.nextLine();
//        System.out.println("Danh sach cac mon:");
//        for(int i=0;i<getSoMonDay();i++){
//            danhSachMonHoc.add(sc.nextLine());
//        }
//        System.out.println("So lop day:");
//        int sl = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Danh sach lop:");
//        for(int i=0;i<sl;i++){
//            danhSachLop.add(sc.nextLine());
//        }
//    }
//
//    public void showInfo(){
//      //  super.showInfo();
//        System.out.println("Muc luong:"+getMucLuong());
//        System.out.println("So mon hoc dang day:"+getSoMonDay());
//        System.out.println("Danh sach mon hoc:");
//        for(String s: danhSachMonHoc){
//            System.out.println(s);
//        }
//        System.out.println("Danh sach lop hoc:");
//        for(String s: danhSachLop){
//            System.out.println(s);
//        }
//    }


}
