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

    public Partie() {
        grille = new GrilleDeCellules(5, 5);
        nbCoups = 0;
    }

    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(10);
    }

    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Début de la partie !");
        System.out.println(grille);

        while (!grille.cellulesToutesEteintes()) {

            System.out.println("Nombre de coups : " + nbCoups);
            System.out.println("Choisissez un coup :");
            System.out.println("1 - Activer une ligne");
            System.out.println("2 - Activer une colonne");
            System.out.println("3 - Activer la diagonale descendante");
            System.out.println("4 - Activer la diagonale montante");

            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Numéro de la ligne : ");
                    int ligne = scanner.nextInt();
                    grille.activerLigneDeCellules(ligne);
                    break;

                case 2:
                    System.out.print("Numéro de la colonne : ");
                    int colonne = scanner.nextInt();
                    grille.activerColonneDeCellules(colonne);
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

        System.out.println(" Partie terminée !");
        System.out.println("Nombre de coups joués : " + nbCoups);
    }
    
}
