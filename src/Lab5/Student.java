package Lab5;

import java.util.Scanner;

public class Student extends Person  {
    //

    int maSv;
    float mark;
    String email;

    public void inputInfo(){
        super.inputInfo();
        Scanner sc = new Scanner(System.in);


        System.out.println("Nhap ma sinh vien ");
        setMaSv(sc.nextInt());
        System.out.println("nhap diem thi ");
        setMark(sc.nextFloat());
        System.out.println("Nhap Email");
        setEmail(sc.nextLine());


    }

    public void showInfo(){

        super.showInfo();

        System.out.println("Ma sinh vien :" + getMaSv());
        System.out.println("Diem sinh vien :" + getMark());
        System.out.println("Email :" + getEmail());


    }

    public boolean checkMark(){
        if (getMark()>0) {
            System.out.println("Ban da duoc trung tuyen vi tri cao nhat cua tap doan lon nhat the gioi ");
            return true;
        }
        System.out.println("khong co tuong lai");
        return false;
    }


















    public int getMaSv() {
        return maSv;
    }

    public void setMaSv(int maSv) {
        this.maSv = maSv;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
