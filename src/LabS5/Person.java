package LabS5;

import java.util.Date;
import java.util.Scanner;

public class Person {
    //Tên, giới tính, ngày sinh, địa chỉ
    public  String name;
    public String gender;
    public String birthday;
    public  String address;

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten ");
        setName(sc.nextLine());
        System.out.println("nhap gioi tinh");
        setGender(sc.nextLine());
        System.out.println("nhap ngay thang nam sinh");
        setBirthday(sc.nextLine());
        System.out.println("nhap dia chi ");
        setAddress(sc.nextLine());
    }

    public void showInfo(){
        System.out.println("ten la "+getName());
        System.out.println("Gioi tinh " +getGender());
        System.out.println("Ngay sinh " +getBirthday());
        System.out.println("Dia chi "+ getAddress());
    }







    public Person() {
    }

    public Person(String name, String gender, String birthday, String address) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
