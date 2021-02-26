package assi3;

import java.util.ArrayList;

public class Cart {

    int iD;
    String name;
    int grandTotal;
    String city;

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

    public int getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(int grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    ArrayList<String> productList;

    String hn , hcm ;



    public Cart() {
        productList = new ArrayList<String>();
    }

    public void addProduct(String p){
        productList.add(p);
    }






    public void tinhtien (){
        if (getCity()==hn||getCity()==hcm){
            System.out.println("tong tien la :" + (getGrandTotal() +  (getGrandTotal()*1/100) )  );
        }else {
            System.out.println("tong tien la :" + (getGrandTotal() +  (getGrandTotal()*2/100) )  );

        }
    }




    public void removeProduct(int index ){
        productList.remove(index);
    }

    public void printCart(){
        for (String i : productList){
            System.out.println(i);
            System.out.println(getName());
            System.out.println(getCity());
            System.out.println(getiD());
        }
    }




}
