package abc;

public class abc2 {
    int a;
    int b;
    int c;
    double cv;
    double p;
    double s;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    void run(){
        System.out.printf("Cạnh thứ 1: " + a + "\n" + "Cạnh thứ 2: " + b + "\n" + "Cạnh thứ 3: " + c + "\n");
    }



    boolean checkTriangle(){
        if(a + b > c && b + c > a && a + c > b){
            cv = a + b + c;
            p = cv / 2;
            s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return true;
        }
        return false;
    }
}
