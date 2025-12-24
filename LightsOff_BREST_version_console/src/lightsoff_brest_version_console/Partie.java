/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff_brest_version_console;

import java.util.Scanner;

/**
 *
 * @author eloisebrest
 */
public class Partie {
    
    private GrilleDeCellules grille;
    private int nbCoups;
    private int nbCoupsMax;

    public Partie() {
        grille = new GrilleDeCellules(5, 5);
        nbCoups = 0;
        nbCoupsMax = 20;
    }

    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(10);
    }

    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(grille);

        while (!grille.cellulesToutesEteintes() && nbCoups < nbCoupsMax) {

            System.out.println("Coups : " + nbCoups + "/" + nbCoupsMax);
            System.out.println("1 - Ligne");
            System.out.println("2 - Colonne");
            System.out.println("3 - Diagonale descendante");
            System.out.println("4 - Diagonale montante");

            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Ligne : ");
                    grille.activerLigneDeCellules(scanner.nextInt());
                    break;
                case 2:
                    System.out.print("Colonne : ");
                    grille.activerColonneDeCellules(scanner.nextInt());
                    break;
                case 3:
                    grille.activerDiagonaleDescendante();
                    break;
                case 4:
                    grille.activerDiagonaleMontante();
                    break;
                default:
                    System.out.println("Choix invalide.");
                    continue;
            }

            nbCoups++;
            System.out.println(grille);
        }

        if (grille.cellulesToutesEteintes()) {
            System.out.println("Bravo ! Vous avez gagné en " + nbCoups + " coups.");
        } else {
            System.out.println("Perdu ! Nombre maximum de coups atteint (" + nbCoupsMax + ").");
        }
    }
    
}
