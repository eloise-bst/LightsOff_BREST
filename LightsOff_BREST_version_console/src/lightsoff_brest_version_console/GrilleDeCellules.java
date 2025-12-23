/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff_brest_version_console;

import java.util.Random;

/**
 *
 * @author eloisebrest
 */
public class GrilleDeCellules {
    
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    public GrilleDeCellules(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;

        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    @Override
    public String toString() {
        String chaine = "    ";
        for (int j = 0; j < nbColonnes; j++) {
            chaine += j + " ";
        }
        chaine += "\n";

        chaine += "  |";
        for (int j = 0; j < nbColonnes; j++) {
            chaine += "--";
        }
        chaine += "\n";

        for (int i = 0; i < nbLignes; i++) {
            chaine += i + " | ";
            for (int j = 0; j < nbColonnes; j++) {
                chaine += matriceCellules[i][j] + " ";
            }
            chaine += "\n";
        }
        return chaine;
    }

    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    public void activerDiagonaleDescendante() {
        int taille = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < taille; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    public void activerDiagonaleMontante() {
        int taille = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < taille; i++) {
            matriceCellules[i][nbColonnes - 1 - i].activerCellule();
        }
    }

    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random rand = new Random();
        int choix = rand.nextInt(4);

        switch (choix) {
            case 0:
                activerLigneDeCellules(rand.nextInt(nbLignes));
                break;
            case 1:
                activerColonneDeCellules(rand.nextInt(nbColonnes));
                break;
            case 2:
                activerDiagonaleDescendante();
                break;
            case 3:
                activerDiagonaleMontante();
                break;
        }
    }
}
