package game.square;
import game.Player;
/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : game.game.square.GoToJailSquare.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary
 Date        : 05.04.2019

 But         : Case Allez en prison du board

 -----------------------------------------------------------------------------------
 */

public class GoToJailSquare extends Square{
    private RegularSquare jail;

    /**
     * Constructeur à 1 paramètre
     * @param jail  : RegularSquare, case prison
     */
    public GoToJailSquare(RegularSquare jail){
        super("Allez en prison");
        this.jail = jail;
    }

    /**
     * Envoie le joueur en prison
     * @param p : Player, joueur qui a attérit sur la case
     */
    public void landedOn( Player p){
        p.setLocation(jail);
    }
}
