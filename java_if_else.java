import java.util.Scanner;

public class java_if_else {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 != 0) {
            System.out.println("Weird");

        } else {
            if (2 <= n && n <= 5) {
                System.out.println("Not Weird");

            } else if (6 <= n && n <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }

    }

}