package assi1;

public class TamGiac {
    public float canh1;
    public float canh2;
    public float canh3;

    public TamGiac(){

    }

    public float getCanh1() {
        return canh1;
    }

    public void setCanh1(float canh1) {
        this.canh1 = canh1;
    }

    public float getCanh2() {
        return canh2;
    }

    public void setCanh2(float canh2) {
        this.canh2 = canh2;
    }

    public float getCanh3() {
        return canh3;
    }

    public void setCanh3(float canh3) {
        this.canh3 = canh3;
    }

    public boolean kiemTra(){
        if (getCanh1()+getCanh2()>getCanh3()&&getCanh1()+getCanh3()>getCanh2()&&getCanh3()+getCanh2()>getCanh1()){
            return true;
        }else {
            return false;
        }
    }

    public float chuVi(){
        return getCanh3()+getCanh2()+getCanh1();
    }

    public double dienTich(){
        double p = chuVi()/2;
        return Math.sqrt(p*(p-getCanh1())*(p-getCanh2())*(p-getCanh3()));
    }
}
