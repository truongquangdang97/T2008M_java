package LabS5;

import java.util.ArrayList;
import java.util.Scanner;

public class Giaovien extends Student {
//Danh sách lớp giảng dạy, mức lương, số môn giảng dạy, các môn giảng dạyc
    int wage;//luong
    int amount;//so luong giang day
    ArrayList<String> subjectList= new ArrayList<String>();//các môn giảng dạyc
    ArrayList<String> roomList=new ArrayList<String>();//Danh sách lớp giảng dạy

//
    public void addSubject(String a){
        subjectList.add(a);
    }

    public void addRoom(String b){
        roomList.add(b);
    }

    public void inputInfo(){
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong");
        setWage(sc.nextInt());
        System.out.println("Nhao so luong giang day");
        setAmount(sc.nextInt());
        System.out.println("nhap cac mon phai day");
    }


    public void showInfo(){
        super.showInfo();
        System.out.println("Nhan duoc so luong :" + getWage());
        System.out.println("So luong giang day"+getAmount());
                System.out.println("Cac mon dc giang day");
        for (String i:subjectList){
            System.out.println(i);
        }
        System.out.println("danh sach lop day");
        for (String b:roomList){
            System.out.println(b);
        }


    }











    public Giaovien() {
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

    public ArrayList<String> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<String> subjectList) {
        this.subjectList = subjectList;
    }

    public ArrayList<String> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<String> roomList) {
        this.roomList = roomList;
    }





}
