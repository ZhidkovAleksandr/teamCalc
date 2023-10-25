import java.util.Currency;
import java.util.Scanner;

public class Conversion {

    static float ConvRes(float Cur1, float Cur2){

        float nRes = 0;

        nRes = Cur1*Cur2;

        return nRes;

    }

    public static void main(String[] args) {
        Scanner nSc = new Scanner(System.in);
        System.out.println("Введіть суму");
        float Cur1 = nSc.nextFloat();
        System.out.println("Введіть курс");
        float Cur2 = nSc.nextFloat();
        nSc.close();

        float Sres = ConvRes(Cur1, Cur2);

        System.out.println("Сума "+ Cur1 + " за курсом: "+ Cur2 + " Складає: " + Sres);
    }

}
