import java.util.Scanner;

public class Arithmetics {

    static String _div(int opA, int opB){

        int res = opA / opB;

        return "ділення "+ res;

    }
    static String _mul(int opA, int opB){

        int res = opA * opB;

        return "множення "+ res;

    }

    static String _sub(int opA, int opB){

        int res = opA - opB;

        return "віднімання "+ res;

    }


       static String _add(int opA, int opB){

            int res = opA + opB;

            return "Додавання "+ res;

        }

       static int Sindx(String _Mstr){

           int Sel = 0;

           for(;;){

               Sel = _Mstr.indexOf('+');
               if(Sel>0){
                   return Sel;
               }
               Sel = _Mstr.indexOf('-');
               if(Sel>0){
                   return Sel;
               }
               Sel = _Mstr.indexOf('/');
               if(Sel>0){
                   return Sel;
               }
               Sel = _Mstr.indexOf('*');
               if(Sel>0){
                   return Sel;
               }

           }

            //return Sel;

        }



    public static void main(String[] args) {
        Scanner nSc = new Scanner(System.in);
        System.out.println("Введіть вираз як у прикладі: 6+6\n знаки: +-/*");
        String _Arg = nSc.next();
        nSc.close();
        //
        int indSign = Sindx(_Arg);
        int lStr = _Arg.length();

        char ss = _Arg.charAt(indSign);
        String Sop1 = _Arg.substring(0,indSign);
        String Sop2 = _Arg.substring(indSign+1,lStr);

        //

        int Oper1 = Integer.parseInt(Sop1);
        int Oper2 = Integer.parseInt(Sop2);


        switch (ss){

            case '+': {
                String _resStr = _add(Oper1,Oper2);
                System.out.println(_resStr);
                break;
            }

            case '-':{
                String _resStr = _sub(Oper1,Oper2);
                System.out.println(_resStr);
                break;
            }

            case '*':{
                String _resStr = _mul(Oper1,Oper2);
                System.out.println(_resStr);
                break;
            }

            case '/':{
                if (Oper2==0){
                    System.out.println("Поділ на 0!");
                    break;
                }
                String _resStr = _div(Oper1,Oper2);
                System.out.println(_resStr);
                break;
            }

        }






    }
}


