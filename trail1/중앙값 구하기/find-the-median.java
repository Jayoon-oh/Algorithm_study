import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if ((a > b && a < c) || (a > c && b > a)) {
            System.out.println(a);
        } else if ((a < b && b < c) || (b > c && b < a)) {
            System.out.println(b);
        } else if ((b < c && c < a) || (c > a && c < b)){
            System.out.println(c);
        }
    }
}