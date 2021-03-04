package Bai_tap_kho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("nhap ten ");
        String name = sc.nextLine();

        System.out.println("Nhap luong ");
        double saraly = Double.parseDouble(sc.nextLine());

        System.out.println("Nhap so dien thoai");
        String phone = sc.nextLine();

        Emploee e = new Emploee(name,saraly,phone);
        System.out.println("input your choice ");
        int choice = Integer.parseInt(sc.nextLine());


        switch ( choice){
            case 1:
                System.out.println(e.getName());
                break;
            case 2:
                Vali v = (Vali) new Validate();
                System.out.println(v.f1(e));
                break;
            case 3:
                Vali v1 = (Vali) new Validate();
                System.out.println(v1.f2(e));
                break;
        }
    }
}
