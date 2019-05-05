package game.square;
import game.Player;
/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : game.game.square.GoSquare.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary
 Date        : 05.04.2019

 But         : Case Départ du board

 -----------------------------------------------------------------------------------
 */

public class GoSquare extends Square{

    /**
     * Constructeur
     */
    public GoSquare(){
        super("Départ");
    }

    /**
     * Ajoute 200 d'argent au joueur
     * @param p : Player, joueur qui a attérit sur la case
     */
    public void landedOn( Player p){
        p.addCash(200);
    }
}
