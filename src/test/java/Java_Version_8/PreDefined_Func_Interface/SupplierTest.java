package Java_Version_8.PreDefined_Func_Interface;

import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {
        //randomValue();
        //randomOTP();
        generateOTP();
    }

    /*
    Math.random() -> generate 0<=x<1 between 0 to 0.999 value

     */
    public static void randomValue(){
        Supplier<String> s = () -> {
            String[] st = {"gnana", "sekar", "mathan", "mohan"};
            int x = (int)(Math.random()*4);
            return st[x];
        };
        System.out.println(s.get());
    }

    public static void randomOTP(){
        Supplier<String> s = () -> {
         String otp = "";
         for(int i=0; i<6; i++)
             otp+=(int)(Math.random()*10);
         return otp;
        };
        System.out.println(s.get());
    }

    /*
    Generate random 8 char OTP in which 2,4,6,8 position as digit and alternative position as character and symbols
    eg. a2b4@6f8
     */
    public static void generateOTP(){
        String pwd="";
        Supplier<Integer> d =() -> (int)(Math.random()*10);
        String symbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
        Supplier<Character> c =() -> symbol.charAt((int)(Math.random()*28));

        for (int i = 0; i < 8; i++) {
            if(i%2==0) pwd+=d.get();
            else pwd+=c.get();
        }
        System.out.println(pwd);
    }
}
