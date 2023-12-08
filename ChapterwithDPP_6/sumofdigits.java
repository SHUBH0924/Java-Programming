import java.util.Scanner;

public class sumofdigits {
    public static int SumofDigit(int num){
        int sum = 0;
        while(num != 0){
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Sum of digits: " + SumofDigit(num));
    }
}
