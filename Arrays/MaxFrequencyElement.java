import java.util.*;

public class MaxFrequencyElement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)// index
        {
            arr[i] = sc.nextInt();
        }
        int max=0;
        int element=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i] == arr[j])
                {
                    c++;
                }
            }
            if(max <=  c)
            {
                element = arr[i];
                max=c;
            }
        }
        System.out.println(element +" - " + max);
        
    }
}
