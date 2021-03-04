package assi6;

import lab4_2.Lophoc;

import java.util.ArrayList;

public class MonHocDaiCuong extends MonHoc {

    public ArrayList<LopHoc> danhSachLop ;

    public MonHocDaiCuong (){
        danhSachLop =new  ArrayList<>();
    }

    @Override
    void inDanhSach() {
        for (LopHoc p : danhSachLop){
            System.out.println(p.getName());
            System.out.println(p.getSoHocSinh());
        }

    }


    @Override
    void themLopHoc(String name, int soluonghocsinh) {
        for (LopHoc l:danhSachLop){
            if (!l.getName().equals(name)){
            }
        }
        LopHoc l = new LopHoc(name,soluonghocsinh);
        danhSachLop.add(l);
    }

    @Override
    void xoaLopHoc(String name) {

    }

    @Override
    void sapXep() {

    }


}
