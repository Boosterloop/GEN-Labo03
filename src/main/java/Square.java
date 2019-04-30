/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : Square.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary Alison
 Date        : 05.04.2019

 But         : case de jeux du board

 Remarque(s) :

 Compilateur : MinGW-g++ 6.3.0
 -----------------------------------------------------------------------------------
 */

abstract public class Square {
    private String name;

    /**
     * @brief       : constructeur à un paramètre
     * @param name  : String, nom de la case
     */
    public Square(String name) {
        this.name = name;
    }

    /**
     * @brief       : accesseur à name
     * @return      : String, nom de la case
     */
    public String getName() {
        return name;
    }

    /**
     * @brief       : méthode abstraite, les classe enfants utilisent cette méthode pour lancer une action
     *                lorsqu'un joueur atterit sur la case.
     * @param p     : Player, joueur qui a atterit sur la case
     */
    abstract public void landedOn( Player p);

}
