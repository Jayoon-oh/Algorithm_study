import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String first = "John";
        String two = "Tom";
        String three = "Paul";
        if (a==1) {
            System.out.println(first);
        } else if(a==2) {
            System.out.println(two);
        } else if(a==3) {
          System.out.println(three);
        } 
        else {
        System.out.println("Vacancy");
        }
    }
}