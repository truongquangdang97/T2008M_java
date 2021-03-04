package assi6;

public class Main {
    public static void main(String[] args){
        MonHocDaiCuong m = new MonHocDaiCuong();
        m.themLopHoc("toan",3);
        m.themLopHoc("ly ",20);
        m.themLopHoc("hoa ",30);
        m.themLopHoc("van",40);
        m.themLopHoc("su" ,20);
        m.themHs("toan","quang");
        m.themHs("toan","khai");
        m.themHs("toan","tuan");
//        m.xoaLopHoc("toan");
        m.inDanhSach();

    }
}
