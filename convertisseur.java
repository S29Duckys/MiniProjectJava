
import java.util.Scanner;

public class convertisseur{
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

            System.out.print("Entrez une valeur a convertire (la valeure est de base doit etre en celcus) : ");
            double valeur = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("en quoi vous voulez convertir : ");
            String choixDeConvertion = scanner.nextLine();

            if (choixDeConvertion.equals("f") ) {
                System.out.println((valeur * 9 / 5) + 32);
            }else if (choixDeConvertion.equals("k")){
                System.out.println(valeur + 273.15);
            }

            scanner.close();
        }    
    }
}