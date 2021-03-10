package assi3_1;

public class Main {
    public static void main(String[] args){
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("nha");
        p1.setSoLuong(7);
        p1.setPrice(1000);


        Product p2 = new Product();
        p2.setId(2);
        p2.setName("Oto");
        p2.setSoLuong(1);
        p2.setPrice(100);

        Cart c = new Cart();
        c.setIdKhachHang(1);
        c.setCity("Ha Noi");

        c.add(p1);
        c.add(p1);
        c.add(p2);

        c.Total();

        System.out.println("danh sach gio hang 1");
        for (Product p : c.list){
            System.out.println(p.getId()+"-"+p.getName()+"-"+p.getSoLuong()+"-"+p.getPrice());
        }

    }
}
