/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : Board.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary Alison
 Date        : 05.04.2019

 But         : Représente la board du jeu

 Remarque(s) :

 Compilateur : MinGW-g++ 6.3.0
 -----------------------------------------------------------------------------------
 */


import java.util.*;

public class Board {
    private LinkedList<Square> squares;
    private final int NB_SQUARES = 40;
    private List<String> pieces = new ArrayList<>(Arrays.asList("Dés à coudre", "Brouette", "Botte", "Chien",
                        "Voiture", "Fer à repasser", "Chapeau", "Bateau"));
    private Random rand = new Random();

    //Constructeur
    public Board() {
        squares = new LinkedList<>();
        // Depart
        squares.add(new GoSquare("Départ"));

        for(int i = 1; i < NB_SQUARES; i++) {
            squares.add(new RegularSquare("Square " + i));
        }
    }

    //getteur pour la case
    public LinkedList<Square> getSquares() {
        return squares;
    }

    /**
     * @brief       : récupère la location selon le déplacement
     * @param oldLoc: Square qui est l'ancienne location
     * @param fv    : int du nombre de case pour se déplacer
     * @return      : Square de la nouvelle location
     */
    public Square getSquare(Square oldLoc, int fv) {
        Iterator iterator = squares.iterator();
        Square square;

        int i = 0;
        while (iterator.hasNext()) {
            if(iterator.next().equals(oldLoc)) {
                break;
            }
            i++;
        }

        return squares.get((i + fv) % NB_SQUARES);
    }

    //Retourne la location de départ
    public Square getStart() {
        return squares.getFirst();
    }

    /**
     * @brief   : permet de recevoir une pièce du jeu
     * @return  : String de la pièce
     */
    public String getPiece() {
        int index = rand.nextInt(pieces.size());
        String piece = pieces.get(index);
        pieces.remove(piece);
        return piece;
    }
}
