import java.util.Scanner;

public class productofab {
    public static int Product(int a, int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = Product(a, b);
        System.out.println("Product of " + a + " and "+b+" is: "+prod);
    }
    
}
