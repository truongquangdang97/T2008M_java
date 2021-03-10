package assi3_1;

public class Product {
    //id, productName, qty (số lượng), price ( giá)
    int id;
    String name;
    int soLuong;
    int price;


    public Product() {
    }

    public Product(int id, String name, int soLuong, int price) {
        this.id = id;
        this.name = name;
        this.soLuong = soLuong;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean check(){
        if (getSoLuong()>0){
            System.out.println("Con hang");
            return true ;
        }
        System.out.println("Het hang");
        return false;
    }
}
