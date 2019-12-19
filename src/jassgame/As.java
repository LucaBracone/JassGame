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
public class As extends Carte {

    @Override
    void display() {
        switch (couleur) {
            case PIQUES:
                System.out.print("AP");
                break;
            case TREFLES:
                System.out.print("AT");
                break;
            case COEURS:
                System.out.print("AC");
                break;
            case CARREAUX:
                System.out.print("AQ");
                break;
        }
    }

    public As(Couleur couleur) {
        this.couleur = couleur;
        forceEnAtout = 3;
        forceEnFond = 10;
    }
}
