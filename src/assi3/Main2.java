package assi3;

import assi3.Cart;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args){
        Cart c= new Cart();

        c.addProduct("truong dang quang1");
        c.setGrandTotal(1234);
        c.setName("bong da ");
        c.setCity("hn");
        c.setiD(10);


        c.printCart();

        c.tinhtien();
    }

}
