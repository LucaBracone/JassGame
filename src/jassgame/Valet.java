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
public class Valet extends Carte {
    void setForce(boolean isAtout, boolean isFond) {
        if(isAtout) {
            force= 1;
        } else if(isFond) {
            force= 13;
        }
        else force= 19;
    }
    void setpoints() {
        points= isAtout ? 20:2;
    }
    
    public Valet(Couleur couleur) {       
        this.couleur = couleur;
    }
}
