package assi7;

import java.util.Scanner;

public class SinhVien {
    int iD;
    String name;
    int age;
    String address;
    int gpa;



    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten");
        setName(sc.nextLine());
        System.out.println("nhao dia chi");
        setAddress(sc.nextLine());
        System.out.println("nhap id");
        setiD(sc.nextInt());
        System.out.println("nhao tuoi");
        setAge(sc.nextInt());
        System.out.println("nhap diem TB");
        setGpa(sc.nextInt());


    }



    public SinhVien() {
    }
    public SinhVien(int iD, String name, int age, String address, int gpa) {
        this.iD = iD;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
}
