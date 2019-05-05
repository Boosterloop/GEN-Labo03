package game.square;
import game.Player;
/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : game.game.square.GoToJailSquare.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary
 Date        : 05.04.2019

 But         : Case Aller en prison du board

 -----------------------------------------------------------------------------------
 */

public class GoToJailSquare extends Square{
    private RegularSquare jail;

    /**
     * Constructeur à 2 paramètres
     * @param name   : String, nom de la case
     * @param jail  : game.game.square.RegularSquare, case prison
     */
    public GoToJailSquare(String name, RegularSquare jail){
        super(name);
        this.jail = jail;
    }

    /**
     * Envoie le joueur en prison
     * @param p : game.Player, joueur qui a attérit sur la case
     */
    public void landedOn( Player p){
        p.setLocation(jail);
    }
}
