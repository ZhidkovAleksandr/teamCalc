import java.util.Scanner;

public class Calculator {

    static double calculate(int a, int b, int c) {

        double _res = (a + b + c) / 3;
        return _res;

    }

    public static void main(String[] args) {

        Scanner nSc = new Scanner(System.in);
        System.out.println("Введіть операнд a");
        int a = nSc.nextInt();
        System.out.println("Введіть операнд b");
        int b = nSc.nextInt();
        System.out.println("Введіть операнд c");
        int c = nSc.nextInt();

        System.out.println("Середнє арифметичне " + calculate(a, b, c));

        //sum test
        System.out.println("Сумма = " + (a + b + c));


    }

}
