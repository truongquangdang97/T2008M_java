package assi3_1;

import java.util.ArrayList;

public class Cart {
    int idKhachHang;
    double grandTotal;
    String city;
    ArrayList<Product> list;

    public Cart() {
        list = new ArrayList<>();
    }

    public Cart(int idKhachHang, double grandTotal, String city, ArrayList<Product> list) {
        this.idKhachHang = idKhachHang;
        this.grandTotal = grandTotal;
        this.city = city;
        this.list = list;
    }

    public int getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<Product> getList() {
        return list;
    }

    public void setList(ArrayList<Product> list) {
        this.list = list;
    }


    public boolean add(Product p){
        if (p.check()){
            list.add(p);
            setGrandTotal(getGrandTotal()-p.getPrice());
            p.setSoLuong(p.getSoLuong()-1);
            return true;
        }
        return false;
    }

    public boolean checkCity(){
        return getCity()=="HN"||getCity()=="HCm";
    }

    public double Total(){
        if (checkCity()){
            return  (getGrandTotal()+grandTotal*1/100);
        }
        return (getGrandTotal()+getGrandTotal()*2/100);
    }

}
