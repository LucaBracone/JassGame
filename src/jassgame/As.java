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
public class As extends Carte {
    void setForce(boolean isAtout, boolean isFond) {
        if(isAtout) {
            force= 3;
        } else if(isFond) {
            force= 10;
        }
        else force= 19;
    }
    
    public As(Couleur couleur) {
        this.couleur = couleur;
        points = 11;
    }
}
