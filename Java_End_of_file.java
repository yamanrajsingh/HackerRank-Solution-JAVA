import java.util.Scanner;

public class Java_End_of_file {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while (scan.hasNextLine()) {
            String st = scan.nextLine();
            System.out.println(i + " " + st);
            i++;

            }
        }
    }
