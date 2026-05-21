import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String symptomA = sc.next();
        int tempertureA = sc.nextInt();

        String symptomB = sc.next();
        int tempertureB = sc.nextInt();

        String symptomC = sc.next();
        int tempertureC = sc.nextInt();

        int coldPerson = 0;

        if (symptomA.equals("Y") && tempertureA >= 37) {
            coldPerson += 1;
        }
        if (symptomB.equals("Y") && tempertureB >= 37) {
            coldPerson += 1;
        }
        if (symptomC.equals("Y") && tempertureC >= 37) {
            coldPerson += 1;
        }


        if (coldPerson >= 2) {
            System.out.println('E');
        } else {
            System.out.println('N'); 
        }
    }
}