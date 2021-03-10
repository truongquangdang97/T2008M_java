package lab8;

public class KhachHang {
    int iD;
    String  name;
    String ngayThangNam;
    String doiTuongKhachHang;//
    int soLuong;
    double donGia;
    double dinhMuc;//
    String quocTich;


    public boolean checkSoluong(){
        if (soLuong<50){
            setDonGia(soLuong*1000);
            System.out.println("Don gia :" +getDonGia());
            return true;
        }else if (soLuong>50||soLuong<100){
            setDonGia( (soLuong-50)*1200+50*1000 );
            return true;
        }else if (soLuong>100||soLuong<200){
            setDonGia( (soLuong-100)*1500 + 50*1200 + 50*1000   );
            return true;
        }else if (soLuong>200){
            setDonGia( (soLuong-200)*2000 + 100*1500 +  50*1200 + 50*1000  );
            return true;
        }
        return false;
    }

    public KhachHang() {
    }

    public KhachHang(int iD, String name, String ngayThangNam, String doiTuongKhachHang, int soLuong, double donGia, double dinhMuc, String quocTich) {
        this.iD = iD;
        this.name = name;
        this.ngayThangNam = ngayThangNam;
        this.doiTuongKhachHang = doiTuongKhachHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
        this.quocTich = quocTich;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgayThangNam() {
        return ngayThangNam;
    }

    public void setNgayThangNam(String ngayThangNam) {
        this.ngayThangNam = ngayThangNam;
    }

    public String getDoiTuongKhachHang() {
        return doiTuongKhachHang;
    }

    public void setDoiTuongKhachHang(String doiTuongKhachHang) {
        this.doiTuongKhachHang = doiTuongKhachHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
}
