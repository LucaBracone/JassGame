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

    private Hand hand;
    String nom;

    void setHand(List<Carte> main) {
        this.hand = new Hand(main);
    }

    Hand getHand() {
        return hand;
    }

    public Joueur(String nom) {
        this.nom = nom;
    }

    Couleur selectAtout() {
        Couleur selection = Couleur.TREFLES;
        Scanner bob = new Scanner(System.in);
        System.out.print(nom + ", Votre main: ");
        hand.display();
        System.out.println(nom + ", Selectionner atout. P = piques, T= trèfles, C= coeurs, Q=carreaux ");
        String input;
        do {
            input = bob.nextLine();
        } while (!"P".equals(input) && !"T".equals(input) && !"C".equals(input) && !"Q".equals(input));
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

    Carte playCard() {
        int selection = 0;
        System.out.println(nom + ", Selectionner carte:");
        hand.display();
        Scanner scanner = new Scanner(System.in);
        do {
            selection = scanner.nextInt() - 1;
            System.out.println(selection);
        } while (selection < 0 || selection > hand.size() - 1);
        Carte selected = hand.get(selection);
        scanner.close();
        hand.discard(selection);
        System.out.print(nom + " apres avoir joué votre main est: ");
        hand.display();
        return selected;
    }
}
