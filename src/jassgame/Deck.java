/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jassgame;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Luca Bracone
 */
public class Deck {
    private List<Carte> deck;
    public  List<Carte> getDeck() {
        return deck;
    }
    public Deck() {
        for(Couleur couleur : Couleur.values()) {
            deck.add(new As(couleur));
            deck.add(new Roi(couleur));
            deck.add(new Reine(couleur));
            deck.add(new Valet(couleur));
            deck.add(new Dix(couleur));
            deck.add(new Neuf(couleur));
            deck.add(new Huit(couleur));
            deck.add(new Sept(couleur));
            deck.add(new Six(couleur));
        }
        Collections.shuffle(deck);
    }

}
