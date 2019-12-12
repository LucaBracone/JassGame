/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jassgame;

import jassgame.Couleur;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Luca Bracone
 */
class Joueur {
    Main main;
    String nom;
    void setMain(List<Carte> main) {
        this.main = new Main(main);
    }
    public Joueur(String nom) {
        this.nom = nom;
    }
    
    Couleur selectAtout() {
        Couleur selection;
        Scanner bob = new Scanner(System.in);
        System.out.println("Selectionner atout. P = piques, T= trèfles, C= coeurs, Q=carreaux ");
        String input;
        do {
            input = bob.nextLine();
        } while (!"P".equals(input) || !"T".equals(input) || !"C".equals(input) || !"Q".equals(input) );
        switch (input) {
            case "P":
                selection = PIQUES;
        }
        return selection;
    }
}
