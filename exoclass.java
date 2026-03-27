class Voiture{
    String couleur;
    String marque;
    int nbPortes;
    int vitesse;

    String getDescription(){
        return "Voiture " + marque + " de couleur " + couleur + " et qui a " + nbPortes + " de portes.";
    }

    void accelerer(int number){
        vitesse = vitesse + number; 
        System.out.println("La voiture accelere a " + vitesse + "Kmh");
    }

    void frener(int number){
        vitesse = vitesse - number;
        System.out.println("La voiture frene a " + vitesse + "Kmh");
    }
}

public class exoclass{
    public static void main(String[] args) {
        // declaration et creation de ma nouvelle voiture  
        Voiture fiatMulltiplat = new Voiture();

        // on donne des attribus a la voiture que l'on vient de cree 
        fiatMulltiplat.couleur = "rouge";
        fiatMulltiplat.marque = "Fiat";
        fiatMulltiplat.nbPortes = 5;
        fiatMulltiplat.vitesse = 0;

        // afficher la dersciption
        String description = fiatMulltiplat.getDescription();
        System.out.println(description);

        // faire bouger la voiture 
        fiatMulltiplat.accelerer(10); // vitesse = 10 
        fiatMulltiplat.frener(4); // vitesse = 6
    }
}