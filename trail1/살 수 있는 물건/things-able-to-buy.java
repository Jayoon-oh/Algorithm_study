import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int book = 3000;
        int mask = 1000;
        String shopping;
        if (n>=book) {
            shopping = "book";
        } else if (n>=1000) {
            shopping = "mask";
        } else {
            shopping = "no";
        }
        System.out.println(shopping);
    }
}