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
        @Override
        void display() {
        switch (couleur) {
            case PIQUES:
                System.out.print("10P");
                break;
            case TREFLES:
                System.out.print("10T");
                break;
            case COEURS:
                System.out.print("10C");
                break;
            case CARREAUX:
                System.out.print("10Q");
                break;
        }
    }
        
    public Dix(Couleur couleur) {
        this.couleur = couleur;
        forceEnAtout = 6 ;
        forceEnFond  =  14;
    }
    
}
