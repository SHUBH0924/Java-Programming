public class reverseofnum {
    public static void main(String[] args) {
        int num = 12345;
        for(int i=1; i<=5; i++){
            int rev = num % 10;
            num = num/10;
            System.out.println(rev);
        }
    }
}