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
public class Valet extends Carte {
        @Override
        void display() {
        switch (couleur) {
            case PIQUES:
                System.out.print("JP");
                break;
            case TREFLES:
                System.out.print("JT");
                break;
            case COEURS:
                System.out.print("JC");
                break;
            case CARREAUX:
                System.out.print("JQ");
                break;
        }
    }
    public Valet(Couleur couleur) {       
        this.couleur = couleur;
        forceEnAtout =  1;
        forceEnFond  =  13;
    }
}
