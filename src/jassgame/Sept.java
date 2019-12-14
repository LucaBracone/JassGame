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
        @Override
        void display() {
        switch (couleur) {
            case PIQUES:
                System.out.print("7P");
                break;
            case TREFLES:
                System.out.print("7T");
                break;
            case COEURS:
                System.out.print("7C");
                break;
            case CARREAUX:
                System.out.print("7Q");
                break;
        }
    }
    public Sept(Couleur couleur) {
        this.couleur = couleur;
        forceEnAtout = 8 ;
        forceEnFond  = 17 ;
        }
}
