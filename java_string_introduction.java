import java.io.*;
import java.util.*;

public class java_string_introduction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int a = A.length();
        int b = B.length();
        System.out.println(a + b);
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        String s = A.substring(0, 1).toUpperCase();
        for (int j = 1; j < A.length(); j++) {

            s = s + A.charAt(j);

        }
        String s1 = B.substring(0, 1).toUpperCase();
        for (int j = 1; j < B.length(); j++) {

            s1 = s1 + B.charAt(j);

        }
        System.out.println(s + " " + s1);
        /* Enter your code here. Print output to STDOUT. */

    }
}
