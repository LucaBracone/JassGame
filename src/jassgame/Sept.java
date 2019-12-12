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
public class Sept extends Carte {
    void setForce(boolean isAtout, boolean isFond) {
            if(isAtout) {
                force= 8;
            } else if(isFond) {
                force= 17;
            }
            else force= 19;
        }

        public Sept(Couleur couleur) {
            this.couleur = couleur;
            points = 0;
        }
}
