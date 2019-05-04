/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : Square.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary
 Date        : 05.04.2019

 But         : Classe abstraite pour représenter les cases du board

 -----------------------------------------------------------------------------------
 */

abstract public class Square {
    private String name;

    /**
     * Constructeur à un paramètre
     * @param name  : String, nom de la case
     */
    public Square(String name) {
        this.name = name;
    }

    /**
     * Getter pour name
     * @return      : String, nom de la case
     */
    public String getName() {
        return name;
    }

    /**
     * Méthode abstraite, les classes enfants utilisent cette méthode
     * pour lancer une action lorsqu'un joueur attérit sur la case.
     * @param p : Player, joueur qui a attérit sur la case
     */
    abstract public void landedOn( Player p);

}
