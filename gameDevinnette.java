
import java.util.Scanner;



public class gameDevinnette {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int)(Math.random() * 100 + 1);


        for (int i = 0; i < 5; i++) {
            System.out.print("> ");
            int value = scanner.nextInt();

            if(value == number){
                System.out.println("Good, the number is : " + number);
            }

            if (value != number){
                System.out.println("reessayer");
                continue;

            }

        }
        System.out.println("Game Over");
        System.out.println(number);
    }
}
