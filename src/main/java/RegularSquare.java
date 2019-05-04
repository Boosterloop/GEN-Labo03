/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : RegularSquare.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary
 Date        : 05.04.2019

 But         : Case régulière (normale) du board

 -----------------------------------------------------------------------------------
 */

public class RegularSquare extends Square{

    /**
     * Constructeur à 1 paramètre
     * @param name   : String, nom de la case
     */
    public RegularSquare(String name){
        super(name);
    }

    /**
     * Action à faire quand le joueur arrive sur la case, ici rien
     * @param p     : Player, joueur qui a attérit sur la case
     */
    public void landedOn( Player p){
        //nothing
    }
}
