/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff_brest_version_console;

/**
 *
 * @author eloisebrest
 */
public class CelluleLumineuse {
    
    private boolean etat;
    
    public CelluleLumineuse() {
        this.etat = false;
    }

    public void activerCellule() {
        this.etat = !this.etat;
    }

    public void eteindreCellule() {
        this.etat = false;
    }

    public boolean estEteinte() {
        return !etat;
    }

    public boolean getEtat() {
        return etat;
    }


    @Override
    public String toString() {
        return etat ? "X" : "O";
    }
    
}
