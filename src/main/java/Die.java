/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : Die.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary Alison
 Date        : 05.04.2019

 But         : Permet de simuler un dé

 Remarque(s) :

 Compilateur : MinGW-g++ 6.3.0
 -----------------------------------------------------------------------------------
 */

import java.util.Random;

public class Die {
    private final Random rand = new Random();
    protected final int maxFace = 6;
    protected final int minFace = 1;
    private int value;

    /**
     * @brief   : constructeur vide
     */
    public Die(){
        value = minFace;
    }

    /**
     * @brief   : change la valeur du dé (entre minFace et maxFace)
     */
    public void roll(){
        value =  minFace + rand.nextInt(maxFace - minFace);
    }

    /**
     * @brief   : Obtient la valeur sur le dés après le lancé
     * @return  : int de la valeur du dés
     */
    public int getFaceValue(){
        return value;
    }
}
