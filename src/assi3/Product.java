package assi3;

public class Product {
    int iD;
    String nameProduct;
    int qTy;
    int price;

    public Product() {
    }

    public int getqTy() {
        return qTy;
    }

    public void setqTy(int qTy) {
        this.qTy = qTy;
    }

    public void kiemTra(){
        if (getqTy()>0){
            System.out.println(" con hang");
        }else {
            System.out.println(" het hang ");
        }
    }
}
