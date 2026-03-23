
import java.util.Scanner;

public class paireImpaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre (entier) : ");
        int value = scanner.nextInt();

        if (value % 2 == 0) {
            System.out.printf("%d est paire", value);
        }else {
            System.out.printf("%d est impaire", value);
        }


        scanner.close();
    }
}
 