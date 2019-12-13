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

    public Neuf(Couleur couleur) {
        this.couleur = couleur;
        forceEnAtout =  2;
        forceEnFond  =  15;
    }
}
