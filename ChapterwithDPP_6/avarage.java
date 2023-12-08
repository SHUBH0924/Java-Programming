public class avarage {

    public static float Avg(float a, float b, float c){
        float avarage = a+b+c/3;
        return avarage;
    }

    public static void main(String[] args) {
        int a = 14;
        int b = 15;
        int c = 16;
        System.out.println("The average of the three numbers is: " + Avg(a,b,c));
    }
}