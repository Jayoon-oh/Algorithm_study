import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a>=113) {
            a = 1;
            System.out.println(a);
        } else {
            a = 0;
            System.out.println(a);
        }
    }
}