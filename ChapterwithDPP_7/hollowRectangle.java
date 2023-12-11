package ChapterwithDPP_7;

public class hollowRectangle {
    
    public static void Hollow_Rect(int row, int col){
        for ( int i = 1; i<= row; i++ ){
            for ( int j = 1; j <= col; j++ ){
                if ( i == 1 || i == row || j == 1 || j == col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Hollow_Rect(4, 5);
    }
}
