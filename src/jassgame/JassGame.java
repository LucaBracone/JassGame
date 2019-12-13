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
public class JassGame {

    public static void main(String[] args) {
        // TODO code application logic here
    Joueur joueur1 = null;
    Joueur joueur2 = null;
    Joueur joueur3 = null;
    Joueur joueur4 = null;
   
        int pointsEquipeNS = 0;
        int pointsEquipeEW = 0;
        int index = 0;
        while(pointsEquipeNS < 1000 || pointsEquipeEW < 1000) {
            Manche mancheCourante;
            mancheCourante = new Manche(index,joueur1,joueur2,joueur3,joueur4);
            mancheCourante.distribute();
            mancheCourante.setAtout();
            
            
            
            index++;
        }
    }
    
}
