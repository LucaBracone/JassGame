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
public class Huit extends Carte {
    void setForce(boolean isAtout, boolean isFond) {
            if(isAtout) {
                force= 7;
            } else if(isFond) {
                force= 16;
            }
            else force= 19;
        }

        public Huit(Couleur couleur) {
            this.couleur = couleur;
            points = 0;
        }  
}
