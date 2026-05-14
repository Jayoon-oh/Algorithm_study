import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int points = 80;

        if (a >=80) {
            System.out.println("pass");
        } else {
            a = points-a;
            System.out.println(a + " more score");
        }
    }
}