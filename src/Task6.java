import java.util.Scanner;

public class Task6 {

    static void PowerA234(int A, int B, int C, int D){

        B = (int) Math.pow(A,2);
        C = (int) Math.pow(A,3);
        D = (int) Math.pow(A,4);
        System.out.println("Ступінь числа А "  + A);
        System.out.println("друга " + B+"\n" + "третя "+ C +"\n" + "четверта " + D);
        

    }

    public static void main(String[] args) {
        int A=0;
        int B=0;
        int C=0;
        int D=0;

        Scanner nSc = new Scanner(System.in);

        for (int i = 0; i<5; i++){
            System.out.println("Введіть число");
            A = nSc.nextInt();
            PowerA234(A,B,C,D);

        }



    }
}
