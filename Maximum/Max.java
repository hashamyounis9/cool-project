import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num1 :");
        int num1 = input.nextInt();
        System.out.println("enter num2 :");
        int num2 = input.nextInt();
        System.out.println("enter num3 :");
        int num3 = input.nextInt();
        if(num1>num2)
        {
            if(num1>num3)
            System.out.println("The number is greater :" + num1 );
            else
            System.out.println("The number is greater :"+ num2);
        }
        else if(num1>num3)
        System.out.println("The number is greater :" + num2);
        else if(num1 == num2 && num2 == num3)
        System.out.println("All numbers are equal");
        else 
        System.out.println("The number is greater :" + num3);
        
    }
    
}
