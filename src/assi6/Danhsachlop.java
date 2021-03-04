package assi6;

import java.util.ArrayList;

public class Danhsachlop {
    String tenLop;
    Integer soHocSinh;
    ArrayList<String> Hocsinh;
    public Danhsachlop(String tenLop,Integer soHocSinh) {
        this.tenLop = tenLop;
        this.soHocSinh= soHocSinh;
        this.Hocsinh = new ArrayList<String>();
    }


    public Danhsachlop(String tenLop,Integer soHocSinh, String hocsinh) {
        this.tenLop = tenLop;
        this.soHocSinh= soHocSinh;
        this.Hocsinh = new ArrayList<String>();
        this.Hocsinh.add(hocsinh);
    }

    public Integer getSoHocSinh() {
        return soHocSinh;
    }

    public void setSoHocSinh(Integer soHocSinh) {
        this.soHocSinh = soHocSinh;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public ArrayList<String> getHocsinh() {
        return Hocsinh;
    }

    public void addHocsinh(String  hocsinh) {
        this.Hocsinh.add(hocsinh);
    }
}
