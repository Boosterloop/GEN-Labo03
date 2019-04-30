/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : MGame.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary Alison
 Date        : 05.04.2019
 But         : Classe créant la partie

 Remarque(s) :

 Compilateur : MinGW-g++ 6.3.0
 ----
 -------------------------------------------------------------------------------
 */
import java.util.ArrayList;
import java.util.List;

public class MGame {
    private final Board board = new Board();
    private Cup cup = new Cup(2);
    private List<Player> players = new ArrayList<Player>();
    private final int roundCnt = 20;

    /**
     * @brief               : constructeur à un paramètre
     * @param playersName   : liste des noms de joueurs
     * @throws Exception    : s'il n'y a pas entree 2 et 8 noms ou si la classe Player lance une exception
     */
    public MGame(String[] playersName) throws Exception{
        if(playersName.length < 2) {
            throw new Exception("pas assez de joueurs");
        }
        if(playersName.length > 8) {
            throw new Exception("trop de joueurs");
        }

        for(String name: playersName){
            //players.add(new Player(name, cup, board));
        }
    }

    /**
     * @brief               : lance le jeu avec roundCnt tours
     */
    public void playGame(){
        for(int i = 0; i < roundCnt; i++){
            playRound();
        }
    }

    /**
     * @brief               : joue un tour de jeu
     */
    private void playRound(){
        for(Player player : players){
            player.takeTurn();
        }
    }
}
