package Tien_nha;

public class Main {
    public static void main(String[] agrs){
        thanh_vien tv1= new thanh_vien();
        tv1.setName("Truong Dang Quang");
        tv1.setAge(24);
        tv1.setPrice(1110);

        thanh_vien tv2 = new thanh_vien();
        tv2.setName("Tran quoc dat");
        tv2.setAge(23);
        tv2.setPrice(1410);

        thanh_vien tv3 = new thanh_vien();
        tv3.setName("dang anh tuan");
        tv3.setAge(24);
        tv3.setPrice(0);
        ///////////////////////////////

        Room r = new Room();

        r.setTienNha(4000);
        r.addThanh_vien(tv1);
        r.addThanh_vien(tv2);
        r.addThanh_vien(tv3);

        //r.hienthi();







    }
}
