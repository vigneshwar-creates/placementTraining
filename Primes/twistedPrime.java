import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(prime(n)){
            int r = reverse(n);
            if(prime(n)){
                System.out.println("Twisted Prime");
            }
            else{
                System.out.println("Not Twisted Prime");
            }
        }else{
            System.out.println("not prime number");
        }
    }
    
    public static boolean prime(int x){
        for(int i = 2; i<x; i++){
            return false;
        }
        return true;
    }
    public static int reverse(int x){
        int rev = 0;
        while(x > 0){
            rev = rev * 10 + x%10;
            x = x / 10;
        }
        return rev;
    }
}
