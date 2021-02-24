package abc;

public class abc1 {
    public static void main(String[] args) {
        abc2 tg = new abc2();

        tg.setA(3);
        tg.setB(4);
        tg.setC(5);

        tg.run();
        if (tg.checkTriangle()){
            System.out.printf("là 3 cạnh của tam giác\n");
            System.out.printf("Chu vi của tam giác là: " + tg.cv);
            System.out.printf("\nDiện tích của tam giác là: " + tg.s);
        }else{
            System.out.printf("không phải 3 cạnh của tam giác");
        }
    }
}
