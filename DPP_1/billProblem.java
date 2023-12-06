import java.util.*;

public class billProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float add = pencil+pen+eraser;
        double GST = (add)*0.18;
        double Total_Amount_with_GST = GST + add;
        System.out.println("Total amount with tax is : "+Total_Amount_with_GST+"Rs");
    }
}
