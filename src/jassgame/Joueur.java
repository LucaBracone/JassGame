/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jassgame;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Luca Bracone
 */
class Joueur {
    private Main hand;
    String nom;

    Joueur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    void setHand(List<Carte> main) {
        this.hand = new Main(main);
    }
    Main getHand() {
        return hand;
    }
    public Joueur(String nom) {
        this.nom = nom;
    }
    
    Couleur selectAtout() {
        Couleur selection = Couleur.TREFLES;
        Scanner bob = new Scanner(System.in);
        System.out.println("Selectionner atout. P = piques, T= trèfles, C= coeurs, Q=carreaux ");
        String input;
        do {
            input = bob.nextLine();
        } while (!"P".equals(input) || !"T".equals(input) || !"C".equals(input) || !"Q".equals(input) );
        switch (input) {
            case "P":
                selection = Couleur.PIQUES;
                break;
            case "T":
                selection = Couleur.TREFLES;
                break;
            case "C":
                selection = Couleur.COEURS;
                break;
            case "Q":
                selection = Couleur.CARREAUX;
                break;
        }
        return selection;
    }
    Carte playCard(){
        int selection =0;
        System.out.println("Selectionner carte:");
        hand.display();
        Scanner scanner = new Scanner (System.in);
        do {
            selection = scanner.nextInt()-1;
        } while (selection <0 || selection > hand.size()-1);
        Carte selected = hand.selectCard(selection);
        hand.discard(selection);
        return selected;
    }
}
