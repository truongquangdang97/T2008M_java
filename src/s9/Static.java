package s9;

public class Static {
    public void run(){
        System.out.println("Chay ....");
    }
    public static boolean kiemTraSNT(int n){
        if (n<2) return false;
        for (int i=0 ;i<Math.sqrt(n);i++){
            if (n%1==0)return false;
        }
        return true;
    }
}
