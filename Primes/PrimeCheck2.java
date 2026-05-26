import java.util.*;
public class PrimeCheck2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // n= 15
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println("Not a Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
