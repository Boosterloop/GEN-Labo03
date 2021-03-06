package game;/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : game.Board.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary
 Date        : 05.04.2019

 But         : Représente la board du jeu

 -----------------------------------------------------------------------------------
 */


import game.square.*;

import java.util.*;

public class Board {
    private LinkedList<Square> squares;
    private final int NB_SQUARES = 40;

    /**
     * Constructeur
     */
    public Board() {
        squares = new LinkedList<>();
        // Depart
        squares.add(new GoSquare());

        for(int i = 1; i < NB_SQUARES; i++) {
            if(i == 10) {
                squares.add(new RegularSquare("Prison"));
            }
            else if(i == 4 || i == 38) {
                squares.add(new IncomeTaxSquare());
            }
            else if(i == 30) {
                squares.add(new GoToJailSquare((RegularSquare)squares.get(10)));
            }
            else {
                squares.add(new RegularSquare("Square " + i));
            }
        }
    }

    /**
     * Getter pour squares
     * @return : LinkedList<Square>, liste des cases
     */
    public LinkedList<Square> getSquares() {
        return squares;
    }

    /**
     * Récupère la location selon le déplacement
     * @param oldLoc : Square, l'ancienne location
     * @param fv     : int, nombre de case pour se déplacer
     * @return       : game.game.square.Square, nouvelle location
     */
    public Square getSquare(Square oldLoc, int fv) {
        Iterator iterator = squares.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            if(iterator.next().equals(oldLoc)) {
                break;
            }
            i++;
        }

        return squares.get((i + fv) % NB_SQUARES);
    }

    /**
     * Retourne la case départ
     * @return : Square, case départ
     */
    public Square getStart() {
        return squares.getFirst();
    }

}
