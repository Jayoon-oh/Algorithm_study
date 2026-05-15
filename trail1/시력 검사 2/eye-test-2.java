import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double avg = sc.nextDouble();
        String d;
        if (avg>=1.0) {
            d="High";
        } else if (avg>=0.5) {
            d="Middle";
        } else {
            d="Low";
        }
        System.out.println(d);
    }
}