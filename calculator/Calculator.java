import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 1st number");
        double n1=input.nextDouble();
        System.out.println("enter 2nd number");
     double n2=input.nextDouble();
     System.out.println("enter operation");
     char op=input.next().charAt(0);
     if(op=='+'){
        System.out.println(n1+n2);
     }else if(op=='-'){
        System.out.println(n1-n2);
     }else if(op=='*'){
        System.out.println(n1*n2);
     }else if(op=='/'){
        System.out.println(n1/n2);
     }else{
        System.out.println("invalid operation");
     }

    }
}