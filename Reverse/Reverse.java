import java.util.Scanner;
public class Reverse {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int x = input.nextInt();
        int ans = 0;
        while(x > 0){
        int r = x % 10;
        x /= 10;
         ans= ans * 10 + r;
        }
        System.out.println(ans);

    }    
}