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
public class Six extends Carte {   
     public Six(Couleur couleur) {
        this.couleur = couleur;
        forceEnAtout =  9;
        forceEnFond  =  18;
    }
     
    @Override
    void display() {
        switch (couleur) {
            case PIQUES:
                System.out.print("6P");
                break;
            case TREFLES:
                System.out.print("6T");
                break;
            case COEURS:
                System.out.print("6C");
                break;
            case CARREAUX:
                System.out.print("6Q");
                break;
        }
    }
   
}
