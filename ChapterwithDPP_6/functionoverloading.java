public class functionoverloading {
    public static int sum(int a , int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a + b +c ;
    }
    public static float sum( float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,7));
        System.out.println(sum(10,20,30));
        System.out.println(sum(4.5f, 8.9f));
    }
}
