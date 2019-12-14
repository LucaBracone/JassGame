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
    @Override
    void display() {
        switch (couleur) {
            case PIQUES:
                System.out.print("9P");
                break;
            case TREFLES:
                System.out.print("9T");
                break;
            case COEURS:
                System.out.print("9C");
                break;
            case CARREAUX:
                System.out.print("9Q");
                break;
        }
    }
    public Neuf(Couleur couleur) {
        this.couleur = couleur;
        forceEnAtout =  2;
        forceEnFond  =  15;
    }
}
