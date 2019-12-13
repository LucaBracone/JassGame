/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jassgame;

import java.util.List;

/**
 *
 * @author Luca Bracone
 */
public class Manche {
    int mancheNumber;
    Deck deck;
    Couleur atout;
    Joueur joueur1;
    Joueur joueur2;
    Joueur joueur3;
    Joueur joueur4;
    List<Carte> obtenuEquipeNS;
    List<Carte> obtenuEquipeEW;
    
    void distribute() {
        joueur1.setHand(deck.getDeck().subList(0,9));
        joueur2.setHand(deck.getDeck().subList(9,18));
        joueur3.setHand(deck.getDeck().subList(18,27));
        joueur4.setHand(deck.getDeck().subList(27,36)); 
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
        //LE JOUEUER CHOISIT L'ATOUT
        switch(mancheNumber % 4) {
            case 0:
                atout = joueur1.selectAtout();
                break;
            case 1:
                atout = joueur2.selectAtout();
                break;
            case 2: 
                atout = joueur3.selectAtout();
                break;
            case 3:
                atout = joueur4.selectAtout();
                break;
        }
    }
}
