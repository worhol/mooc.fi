
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.valueOf(scanner.nextInt());
        int second = Integer.valueOf(scanner.nextInt());
        System.out.println(Math.sqrt(first+second));

    }
}
