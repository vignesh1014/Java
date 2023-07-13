import java.util.Scanner;
class posneg1{
    public static void main(String[] args) {
        //to check given number is positive or negative or zero
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scan.nextInt();
        if(num>0){
            System.out.println("Entered number is Positive");
        }
        else if(num==0){
              System.out.println("Entered number is Zero");
        }
        else{
             System.out.println("Entered number is negative");
        }
        
        
        
        
    }
}