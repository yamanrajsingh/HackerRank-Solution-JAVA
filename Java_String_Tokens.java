import java.io.*;
import java.util.*;

public class Java_String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if (s.length() == 0) {
            System.out.println("0");
        } else {
            String[] Str = s.split("[!,?._'@ ]+");
            System.out.println(Str.length);
            for (String a : Str) {
                System.out.println(a);
            }
        }
        scan.close();
    }
}
