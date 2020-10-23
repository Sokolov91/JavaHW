package task_2;

public class SecondMain {
   static String e="DevEducation!";
    public static void main(String[] args){
        String s="Hello, John";
        String h="Hello,";
        String space=" ";

        System.out.println(s);
        System.out.println(h+space+e);
        System.out.println(twoNumbers(2,2));
        System.out.println(five(2.5, 2.5));
        System.out.println(fourBillion(2_000_000_000, 2_000_000_000));
    }

    public static int twoNumbers(int a, int b){

        return a + b; // wtf ???
    }

    public static int twoNumbers(int c, int e, int d){
        return c+e;
    }

    public static double five(double a, double b){

        return a + b;
    }

    public static long fourBillion(long f, long g){

        return f + g;//prishlos poebatsa ))
    }
}
