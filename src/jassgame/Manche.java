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
public class Manche {
    Deck deck;
    int mancheNumber;
    Couleur atout;
    Joueur joueur1;
    Joueur joueur2;
    Joueur joueur3;
    Joueur joueur4;
    void distribute() {
        joueur1.setMain(deck.deck.subList(0,9));
        joueur2.setMain(deck.deck.subList(9,18));
        joueur3.setMain(deck.deck.subList(18,27));
        joueur4.setMain(deck.deck.subList(27,36));
    }
    public Manche(int num, Joueur joueur1,Joueur joueur2, Joueur joueur3, Joueur joueur4) {
        deck = new Deck();
        this.joueur1= joueur1;
        this.joueur2= joueur2;
        this.joueur3= joueur3;
        this.joueur4= joueur4;
        mancheNumber=num;
    }
    void setAtout() {
        switch(mancheNumber % 4) {
            case 0:
                atout = joueur1.selectAtout();
                break;
            case 1:
                atout = joueur2.selectAtout();
                break;
            case 2: 
                atout = joueur3.selectAtout();
            case 3:
                atout = joueur4.selectAtout();
        }
    }
}
