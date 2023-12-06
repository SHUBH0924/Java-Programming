public class ifelse{
    public static void main(String args[]){
        int age = 17;
        if (age >= 18){
            System.out.println("You are eligible for voting");
        }
        else if(age>13 && age<18) {
            System.out.println("teenager");
        }
        else {
            System.out.println("Sorry, you are not eligible for voting yet");
        }
    }
}