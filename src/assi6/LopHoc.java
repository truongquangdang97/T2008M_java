package assi6;

import java.util.ArrayList;

public class LopHoc {
    String name;
    int soHocSinh;

    public LopHoc() {
    }

    public LopHoc(String name, int soHocSinh) {
        this.name = name;
        this.soHocSinh = soHocSinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoHocSinh() {
        return soHocSinh;
    }

    public void setSoHocSinh(int soHocSinh) {
        this.soHocSinh = soHocSinh;
    }
}
