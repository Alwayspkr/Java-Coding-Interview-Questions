package SwapTwoNumbers;

public class NumberSwaping {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;
        b = b + a;
        a=b-a;
        b=b-a;
        System.out.println(a);
        System.out.println(b);
// ______________________________________________________________
// using 3rd varibale
        int x = 100;
        int y = 200;
        int z = x;
        x=y;
        y=z;
        System.out.println(x);
        System.out.println(y);


    }

}