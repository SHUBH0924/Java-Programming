import java.util.Scanner;

public class evenorodd {
    
    public static void isEven (int num){
        if (num%2 == 0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        isEven(num);
    }
}
