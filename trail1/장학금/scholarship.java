import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int midTerm = sc.nextInt();
        int finalExam = sc.nextInt();
        int award;

        if (midTerm >= 90 && finalExam >= 95) {
            award = 100000;
        } else if (midTerm >= 90 && finalExam >= 90) {
            award = 50000;
        } else {
            award = 0;
        }

        System.out.println(award);
    }
}