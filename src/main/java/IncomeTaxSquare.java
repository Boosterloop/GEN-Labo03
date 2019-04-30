/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : IncomeTaxSquare.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary Alison
 Date        : 05.04.2019

 But         : case régulière de jeux du board

 Remarque(s) :

 Compilateur : MinGW-g++ 6.3.0
 -----------------------------------------------------------------------------------
 */

public class IncomeTaxSquare extends Square{

    /**
     * @brief       : constructeur à 1 paramètre
     * @param name   : String, nom de la case
     */
    public IncomeTaxSquare(String name){
        super(name);
    }

    public void landedOn( Player p){
        p.reduceCash(Math.min( 200, p.getNetWorth()/10));
    }
}