import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Java_BigInteger {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan =new Scanner(System.in);
         BigInteger a = scan.nextBigInteger();
          BigInteger b = scan.nextBigInteger();
          BigInteger c=a.add(b);
        System.out.println(c); 
        BigInteger d=a.multiply(b); 
          System.out.println(d);
    }
}
