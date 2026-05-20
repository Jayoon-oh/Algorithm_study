import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String aGender = sc.next();

        int b = sc.nextInt();
        String bGender = sc.next();

        if ((a >= 19 && aGender.equals("M")) || (b >= 19 && bGender.equals("M")) ) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}