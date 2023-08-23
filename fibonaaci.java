import java.util.*;

public class fibonaaci {
    // Corrected the class name to start with an uppercase letter (convention).
    
    static int fib(int n) {
        if (n == 0 || n == 1) {
            return n; // Changed return value to n for the base cases.
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        
        sc.close(); // Close the Scanner when done.
    }
}
