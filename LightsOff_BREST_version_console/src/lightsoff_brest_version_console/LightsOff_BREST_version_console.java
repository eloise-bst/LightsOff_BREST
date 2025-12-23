/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightsoff_brest_version_console;

/**
 *
 * @author eloisebrest
 */
public class LightsOff_BREST_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GrilleDeCellules grille = new GrilleDeCellules(5, 5);
        System.out.println(grille);

        GrilleDeCellules g1 = new GrilleDeCellules(5, 5);
        g1.activerLigneDeCellules(2);
        System.out.println(g1);

        GrilleDeCellules g2 = new GrilleDeCellules(5, 5);
        g2.activerColonneDeCellules(3);
        System.out.println(g2);

        GrilleDeCellules g3 = new GrilleDeCellules(5, 5);
        g3.activerDiagonaleDescendante();
        System.out.println(g3);

        GrilleDeCellules g4 = new GrilleDeCellules(5, 5);
        g4.activerDiagonaleMontante();
        System.out.println(g4);

        GrilleDeCellules g5 = new GrilleDeCellules(5, 5);
        g5.activerLigneColonneOuDiagonaleAleatoire();
        System.out.println(g5);
    }
    
}
