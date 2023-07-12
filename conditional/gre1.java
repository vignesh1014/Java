import java.util.Scanner;
class gre1{
    public static void main(String[] args) {
        //to print greatest of two number 
        Scanner scan=new Scanner(System.in);
        System.out.println("--------Greatest of two Number-------");
        
        System.out.println("Enter a first Number:");
        int num1=scan.nextInt();
        System.out.println("Enter a Second Number:");
        int num2=scan.nextInt();
        if(num1>num2)
            System.out.println(num1 +" is greater than "+num2);
        else 
            System.out.println(num2 +" is greater than "+num1);
    }
}