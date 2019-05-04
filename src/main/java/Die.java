/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : Die.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary
 Date        : 05.04.2019

 But         : Classe permettant de représenter un dé

 -----------------------------------------------------------------------------------
 */

import java.util.Random;

public class Die {
    private final Random rand = new Random();
    protected final int maxFace = 6;
    protected final int minFace = 1;
    private int value;

    /**
     * Constructeur vide
     */
    public Die(){
        value = minFace;
    }

    /**
     * Lance le dé et change la valeur(entre minFace et maxFace)
     */
    public void roll(){
        value =  minFace + rand.nextInt(maxFace - minFace);
    }

    /**
     * Obtient la valeur du dé après le lancé
     * @return  : int, valeur du dé
     */
    public int getFaceValue(){
        return value;
    }
}
