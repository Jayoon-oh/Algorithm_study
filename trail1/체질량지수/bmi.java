import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int weight = sc.nextInt();
        String Obesity;
        int b = 10000 * weight / (height * height);
        if (b >= 25) {
            System.out.println(b);
            Obesity = "Obesity";
            System.out.println(Obesity);
        } else {
            System.out.println(b);
        }
    }
}