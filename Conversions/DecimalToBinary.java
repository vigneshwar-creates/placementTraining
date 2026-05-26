import java.util.*;
public class DecimalToBinary
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        while(n!=0)
        {
            int rem = n%2;
            str = str + rem;
            n=n/2;
        }
        String rev_str="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev_str = rev_str + str.charAt(i);
        }
        int h = Integer.parseInt(rev_str);
        System.out.println(h);
        
        // 128 64 32 16 8 4 2 1
        
        // 10 -> 1010
        // 10%2     0
        // 10/2 5
        
        // 5%2      1
        // 5/2  2
        
        // 2%2       0
        // 2/2  1
        
        // 1%2       1
        // 1/2  0
        
        // 8  -> 1000
    }
}
