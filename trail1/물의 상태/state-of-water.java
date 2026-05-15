import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String temperture;
        
        if (n<0) {
            temperture = "ice";
        } else if (n>=100 ) {
            temperture = "vapor";
        } else {
            temperture = "water";
        }
        System.out.println(temperture);
    }
}