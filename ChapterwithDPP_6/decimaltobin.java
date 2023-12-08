public class decimaltobin {
    
    public static void dectoBin(int n){
        int pow = 0;
        int binNum = 0;
        int mynum =n;
        while (n>0) {
            int rem = n%2;
            binNum = binNum + (rem*(int)Math.pow(10, pow));
            pow ++;
            n=n/10;
        }
        
        System.out.println("Binary representation of "+mynum+" is: " + binNum);
    }
    public static void main(String[] args) {
       dectoBin(2); 
    }
    
}
