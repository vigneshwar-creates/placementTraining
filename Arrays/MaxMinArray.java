import java.util.*;

public class MaxMinArray
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
        int max = arr[0];
        int min = arr[0];
        
        for(int i=0;i<n;i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
