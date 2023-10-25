import java.util.Scanner;

public class NumbersCheck {

    static String Dil5(int mN){

        int sNumD = 2;
        String formMes = "Число " + mN+"\n";
        int i =0;
        while (i<5){
         if(mN%sNumD==0){
             formMes+=" ділиться без залишку на "+sNumD+"\n";
         }else{
             formMes+="не ділиться без залишку на "+sNumD+"\n";
         }
            i++;
            if(sNumD==5){
                sNumD-=2;
            } else {
                sNumD+=3;
            }


        }

        return formMes;

    }

    static boolean isNegative(int mN){

        return (mN>0);
    }

    static String simpNubm(int mN){

        String _res = "";

        for(int i =2 ; i<=Math.sqrt(mN); i++){

            if(mN%i==0){
                return _res = "Не просте число\n";
            } else {
                return _res = "Просте число\n";
            }
        }
        return _res;
    }

    static String _FulRes(int mN){

        String mRes = "Число " + mN +"\n";

        boolean Nneg = isNegative(mN);

        if (Nneg){
            mRes+= "позитивне\n";
        }else {
            mRes+= "негативне\n";
        }

        if (mN==1){
            mRes+= " 1 ні просте ні складове\n";

        }else{
            String _simp = simpNubm(mN);
            mRes+= _simp;
        }

        String Del = Dil5(mN);
        mRes+= Del;



        return mRes;

    }

    public static void main(String[] args) {
        Scanner nSc = new Scanner(System.in);
        System.out.println("Введіть число");
        int mNumber = nSc.nextInt();
        nSc.close();

        String NumInf = _FulRes(mNumber);
        System.out.println(NumInf);


    }

}
