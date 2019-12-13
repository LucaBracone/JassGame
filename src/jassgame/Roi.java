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
    public Roi(Couleur couleur) {
        this.couleur = couleur;
        forceEnAtout = 4 ;
        forceEnFond  = 11 ;
    }
}
