/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : GoToJailSquare.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary Alison
 Date        : 05.04.2019

 But         : case régulière de jeux du board

 Remarque(s) :

 Compilateur : MinGW-g++ 6.3.0
 -----------------------------------------------------------------------------------
 */

public class GoToJailSquare extends Square{
    private RegularSquare jail;

    /**
     * @brief       : constructeur à 2 paramètre
     * @param nom   : String, nom de la case
     * @param jail  : RegularSquare, case prison
     */
    public GoToJailSquare(String nom, RegularSquare jail){
        super(nom);
        this.jail = jail;
    }

    public void landedOn( Player p){
        p.seLocation(jail);
    }
}
