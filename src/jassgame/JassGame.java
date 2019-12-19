/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jassgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Luca Bracone
 */
public class JassGame {

    public static void main(String[] args) {
        // TODO code application logic here
        Joueur joueur1 = new Joueur("Alfred");
        Joueur joueur2 = new Joueur("Bobby");
        Joueur joueur3 = new Joueur("Claude");
        Joueur joueur4 = new Joueur("Daniel");
        //TODO make a list of players so that you can cycle the command to make them select a card
        List<Joueur> playerlist = new ArrayList<>(Arrays.asList(joueur1, joueur2, joueur3, joueur4));

        int pointsEquipeNS = 0;
        int pointsEquipeEW = 0;
        int index = 0;
        while (pointsEquipeNS < 1000 && pointsEquipeEW < 1000) {
            Manche mancheCourante;
            mancheCourante = new Manche(index, joueur1, joueur2, joueur3, joueur4);
            mancheCourante.distribute();
            mancheCourante.setAtout();
            int whostarts = index % 4;
            int remainingcards = 9;
            int beginner = whostarts;
            while (remainingcards >= 1) {
                ArrayList<Carte> NSaccumulated = new ArrayList<>();
                ArrayList<Carte> EWaccumulated = new ArrayList<>();
                List<Carte> playedCards = new ArrayList();
                Couleur couleurDemandee = Couleur.CARREAUX;
                //Les joueurs mettent les cartes en jeux
                for (int i = 0; i <= 3; i++) {
                    Carte played = playerlist.get((i + beginner) % 4).playCard();
                    playedCards.add(i,played);
                    if (i == 0) {
                        couleurDemandee = playedCards.get(0).getCouleur();
                    }
                }
                //Evaluation de la carte la plus forte
                ArrayList<Integer> playedCardsStrength = new ArrayList<Integer>();
                for (int i = 0; i <= 3; i++) {
                    int cardstrength = playedCards.get(i).evaluateForce(mancheCourante.getAtout(), couleurDemandee);
                    playedCardsStrength.add(cardstrength);
                }
                //Trouve position maximale
                int winner = 0;
                for (int j = 0; j < playedCardsStrength.size(); j++) {
                    winner = playedCardsStrength.get(j) > playedCardsStrength.get(winner) ? j : winner;
                }
                if (winner == 0 || winner == 2) {
                    for (Carte tobeadded : playedCards) {
                        NSaccumulated.add(tobeadded);
                    }
                } else {
                    for (Carte tobeadded : playedCards) {
                        EWaccumulated.add(tobeadded);
                    }
                }
                beginner = winner;
                remainingcards--;
            }
            index++;
        }
    }

}
