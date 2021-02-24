package assi2;

import java.util.Scanner;

public class Fraction {

    private int tuSo;
    public int mauSo;

    public Fraction() {

    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo!=0?mauSo:1;
    }

    public void inputFraction(){
        Scanner sc= new Scanner(System.in);
        System.out.println(" nhap tu so");
        setTuSo(sc.nextInt());
        System.out.println("nhap mau so ");
        setMauSo(sc.nextInt());
    }

    public void printFraction(){
        System.out.println("phan so "+getTuSo()+"/"+getMauSo());
    }

    public void rutGon(){
        // tim UCLN cua tu so va mau so
        int ucln = timUCLN();
        setTuSo(getTuSo()/ucln);
        setMauSo(getMauSo()/ucln);
    }

    public int timUCLN(){
        for (int i=Math.min(getTuSo(),getMauSo());i>0;i--){
            if(getTuSo()%i==0&&getMauSo()%i==0) return i;
        }
        return 1;
    }

    public Fraction add(Fraction tt){
        Fraction tong = new Fraction();
        tong.setTuSo(this.getTuSo()*tt.getMauSo() + tt.getTuSo()*this.getMauSo());
        tong.setMauSo(this.getMauSo()*tt.getMauSo());
        tong.rutGon();
        return tong;
    }

    public Fraction sud(Fraction tt){
        Fraction hieu = new Fraction();
        hieu.setTuSo(this.getTuSo()*tt.getMauSo() - tt.getTuSo()*this.getMauSo());
        hieu.setMauSo(getMauSo()*tt.getMauSo());
        hieu.rutGon();
        return hieu;
    }

    public Fraction mul(Fraction tt){
        Fraction tich = new Fraction();
        tich.setTuSo(tt.getTuSo()*this.tuSo);
        tich.setMauSo(this.getMauSo()*tt.getMauSo());
        tich.rutGon();
        return tich;
    }

    public Fraction div(Fraction tt){
        Fraction thuong = new Fraction();
        thuong.setTuSo(this.getTuSo()*tt.getMauSo());
        thuong.setMauSo(this.getMauSo()*tt.getTuSo());
        thuong.rutGon();
        return  thuong;
    }










}
