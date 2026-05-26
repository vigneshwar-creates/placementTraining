import java.util.*;

public class AutomorphicNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int c = 0;
            int originalN = n;
            
            // Automorphic Number: A number whose square ends with the 
            // exact same digits as the number itself.
            
            int sqNum = n * n;
            while(n != 0) {
                c++;
                n = n / 10;
            }
            
            int g = (int)(Math.pow(10, c));
            if((sqNum % g) == originalN) {
                System.out.println("Automorphic");
            } else {
                System.out.println("Not Automorphic");
            }
        }
        sc.close();
    }
}
