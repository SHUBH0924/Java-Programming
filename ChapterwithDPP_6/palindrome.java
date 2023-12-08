import java.util.Scanner;

public class palindrome {
    public static boolean Palindrome(int num){
        int palindrome = num;
        int rev = 0;
        while (palindrome != 0) {
            int rem = palindrome % 10;
            rev = rev * 10 + rem;
            palindrome = palindrome / 10;
        }
        if( num == rev){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (Palindrome(num)) {
            System.out.println(num + " is a palindrome number");
        } else {
            System.out.println(num + " is not a palindrome number");
        }
    }
}
