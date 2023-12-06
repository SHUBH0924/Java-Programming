import java.util.*;

public class switchcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter num_1");
        int num_1 = sc.nextInt();
        System.out.println("enter num_2");
        int num_2 = sc.nextInt();
        System.out.println("enter operation");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(num_1 + num_2);
                break;
            case '-' : 
                System.out.println(num_1 - num_2);
                break;
            case '*' :
                System.out.println(num_1 + num_2);
                break;
            case '/' :
                System.out.println(num_1 + num_2);
                break;
            case '%' :
                System.out.println(num_1 + num_2);
                break;
            default: 
            System.out.print("Invalid Operator");
        }
    }
}
