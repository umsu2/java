package yang.test.BattleShipCL;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yang on 19/03/16.
 */
public class Player {
    protected static final String QUERY_FOR_NAME = "What is your name? ";
    protected static final String QUERY_FOR_MOVE = "What is your move? ";
    protected static final int MOVE_X_POSITION = 0;
    protected static final int MOVE_Y_POSITION = 1;

    private String playerName = "Default Player";
    private List<String> playerMoves = new ArrayList<String>();
    private String currentMove = "";
    Player(){
        this.getName();
    }
    String getName(){

        String name = Utils.getInput(QUERY_FOR_NAME);
        this.playerName = name;
        return name;
    }
    int[] getMove(){

        String move =  Utils.getInput(QUERY_FOR_MOVE);
        this.currentMove = move;
        playerMoves.add(move);
        return moveParser(move);

    }
    private int[] moveParser(String move){
        int[] coordinate = new int[2];

        int x = Utils.string2IntConverter(move.charAt(MOVE_X_POSITION),GameBoard.Y_AXIS_STARTS_WITH); //should be a string
        int y = Integer.parseInt(move.substring(MOVE_Y_POSITION,move.length()));
        coordinate[MOVE_X_POSITION] = x;
        coordinate[MOVE_Y_POSITION] = y;
        return coordinate;


    }

}
