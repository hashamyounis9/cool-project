import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int n,c,f;
c= 1;
f= 1;
System.out.println("Enter the number : ");
n = input.nextInt();
while(c<=n){
    f= f*c;
    c= c+1;
    
}
System.out.println("Factorial of "+ n +" is " + f );

    }
    
}
