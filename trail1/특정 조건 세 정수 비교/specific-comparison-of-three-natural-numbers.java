import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min;

        if (a <= b && a <= c) {
            min = a;
            System.out.print(1+" ");
        } else if (b <= a && b <= c) {
            min = b;
            System.out.print(0+" ");
        } else {
            min = c;
            System.out.print(0+" ");
        }

        if (a == b  && a == c) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }

    }
}