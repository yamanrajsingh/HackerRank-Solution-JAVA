import java.io.*;
import java.util.*;

public class Java_String_Reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String rev = "";
        /* Enter your code here. Print output to STDOUT. */
        StringBuffer sbr = new StringBuffer(A);
        sbr.reverse();
        for (int i = 0; i < sbr.length(); i++) {
            rev = rev + sbr.charAt(i);

        }
        if (A.equals(rev)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
