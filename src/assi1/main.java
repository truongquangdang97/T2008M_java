package assi1;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TamGiac tg= new TamGiac();


        System.out.println("nhap canh thu 1 :");
        float c1 = sc.nextFloat();
        System.out.println("nhap canh thu 1 :");
        float c2 = sc.nextFloat();
        System.out.println("nhap canh thu 1 :");
        float c3 = sc.nextFloat();

       tg.setCanh1(c1);
       tg.setCanh2(c2);
       tg.setCanh3(c3);

       if (tg.kiemTra()){
           System.out.println("chu dien tich la : " + tg.chuVi());
           System.out.println("dien tich la :"+ tg.dienTich());
       }


    }
}
