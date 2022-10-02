/* Prime Number
Just like the Perfect number, the Prime number is also a special type of number. When
the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
number. 0 and 1 are not counted as prime numbers. All the even numbers can be
divided by 2, so 2 is the only even prime minister.
*/

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        int i;
        boolean b = false;
        for(i=2;i<=num;i++) {
            if (num % i == 0)
                b = true;
            break;
        }
        if(!b) {
            System.out.println(num+": is a Prime Number");
        }
        else
            System.out.println(num+": is not a Prime Number");
    }
}
