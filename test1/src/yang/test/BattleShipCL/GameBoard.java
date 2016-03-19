package yang.test.BattleShipCL;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Random;

/**
 * Created by yang on 19/03/16.
 */
public class GameBoard {

    private int length;
    private int height;
    private String[] orientations = {"horizontal","vertical"};

    private BoardUnit[][] board;
    private List<BattleShip> battleships = new ArrayList<BattleShip>();
    final static char Y_AXIS_STARTS_WITH= 'A';
    GameBoard(int length, int height){

        this.length = length;
        this.height = height;
    }
    void setupBoard(){
        board = new BoardUnit[height+1][length+1];
        for (int i = 1; i <= height; i++){
            for (int n =1; n<=length; n++){

                board[i][n] = new BoardUnit(i,n);

            }

        }


    }
    void addBattleShip(int numberOfShips){
        //todo randomly generate battleships and place into the board.
        Random rand = new Random();
        for (int i = 0; i < numberOfShips; i ++) {
            try{

                battleships.add(new BattleShip(Utils.getRandomName(), new int[]{rand.nextInt(length)+1, rand.nextInt(height)+1}));

            }
            catch(Exception e){

            }

        }


    }
    void placeBattleShips(){

        for (BattleShip ship : battleships){

            BattleShipUnit[] battleshipArray = ship.createBattleShip();

            for(BattleShipUnit battleShipunit : battleshipArray){


                this.setBoardUnit(battleShipunit.coordinate(),battleShipunit);

            }
        }

        //create battleship , return list of battleshipunits
        // place battleshipunits onto the board



    }
    void setBoardUnit (int [] pos, BoardUnit boardUnit){

        int x = pos[0];
        int y = pos[1];
        board[y][x] = boardUnit;

    }
    void callBoardUnit (int [] pos){
        int x = pos[0];
        int y = pos[1];
        board[y][x].revealSelf();

    }
    void playerAttackAtPos(int[] attackPos){
        callBoardUnit(attackPos);
    }



}
