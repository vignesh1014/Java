import java.util.Scanner;
class sum_e_or_d{
    public static void main(String[] args) {
        //to print sum of two number is even or odd
        Scanner scan=new Scanner(System.in);
        System.out.println("--------Check Sum IS Even Or Odd-------");
        System.out.println("Enter a first   Number:");
        int num1=scan.nextInt();
        System.out.println("Enter a Second  Number:");
        int num2=scan.nextInt();
        if((num1+num2)%2==0)
            System.out.println("Sum Is Even");
        else 
           System.out.println("Sum Is Odd");
    }
}