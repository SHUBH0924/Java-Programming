import java.math.BigInteger;

public class binarytodecimal {
    public static void binToDec(int n){
        int powr = 0;
        int decNum = 0;
        int mynum = n;
        while (n > 0){
            int lastdigit = n % 10;
            decNum = decNum + (lastdigit * (int)Math.pow(2, powr));
            powr ++;
            n /= 10;
        }
        System.out.println("Decimal Equivalent of "+ mynum + " Binary Number is :"  + decNum);
    }
    public static void main(String[] args) {
        binToDec(101);
    }
}
