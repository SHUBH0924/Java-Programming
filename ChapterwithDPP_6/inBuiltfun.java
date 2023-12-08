import java.util.Scanner;

public class inBuiltfun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        System.out.println("Maximum number of num_1 and num_2 is: " + Math.max(num_1, num_2));

        // return the square root of y
        System.out.println("Square root of num_2 is: " + Math.sqrt(num_2));

        // returns 28 power of 4 i.e. 28*28*28*28
        System.out.println("Power of num_1 and num_2 is: " + Math.pow(num_1, num_2));

        // return the logarithm of given value
        System.out.println("Logarithm of num_1 is: " + Math.log(num_1));
        System.out.println("Logarithm of num_2 is: " + Math.log(num_2));

        // return the logarithm of given value when base is 10
        System.out.println("log10 of num_1 is: " + Math.log10(num_1));
        System.out.println("log10 of num_2 is: " + Math.log10(num_2));

        // return the log of num_1 + 1
        System.out.println("log1p of num_1 is: " + Math.log1p(num_1));

        // return a power of 2
        System.out.println("exp of a is: " + Math.exp(num_1));

        // return (a power of 2)-1
        System.out.println("expm1 of a is: " + Math.expm1(num_1));

    }
}
