class Voiture{
    String couleur;
    String marque;
    int nbPortes;
    int vitesse;
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

        // on affiche 
        System.out.printf("ma %s est ce couleur %s, elle avance a %dKmh, et elle a %d de portes", fiatMulltiplat.marque, fiatMulltiplat.couleur, fiatMulltiplat.vitesse, fiatMulltiplat.nbPortes);

    }
}