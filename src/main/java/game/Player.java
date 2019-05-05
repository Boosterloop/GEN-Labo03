package game;/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : game.Player.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary
 Date        : 05.04.2019

 But         : Représente le joueur de la partie avec sa pièce, ses dés et le
               plateau de jeu

 -----------------------------------------------------------------------------------
 */

import game.die.Cup;
import game.square.Square;

public class Player {
    private int cash = 1500;
    private String name;
    private Cup cup;
    private Board board;
    private Square location;

    /**
     * Constructeur
     * @param name  : String, nom du joueur
     * @param cup   : game.game.game.die.Cup, dés du joueur
     * @param board : game.Board, Plateau de jeu
     */
    public Player(String name, Cup cup, Board board){
        this.name = name;
        this.cup = cup;
        this.board = board;
        location = board.getStart();
    }

    /**
     * Setter pour le nom du joueur
     * @param name : String, nom du joueur
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter pour le nom du joueur
     * @return : String, nom du joueur
     */
    public String getName() {
        return name;
    }

    /**
     * Fait jouer le joueur, lançe les deux dés et se déplacer
     */
    public void takeTurn(){
        int fv = 0;
        cup.roll();
        fv = cup.getTotal();

        location = board.getSquare(location, fv);

        location.landedOn(this);

        System.out.println(name  + " se déplace de " + fv + " vers la case " +  location.getName());
    }

    /**
     * Met à jour la position du joueur
     * @param location : game.game.square.Square où se trouve le joueur
     */
    public void setLocation(Square location) {
        this.location = location;
    }

    /**
     * Rajoute de l'argent au joueur
     * @param cash  : int, somme à rajouter
     */
    public void addCash(int cash){
        this.cash += cash;
    }

    /**
     * Réduit la quantité d'argent du joueur
     * @param cash  : int, quantité d'argent à enlever
     */
    public void reduceCash(int cash){
        this.cash -= cash;
        if(this.cash < 0)
            this.cash = 0;
    }

    /**
     * Permet de savoir combien d'argent possède le joueur
     * @return  : int, quantité d'argent
     */
    public int getNetWorth(){
        return cash;
    }

    @Override
    public String toString(){
        return name;
    }
}
