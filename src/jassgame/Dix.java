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
public class Dix extends Carte {
    void setForce(boolean isAtout, boolean isFond) {
        if(isAtout) {
            force= 6;
        } else if(isFond) {
            force= 14;
        }
        else force= 19;
    }
    
    public Dix(Couleur couleur) {
        this.couleur = couleur;
        points = 10;
    }
    
}
