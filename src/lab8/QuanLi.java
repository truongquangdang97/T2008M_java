package lab8;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLi extends KhachHang {
    ArrayList<KhachHang> list;

    public QuanLi() {
        list = new ArrayList<>();
    }
    public void Quanli(){
        list = new ArrayList<>();
    }
    public QuanLi(ArrayList<KhachHang> list) {
        this.list = list;
    }
    public ArrayList<KhachHang> getList() {
        return list;
    }
    public void setList(ArrayList<KhachHang> list) {
        this.list = list;
    }


    public void add(){
        Scanner sc = new Scanner(System.in);
        KhachHang k = new KhachHang();
        System.out.println("Nhập id : ");
        k.setiD(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập Tên Khách  hàng :");
        k.setName(sc.nextLine());
        System.out.println("Nhập ngày tháng năm ngày  suất hoá đơn :");
        k.setNgayThangNam(sc.nextLine());
        System.out.println("Nhập đối tượng khách hàng : ");
        k.setDoiTuongKhachHang(sc.nextLine());
        System.out.println("Nhập số lượng : ");
        k.setDonGia(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập quốc tịch :");
        k.setQuocTich(sc.nextLine());
        list.add(k);
    }
    public void show(){

            for (KhachHang kh : list){
            System.out.println("Id "+kh.iD);
            System.out.println("Ten :"+kh.name);
            System.out.println("Ngay thang suat hoa don :"+kh.ngayThangNam);
            System.out.println("Don Gia :"+kh.donGia);
            }
    }


    public boolean checkQuocTich(){
        return getQuocTich()=="VN";
    }

//
    public boolean toTal(){
        if (checkQuocTich()){
            System.out.println("//////////"+checkSoluong());
        }

        return false;
    }













}
