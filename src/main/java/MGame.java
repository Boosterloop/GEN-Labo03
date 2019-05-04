/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : MGame.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary
 Date        : 05.04.2019
 But         : Classe créant la partie

 -----------------------------------------------------------------------------------
 */
import java.util.ArrayList;
import java.util.List;

public class MGame {
    private final Board board = new Board();
    private Cup cup = new Cup(2);
    private List<Player> players = new ArrayList<Player>();
    private final int roundCnt = 20;

    /**
     * Constructeur à 1 paramètre
     * @param playersName   : Liste des noms des joueurs
     * @throws Exception    : S'il n'y a pas entre 2 et 8 noms ou si la classe Player
     *                        lance une exception
     */
    public MGame(String[] playersName) throws Exception {
        if(playersName.length < 2) {
            throw new Exception("Pas assez de joueurs");
        }
        if(playersName.length > 8) {
            throw new Exception("Trop de joueurs");
        }

        for(String name: playersName){
            players.add(new Player(name, cup, board));
        }
    }

    /**
     * Lance le jeu avec roundCnt tours
     */
    public void playGame(){
        for(int i = 0; i < roundCnt; i++){
            playRound();
        }
    }

    /**
     * Effectue un tour de jeu
     */
    private void playRound(){
        for(Player player : players){
            player.takeTurn();
        }
    }
}
