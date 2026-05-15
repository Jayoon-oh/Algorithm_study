import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int book = 3000;
        int mask = 1000;
        int pen = 500;

        String item;
        if (money >=3000) {
            item="book";
            System.out.println(item);
        } else if (money >=1000) {
            item="mask";
            System.out.println(item);
        } else if (money >= 500) {
            item="pen";
            System.out.println(item);
        } else {
            System.out.println("no");
        }
    }
}