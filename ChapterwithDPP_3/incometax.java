import java.util.Scanner;

public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int total;
        if(income > 1000000){
            total = ((income*30)/100);
            System.out.println(total);
        }
         else if (income > 500000 && income < 1000000){
            total = ((income*20)/100);
            System.out.println(total);
        }
         else{
            total = ((income*0)/100);
            System.out.println(total);
        }
    }
}
