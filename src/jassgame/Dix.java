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
    public Dix(Couleur couleur) {
        this.couleur = couleur;
        forceEnAtout = 6 ;
        forceEnFond  =  14;
    }
    
}
