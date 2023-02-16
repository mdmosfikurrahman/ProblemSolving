import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolveMeFirst {

    static int solveMeFirst(int a, int b) {
        // Hint: Type return a+b; below
        int sum = 0;
        if ((a >= 1 && a <= 1000) && (b >= 1 && b <= 1000)) {
            sum = a + b;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}
