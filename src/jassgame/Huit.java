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
        @Override
        void display() {
        switch (couleur) {
            case PIQUES:
                System.out.print("8P");
                break;
            case TREFLES:
                System.out.print("8T");
                break;
            case COEURS:
                System.out.print("8C");
                break;
            case CARREAUX:
                System.out.print("8Q");
                break;
        }
    }
    public Huit(Couleur couleur) {
        this.couleur = couleur;
        forceEnAtout = 7 ;
        forceEnFond  = 16 ;
        }  
}
