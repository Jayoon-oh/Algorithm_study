import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String result;
        if (a>=90) {
            result = "A";
            System.out.println(result);
        } else if (a>=80) {
            result = "B";
            System.out.println(result);
        } else if (a  >= 70) {
            result = "C";
            System.out.println(result);
        } else if (a >= 60) {
            result = "D";
            System.out.println(result);
        } else {
            result = "F";
            System.out.println(result);
        }
    }
}