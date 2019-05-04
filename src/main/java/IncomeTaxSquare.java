/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : IncomeTaxSquare.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary
 Date        : 05.04.2019

 But         : Case Impôts du board

 -----------------------------------------------------------------------------------
 */

public class IncomeTaxSquare extends Square{

    /**
     * Constructeur à 1 paramètre
     * @param name : String, nom de la case
     */
    public IncomeTaxSquare(String name){
        super(name);
    }

    /**
     * Paiement des impôts par le joueur
     * @param p : Player, joueur qui a attérit sur la case
     */
    public void landedOn( Player p){
        p.reduceCash(Math.min( 200, p.getNetWorth()/10));
    }
}