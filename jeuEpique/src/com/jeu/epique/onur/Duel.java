package com.jeu.epique.onur;


import static com.jeu.epique.onur.Main.joueur1;
import static com.jeu.epique.onur.Main.joueur2;

public class Duel {

    public void attaque(int[] joueurA, int[] joueurB, int attaque)
    {
        int personnage = 0;
        int joueur1ou2 = 1;
        int niveau = 2;
        int vitalite = 3;
        int force = 4;
        int agilite = 5;
        int intelligence = 6;

        if (joueurA[personnage] == 1 )
        {
            if ( attaque == 1)
            {
                System.out.println("Joueur "+joueurA[joueur1ou2]+" utilise Coup d’Épée et inflige "+ joueurA[force] +" dommages.");
                System.out.println("Joueur "+joueurB[joueur1ou2]+" perd "+ joueurA[force] +" points de vie");
                joueurB[vitalite] -= joueurA[force];
            }
            else if ( attaque == 2)
            {
                System.out.println("Joueur "+joueurA[joueur1ou2]+" utilise Coup de Rage et inflige "+ (joueurA[force]*2) +" dommages.");
                joueurB[vitalite] -= (joueurA[force]*2);
                System.out.println("Joueur "+joueurB[joueur1ou2]+" perd "+ (joueurA[force]*2) +" points de vie");
                joueurA[vitalite] -= (joueurA[force]/2);
                System.out.println("Joueur "+joueurA[joueur1ou2]+" perd "+ (joueurA[force]/2) +" points de vie");
            }
        }
        else if (joueurA[personnage] == 2)
        {
            if ( attaque == 1)
            {
                System.out.println("Joueur "+joueurA[joueur1ou2]+" utilise Tir à l’Arc et inflige "+ joueurA[agilite] +" dommages.");
                System.out.println("Joueur "+joueurB[joueur1ou2]+" perd "+ joueurA[agilite] +" points de vie");
                joueurB[vitalite] -= joueurA[agilite];
            }
            else if ( attaque == 2)
            {
                System.out.println("Joueur "+joueurA[joueur1ou2]+" utilise Concentration et gagne "+ (joueurA[niveau]/2) +" en agilité.");
                joueurA[agilite] += (joueurA[niveau]/2);
            }
        }
        else if (joueurA[personnage] == 3)
        {
            if ( attaque == 1)
            {
                System.out.println("Joueur "+joueurA[joueur1ou2]+" utilise Boule de Feu et inflige "+ joueurA[intelligence] +" dommages.");
                System.out.println("Joueur "+joueurB[joueur1ou2]+" perd "+ joueurA[intelligence] +" points de vie");
                joueurB[vitalite] -= joueurA[intelligence];
            }
            else if ( attaque == 2)
            {
                System.out.println("Joueur "+joueurA[joueur1ou2]+" utilise Soin et gagne "+ (joueurA[intelligence]*2) +" en vitalité.");
                joueurA[vitalite] += (joueurA[intelligence]*2);

                if(joueurA[vitalite] > (joueurA[niveau]*5))
                {
                    joueurA[vitalite] = (joueurA[niveau]*5);
                }
            }
        }



        if (joueur1[1] == joueurA[1]){
            joueur1 = joueurA;
            joueur2 = joueurB;
        }
        else {
            joueur1 = joueurB;
            joueur2 = joueurA;
        }

    }
}
