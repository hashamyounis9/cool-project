import java.util.Scanner;
public class Quest2 
{
    public static void main(String[] args) 
    {
        Scanner abc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number for table");
        n = abc.nextInt();
        System.out.println("Table is");
        for(int i = 1;i<=10;i++)
        {
            System.out.println(n +" * " + i + " = " + n*i);
        }
        abc.close();
    }
}
