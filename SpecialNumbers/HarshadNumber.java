import java.util.*;

public class HarshadNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int sum = 0;
            int temp = n;
            
            // Harshad Number: An integer that is completely divisible by 
            // the sum of its own digits.
            while(temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            
            if (sum != 0 && n % sum == 0) {
                System.out.println("Harshad Number");
            } else {
                System.out.println("Not a Harshad Number");
            }
        }
        sc.close();
    }
}
