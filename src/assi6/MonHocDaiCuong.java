package assi6;

import java.util.ArrayList;

public class MonHocDaiCuong extends MonHoc{

    ArrayList<Danhsachlop> danhSachLopHoc;

    public MonHocDaiCuong(){
        danhSachLopHoc = new ArrayList<Danhsachlop>();
    }

    @Override
    void themLopHoc(String name, int sohocsinh) {
        for (Danhsachlop d:danhSachLopHoc){
            if (d.getTenLop().equals(name)){
                System.out.println("da co lop"+ name);
                return;
            }
        }
        Danhsachlop d = new Danhsachlop(name,sohocsinh);
        danhSachLopHoc.add(d);
    }

    @Override
    void xoaLopHoc(String name) {
        for (Danhsachlop d:danhSachLopHoc){
            if (d.getTenLop().equals(name)){
                danhSachLopHoc.remove(d);
                return;
            }
        }
    }

    @Override
    void sapXep() {

    }

    void themHs(String name,String tenHS){
        for (Danhsachlop d:danhSachLopHoc){
            if (d.getTenLop().equals(name)){
                if (d.getSoHocSinh()>d.getHocsinh().size())
                d.addHocsinh(tenHS);
                return;
            }
        }
    }

    @Override
    void inDanhSach() {
        for (Danhsachlop p : danhSachLopHoc){
            System.out.println("lop : "+p.getTenLop());
            System.out.println("So hoc sinh :"+p.getSoHocSinh());
            System.out.println("danh sach hoc sinh :"+p.getHocsinh());
        }


    }
}
