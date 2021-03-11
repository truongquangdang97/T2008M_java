package lab8_1;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachHang {
    int id;
    String name;
    int soLuong;
    int prica;
    int total;
    String quocTich;

    ArrayList<KhachHang> list;

    public void input(){

        Scanner sc = new Scanner(System.in);
        KhachHang k = new KhachHang();

        System.out.println("nhap id");
        k.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("nhap ten");
        k.setName(sc.nextLine());
        System.out.println("nhap so luong");
        k.setSoLuong(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập quốc tịch ngươi dùng : ");
        k.setQuocTich(sc.nextLine());

        list.add(k);
    }

    public boolean checkQuocTich(){
        return getQuocTich()=="VN";
    }



    public void checkSoLuong(){
        for (KhachHang k:list){
           if (!k.getQuocTich().equals(checkQuocTich())){
               k.setTotal(k.soLuong*2000);
               System.out.println(("Tổng tiền là :")+k.total);

           }else {
               if (k.getSoLuong()<50){
                   k.setTotal(k.getSoLuong()*1000);
                   System.out.println("Tổng tiền điên là :"+k.total);
               }
               else if (k.getSoLuong()>50||k.getSoLuong()<100){
                   k.setTotal((k.soLuong-50)*1200 + 50*1000);
                   System.out.println("Tổng tiền điên là : "+k.total);
               }
               else if (k.getSoLuong()>100||k.getSoLuong()<200){
                   k.setTotal((k.soLuong-100)*1500 + (k.soLuong-50)*1200 + 50*1000);
                   System.out.println("Toongr so tien la :" +k.total);
               }
               else if (k.soLuong>200){
                   k.setTotal(  (k.soLuong-200)*200 + (k.soLuong-100)*1500 + (k.soLuong-50)*1200 + 50*1000 );
                   System.out.println("Toongr so tien la :" +k.total);
               }

           }

        }

    }









    public KhachHang() {
        list = new ArrayList<>();
    }

    public KhachHang(int id, String name, int soLuong, int prica, int total,String quocTich) {
        this.id = id;
        this.name = name;
        this.soLuong = soLuong;
        this.prica = prica;
        this.total = total;
        this.quocTich = quocTich;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getPrica() {
        return prica;
    }

    public void setPrica(int prica) {
        this.prica = prica;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }




    //    public void checkSoLuong(){
//        for (KhachHang k:list){
//            if (k.getSoLuong()<50){
//                k.setTotal(k.getSoLuong()*1000);
//                System.out.println("//////"+k.total);
//            }
//            else if (k.getSoLuong()>50||k.getSoLuong()<100){
//                k.setTotal((k.soLuong-50)*1200 + 50*1000);
//                System.out.println("Tổng tiền điên là : "+k.total);
//            }
//            else if (k.getSoLuong()>100||k.getSoLuong()<200){
//                k.setTotal((k.soLuong-100)*1500 + (k.soLuong-50)*1200 + 50*1000);
//                System.out.println("Toongr so tien la :" +k.total);
//            }
//            else if (k.soLuong>200){
//                k.setTotal(  (k.soLuong-200)*200 + (k.soLuong-100)*1500 + (k.soLuong-50)*1200 + 50*1000 );
//                System.out.println("Toongr so tien la :" +k.total);
//            }
//        }
//    }
}
