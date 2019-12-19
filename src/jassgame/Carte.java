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
    protected Couleur couleur;
    protected int forceEnAtout;
    protected int forceEnFond;
    Couleur getCouleur() {
        return couleur;
    }
    abstract void display();
    int evaluateForce(Couleur atout, Couleur fond) {
        if(atout == this.couleur) {
            return forceEnAtout;
        } else if(fond == this.couleur) {
            return forceEnFond;
        }
        else return 19;
    }
}





