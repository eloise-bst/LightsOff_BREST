/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff_brest_version_console;

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
            chaine += matriceCellules[i][j].toString() + " "; 
        }
        chaine += "\n";
    }
    
    return chaine;
}
}
