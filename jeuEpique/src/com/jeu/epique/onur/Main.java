package com.jeu.epique.onur;

public class Main {

    static int joueur1[] = new int[6];
    static int joueur2[] = new int[6];

    private static Classe joueurX = new Classe();
    private static ClasseAttribut joueur = new ClasseAttribut();
    private static Duel combat = new Duel();

    private static int attaqueJoueur1;
    private static int attaqueJoueur2;

    static int tour = 1;

    public static void main(String[] args) {

        joueur1 = joueurX.classe(1);
        joueur2 = joueurX.classe(2);

        do {
            if ( tour == 1) {
                System.out.println("Joueur 1 (" + joueur1[3] + " Vitalité) veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale)");
                attaqueJoueur1 = joueur.attaque();
                combat.attaque(joueur1, joueur2, attaqueJoueur1);
                tour = 2;
            }
            else if ( tour == 2) {
                System.out.println("Joueur 2 (" + joueur2[3] + " Vitalité) veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale)");
                attaqueJoueur2 = joueur.attaque();
                combat.attaque(joueur2, joueur1, attaqueJoueur2);
                tour = 1;
            }

        }while (joueur1[3] > 0 && joueur2[3] > 0);



        if ( joueur1[3] < joueur2[3]){
            System.out.println("Joueur 1 a perdu !");
        }
        else
        {
            System.out.println("Joueur 2 a perdu !");
        }

    }
}
