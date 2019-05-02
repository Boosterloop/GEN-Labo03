/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : Player.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary Alison
 Date        : 05.04.2019

 But         : Représente le joueur de la partie avec sa pièce et ses dés et le
 plateau de jeux

 Remarque(s) :

 Compilateur : MinGW-g++ 6.3.0
 -----------------------------------------------------------------------------------
 */

public class Player {
    private int cash = 1500;
    private String name;
    private Cup cup;
    private Board board;
    private Square location;

    //constructeur
    public Player(String name, Cup cup, Board board){
        this.name = name;
        this.cup = cup;
        this.board = board;
        location = board.getStart();
    }

    //get et set
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * @brief   : Fait jouer le joueur et lançant les deux dés et se déplacer
     */
    public void takeTurn(){
        int fv = 0;
        cup.roll();
        fv = cup.getTotal();

        location = board.getSquare(location, fv);

        location.landedOn(this);
    }

    /**
     * @brief           : Met à jour la position du joueur
     * @param location  : Square ou se trouve le joueur
     */
    public void setLocation(Square location) {
        this.location = location;
    }

    /**
     * @brief       : Rajoute de l'argent au joueur
     * @param cash  : int de la somme à rajouter
     */
    public void addCash(int cash){
        this.cash += cash;
    }

    /**
     * @brief       : Réduit la quantité d'argent du joueur
     * @param cash  : int de la quantité d'argent à enlever
     */
    public void reduceCash(int cash){
        this.cash -= cash;
        if(this.cash < 0)
            this.cash = 0;
    }

    /**
     * @brief   : Permet de savoir combien d'argent possède le joueur
     * @return  : int de la quantité d'argent
     */
    public int getNetWorth(){
        return cash;
    }

    @Override
    public String toString(){
        return name;
    }
}
