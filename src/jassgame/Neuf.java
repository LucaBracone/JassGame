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
public class Neuf extends Carte {

    void setForce(boolean isAtout, boolean isFond) {
        if(isAtout) {
            force= 2;
        } else if(isFond) {
            force= 15;
        }
        else force= 19;
    }
    void setpoints() {
        points = isAtout ? 14:0;
    }
    public Neuf(Couleur couleur) {
        this.couleur = couleur;
    }
}
