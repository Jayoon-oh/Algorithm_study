import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result;
        if (a.equals("S")) {
            System.out.println("Superior");
        } else if (a.equals("A")) {
            System.out.println("Excellent");
        } else if (a.equals("B")) {
            System.out.println("Good");
        } else if (a.equals("C")) {
            System.out.println("Usually");
        } else if (a.equals("D")) {
            System.out.println("Effort");
        } else {
            System.out.println("Failure");
        }
    }
}