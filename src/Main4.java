
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("When you should come home");

        Scanner scan = new Scanner(System.in);

        int time  = scan.nextInt();

        switch (time) {
            case 12oclock:
                System.out.println("i will beat you");
                break;
            case 11oclock:
                System.out.println("when you get home i will take away your freedom");
                break;
            case 9oclock:
                System.out.println("okay,fine");
                break;
            case 7oclock:
                System.out.println("very good");
                break;
        }
        System.out.println("Bye Bye!!");
    }
}