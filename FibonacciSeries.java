/* Fibonacci Series
Fibonacci series is a special type of series in which the next term is the sum of the
previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
the next term will be 1(0+1).
*/

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter x and y: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first term: ");
        int x = sc.nextInt();
        System.out.println("Enter second term: ");
        int y = sc.nextInt();
        int term = 5;
        System.out.println("Fibonacci Series till " + term + " terms: ");

        for (int i = 1; i <= term; ++i) {
            System.out.print(x + ", ");

            // compute the next term
            int c = x + y;
            x = y;
            y = c;
        }
    }
}
