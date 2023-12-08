public class primeornot {
    // public static boolean Prime(int n){
    //     boolean Prime = true;
    //     if(n==2){
    //         return Prime;
    //     }

    //     for(int i = 2; i <= n-1; i++){
    //         if (n % i == 0){
    //              Prime = false;
    //              break;
    //         }
    //     }
    //     return Prime;
    // }
    
    public static boolean Prime(int n){
        
        if(n==2){
            return true;
        }
        
        for ( int i =2; i <= Math.sqrt(n); i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Prime(8));
    }
}
