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
    void display() {
        switch (couleur) {
            case PIQUES:
                System.out.println("6P");
        }
    }
    public Six(Couleur couleur) {
        this.couleur = couleur;
        forceEnAtout =  9;
        forceEnFond  =  18;
    }
}
