package assi3;

public class Main {
    public static void main(String[] args) {


        Product p1 =new Product();
        p1.setId(1);
        p1.setProductName("pocches ");
        p1.setQty(1);
        p1.setPrice(10000);

        Product p2 = new Product();
        p2.setId(2);
        p2.setProductName(" fortuner ");
        p2.setQty(20);
        p2.setPrice(20000);
        ///////////////////////////////////////////
        Cart c1= new Cart();
        c1.setId(1);
        c1.setCustomer("truong dang quang");
        c1.setCity("HN");
        c1.addProduct(p1);


        Cart c2 = new Cart();
        c2.setId(1);
        c2.setCustomer("bui thi thai");
        c2.setCity("da nang");
        c2.addProduct(p1);
        c2.addProduct(p2);
        c2.addProduct(p2);






        System.out.println("danh sach san pham cua gio hang 1 ");
        for (Product p : c1.productsList){
            System.out.println(p.getId()+":"+p.getProductName()+":"+p.getPrice());
        }

        System.out.println("tong tien la gio hang 1 " +c1.finalGrandTotal());


        System.out.println(" //////////////////////////////////////");

        System.out.println(" danh sach san pham gio hang 2");
        for (Product p : c2.productsList){
            System.out.println(p.getId()+":"+p.getPrice()+":"+p.getProductName());
        }

        System.out.println("tong tien gio hang 2 la " + c2.finalGrandTotal());





//        Product p1 = new Product();
//        p1.setId(1);
//        p1.setPrice(15000);
//        p1.setProductName("Dong ho Rolex");
//        p1.setQty(2);
//        Product p2 = new Product();
//        p2.setId(2);
//        p2.setPrice(3000);
//        p2.setProductName("Vay thoi trang");
//        p2.setQty(5);
//
//        Cart c = new Cart();
//        c.setId(1);
//        c.setCustomer("Nguyen Van A");
//        c.setCity("hai duong");
//        c.addProduct(p1);
//        c.addProduct(p1);
//        c.addProduct(p1);
//        c.addProduct(p2);
//        c.addProduct(p2);
//        c.addProduct(p2);
//        // 15000 *2 + 3000*3 = 39000 -> 39000 + 390 = 39390
//
//
//        System.out.println("Danh sach san pham:");
//        for (Product p : c.getProductList()){
//            System.out.println(p.getId()+"- "+p.getProductName()+"-"+p.getPrice());
//        }
//        System.out.println("Tong tien:"+c.finalGrandTotal());
//
//
//
//
//


    }
}
