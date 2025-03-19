import java.util.Scanner;

public class FactorialCalculator {

    public static int getNonNegativeInteger(Scanner n) { // pwede pala naten palitan to pero
        System.out.print("Enter a non-negative integer: "); 
        return n.nextInt(); // dapat dito mag palit din, parang scanner overloading pag kakaintindi naten dito
    }

     public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1; 
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        System.out.print("How many numbers do you want to check? "); 
        int a = j.nextInt();
        for (int x = a; x > 0; x--) {// Loop naten para dalawa yung maging output, pwde x++ para infinite na inputs

            int n = getNonNegativeInteger(j);
            int result = calculateFactorial(n);
            System.out.println("The factorial of " + n + " is : " + result);
        }
    }
}