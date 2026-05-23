import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int star = 0;
        while (star < a) {
            System.out.println("*");
            star++;
        }
    }
}