import java.util.*;

public class reverseinput {
    public static void main(String args[]) {
        int n =23476;
        int rev = 0;
        while (n>0) {
            int last =n%10;
            rev=rev*10+last;
            n=n/10;
        }
        System.out.println("Reverse of the number is "+rev);
    }
}
