/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jassgame;

/**
 *
 * @author Luca Bracone
 */
public class Roi extends Carte {
    void setForce(boolean isAtout, boolean isFond) {
        if(isAtout) {
            force= 4;
        } else if(isFond) {
            force= 11;
        }
        else force= 19;
    }
    public Roi(Couleur couleur) {
        this.couleur = couleur;
        points = 4;
    }
}
