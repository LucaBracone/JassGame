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
public class Main {
    List<Carte> main;
    void discard(int num) {
        main.remove(num);
    }
    void display() {
        for(Carte toDisplay : main) {
            toDisplay.display();
            System.out.print("  ");
        }
    }
    Carte selectCard(int num) {
        return main.get(num);
    }
    int size() {
        return main.size();
    }
    public Main(List<Carte> donne) {
        this.main = donne;
    }
}
