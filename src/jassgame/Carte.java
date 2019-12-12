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

public abstract class Carte {
    Couleur couleur;
    boolean isAtout = false;
    boolean isFond;
    int force;
    int points;
    public int getForce() {
        return force;
    }
}





