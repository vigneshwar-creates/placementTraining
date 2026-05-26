import java.util.*;

public class circularprime {
    public static boolean isPrime(int num) {
        if(num < 2) return false;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            isCircularPrime(num);
        }
        sc.close();
    }

    public static void isCircularPrime(int num) {
        int c = 0;
        int temp = num;
        while(temp > 0) {
            c++;
            temp /= 10;
        }
        
        temp = num;
        boolean isCircular = true;
        for(int i = 0; i < c; i++) {
            if(!isPrime(temp)) {
                isCircular = false;
                break;
            }
            int rem = temp % 10;
            temp = temp / 10 + rem * (int)Math.pow(10, c - 1);
        }
        
        if(isCircular) {
            System.out.println("Circular Prime");
        } else {
            System.out.println("Not a Circular Prime");
        }
    }
}