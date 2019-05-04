/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : Cup.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary
 Date        : 29.04.2019

 But         : Représente une coupe de dés permettant de gérer tous les dés ensemble

 -----------------------------------------------------------------------------------
 */

public class Cup {
    private Die[] dice;

    /**
     * Constructeur à un paramètre
     * @param nbDice : int, nombre de dés de la coupe
     */
    public Cup(int nbDice){
        dice = new Die[nbDice];
        for (int i = 0; i< dice.length; i++){
            dice[i] = new Die();
        }
    }

    /**
     * Lance tous les dé de la coupe
     */
    public void roll(){
        for (int i = 0; i< dice.length; i++){
            dice[i].roll();
        }
    }

    /**
     * Additionne le résultat de tous les dés
     * @return : int, somme des valeurs de tous les dés
     */
    public int getTotal(){
        int sum = 0;
        for (int i = 0; i< dice.length; i++){
            sum += dice[i].getFaceValue();
        }

        return sum;
    }
}
