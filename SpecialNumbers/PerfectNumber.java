import java.util.*;

public class PerfectNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int sum = 0;

            // Perfect Number: A positive integer equal to the 
            // sum of its proper divisors 
            // (excluding the number itself).
            for(int i=1; i<n; i++) {
                if(n%i == 0) {
                    sum += i;
                }
            }
            
            if (sum == n && n != 0) {
                System.out.println("Perfect Number");
            } else {
                System.out.println("Not a Perfect Number");
            }
        }
        sc.close();
    }
}
