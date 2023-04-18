import java.util.Scanner;

public class Java_Anagrams {
    static boolean isAnagram(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();
        char arr1[] = a.toCharArray();
        char arr2[] = b.toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        String p = new String(arr1);
        String q = new String(arr2);
        if (p.equals(q)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();

        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
