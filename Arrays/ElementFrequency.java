import java.util.*;

public class ElementFrequency
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
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(max < arr[i])
            {
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i] != max+1)
            {
                int c=0;
                for(int j=0;j<n;j++)
                {
                    if(arr[i] == arr[j])
                    {
                        if(i!=j)
                        {
                            arr[j]=max+1;
                        }
                        c++;
                    }
                }
                System.out.println(arr[i] +" - "+ c);
            }
        }
        
    }
}
