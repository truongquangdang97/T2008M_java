package lab1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap canh 1 : " );
        float c1 = sc.nextFloat();
        System.out.println( " nhap canh 2 :");
        float c2 = sc.nextFloat();
        System.out.println("nhap canh 3 :");
        float c3 = sc. nextFloat();

        TamGiac tg = new TamGiac();
        tg.setCanh1(c1);
        tg.setCanh2(c2);
        tg.setCanh3(c3);

        if (tg.kiemtra()){
            System.out.println("chu vi tam giac la :"+  tg.chuvi());
            System.out.println("dien tich tam giac la : "+ tg.dientich());
        }

    }
}
