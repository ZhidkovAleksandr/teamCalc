public class Task5 {

    static int PowerA3(int A, int B){

        return B = (int) Math.pow(A, 3);

    }

    public static void main(String[] args) {
        int b=0;

        for(int i=1; i<=5; i++){

             b =  PowerA3(i,b);
             System.out.println(b);
        }

    }

}
