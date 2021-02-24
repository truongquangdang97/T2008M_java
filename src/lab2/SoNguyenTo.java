package lab2;

public class SoNguyenTo {
    private int a ;

    public float getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public boolean isSoNguyenTo(int x){
        if(x<2) return false;
        int squareRoot = (int)Math.sqrt(x);
        for(int i=2;i<=squareRoot;i++){
            if(x%i==0) return false;
        }
        return true;
    }

    public int timSoNguyenToTiepTheo(){
        for(int i=a+1;true;i++){
            if(isSoNguyenTo(i)){
                return i;
            }
        }
    }
}
