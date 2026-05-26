import java.util.*;
public class BinaryToDecimal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power=0, sum=0;
        while(n!=0)
        {
            int rem = n%10;//0
                int t = rem * (int)(Math.pow(2,power));
                // 0  * 2^0
                sum = sum + t;
                power++;
            n=n/10;
        }
        System.out.println(sum);
        // 1010 -> 10
        // // 128 64 32 16 8 4 2 1
        //                 1 0 1 0       
        // 0 *1 1
        // 1 *2 2
        // 4
        // 8
        // 16
    }
}
