package assi7_1;

import java.util.Scanner;

public class Student {
    String id , name , address;
    int age ;
    float gpa;

    Scanner sc = new Scanner(System.in);


    public void input(){
        System.out.println("Nhập id : ");
        setId(sc.nextLine());
        System.out.println("Nhập tên : ");
        setName(sc.nextLine());
        System.out.println("Nhập địa chỉ :  ");
        setAddress(sc.nextLine());
        System.out.println("Nhập tuổi : ");
        setAge(sc.nextInt());
        System.out.println("Nhập điểm : ");
        setGpa(sc.nextInt());
    }

    public void output(){
        System.out.println("Id : "+id);
        System.out.println("Tên : "+name);
        System.out.println("Địa chỉ : "+address);
        System.out.println("Tuổi : "+age);
        System.out.println("Điểm : "+gpa);
    }



    public Student(String id, String name, String address, int age, float gpa) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.gpa = gpa;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
