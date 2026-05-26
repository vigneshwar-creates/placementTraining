import java.util.*;
public class ArmstrongNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int temp1=n;
        int sum=0;
        // Armstrong Number, Perfect, Strong number
        int count=0;
        while(n!=0)
        {
            int rem=n%10;
            count++;
            n=n/10;
        }
        while(temp!=0)
        {
            int rem=temp%10;
            sum = sum + (int)(Math.pow(rem,count));
            temp=temp/10;
        }
        if(temp1 == sum)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not an Armstrong");
        }
        
        // n = 153
        // 1^3 + 5^3 + 3^3 = 153
        
        // 1 + 5 + 3
        // count
        // sum :: ^count
        // sum == temp
    }
}
