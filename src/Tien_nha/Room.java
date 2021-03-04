package Tien_nha;

import java.util.ArrayList;

public class Room {
    double TienNha;
    ArrayList<thanh_vien> tienChiTieu= new ArrayList<thanh_vien>();

    public boolean addThanh_vien(thanh_vien tv){
        getTienChiTieu().add(tv);
        setTienNha(getTienNha()+tv.getPrice());
        return true;
    }

    public double trungBinh(){
        return getTienNha()/tienChiTieu.size();
    }

//    public void hienthi(){
//        System.out.println(+soTiencanphaidong());
//    }

    public double soTiencanphaidong(){

       return  getTienNha()/tienChiTieu.size();

    };
    public void hienthi(){
        System.out.println();
    }




    public double soTiencanphainoi(thanh_vien tv){
        return  (getTienNha()/tienChiTieu.size())-tv.getPrice();
    }











    public double getTienNha() {
        return TienNha;
    }

    public void setTienNha(double tienNha) {
        TienNha = tienNha;
    }

    public ArrayList<thanh_vien> getTienChiTieu() {
        return tienChiTieu;
    }

    public void setTienChiTieu(ArrayList<thanh_vien> tienChiTieu) {
        this.tienChiTieu = tienChiTieu;
    }
}
