package assi2;


public class main {
    public static void main(String[] args) {
        Fraction pt1 = new Fraction();
        pt1.setTuSo(4);
        pt1.setMauSo(5);
        Fraction pt2 = new Fraction();
        pt2.setTuSo(5);
        pt2.setMauSo(8);

        Fraction ss = pt1.div(pt2);
        ss.printFraction();

    }
}
