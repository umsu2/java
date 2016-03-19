package yang.test.BattleShipCL;

/**
 * Created by yang on 19/03/16.
 */
public class BattleShipGame {

    GameBoard gameBoard = new GameBoard(10,10);
    BattleShipGame(){
        gameBoard.setupBoard();
        gameBoard.addBattleShip();
        gameBoard.placeBattleShips();
    }
    public void startGame(){
        Player player =  new Player();
        while(true){
            gameBoard.playerAttackAtPos(player.getMove());
        }
    }

}
