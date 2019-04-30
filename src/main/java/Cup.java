/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : Cup.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary Alison
 Date        : 29.04.2019

 But         : Représente une coupe de dé, permet de gérer tout les dés ensemble

 Remarque(s) :

 Compilateur : MinGW-g++ 6.3.0
 -----------------------------------------------------------------------------------
 */

public class Cup {
    private Die[] dice;

    /**
     * @brief           : constructeur à un paramètre
     * @param nbDice    : int, nombre de dé de la coupe
     */
    public Cup( int nbDice){
        dice = new Die[nbDice];
        for (int i = 0; i< dice.length; i++){
            dice[i] = new Die();
        }
    }

    /**
     * @brief           : lance tout les dé de la coupe
     */
    public void roll(){
        for (int i = 0; i< dice.length; i++){
            dice[i].roll();
        }
    }

    /**
     * @brief           : additionne le résultat de tout les dés
     * @return          : int, la somme de tout les dés
     */
    public int getTotal(){
        int sum = 0;
        for (int i = 0; i< dice.length; i++){
            sum += dice[i].getFaceValue();
        }

        return sum;
    }
}
