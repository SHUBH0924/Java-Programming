import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        int f = 1;
        for(int i = 1; i<=n; i++){
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n = sc.nextInt();
        int factorialnum = fact(n);
        System.out.println("Factorial of "+n+" is :"+factorialnum);
    }
    
}
