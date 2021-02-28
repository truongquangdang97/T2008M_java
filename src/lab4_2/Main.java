package lab4_2;

public class Main {
    public static void main(String[] args){

        Sinhvien sv1 = new Sinhvien();
        sv1.setId(1);
        sv1.setName("Trương Đăng Quang");
        sv1.setPhone("0862964851");
        sv1.setAddress("Thái Bình ");

        Sinhvien sv2 = new Sinhvien();
        sv2.setId(2);
        sv2.setName("Hoàng Anh Tú  ");
        sv2.setPhone("123456789");
        sv2.setAddress("Ba Vi");

        Sinhvien sv3 = new Sinhvien();
        sv3.setId(3);
        sv3.setName("Bùi chí Thanh ");
        sv3.setPhone("22222222");
        sv3.setAddress("Cao Bằng  ");

        Sinhvien sv4 = new Sinhvien();
        sv4.setId(4);
        sv4.setName("Diệp Minh Tuấn   ");
        sv4.setPhone("0862964851");
        sv4.setAddress("Quảng Ninh ");

        Sinhvien sv5 = new Sinhvien();
        sv5.setId(5);
        sv5.setName("Đoàn Minh Đức   ");
        sv5.setPhone("0862964851");
        sv5.setAddress("Quảng Ninh ");
        //////////////////////////////////////////
        Lophoc lh = new Lophoc();
        lh.setClassId(1);
        lh.setClassName("Nhóm 1");

        lh.addSinhvien(sv1);
        lh.addSinhvien(sv2);
        lh.addSinhvien(sv3);
        lh.addSinhvien(sv4);
        lh.addSinhvien(sv5);









        System.out.println("thong tin sinh vien trong lop la");
        for (Sinhvien sv : lh.getSinhvienList()){
            System.out.println("số "+sv.getId()+":"+sv.getName()+":"+sv.getPhone()+":"+sv.getAddress());
        }



    }
}
