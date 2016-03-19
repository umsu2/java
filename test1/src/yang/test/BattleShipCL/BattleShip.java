package yang.test.BattleShipCL;

/**
 * Created by yang on 19/03/16.
 */
public class BattleShip {

    private static final String SINK_MSG = "You have Sank BattleShip: ";
    private static final String HIT_MSG = "You have hit BattleShip: ";
    private String name;
    private BattleShipUnit[] battleShipUnits;
    private int[] startingPos;
    private String orientation;
    private int size;
    private boolean sank = false;

    BattleShip(String name,int size, int[] startingPos, String orientation){

        this.name = name;
        this.size = size;
        this.startingPos = startingPos;
        this.orientation = orientation;

    }

    BattleShip(String name, int[] startingPos){

        this.name = name;
        this.size = 3;
        this.startingPos = startingPos;
        this.orientation = "vertical";
        //todo in the constructor try to make battleship at the position given the info. if the spot is taken, raise exception. 
    }


    BattleShipUnit[] createBattleShip(){



        battleShipUnits = new BattleShipUnit[size];
        for(int i=0; i < size ; i++){

            if(orientation == "vertical") {
                battleShipUnits[i] = new BattleShipUnit(startingPos[0] + i, startingPos[1], this);
            }
            else if (orientation == "vertical"){
                battleShipUnits[i] = new BattleShipUnit(startingPos[0], startingPos[1] + i, this);
            }

        }


        return battleShipUnits;

    }


    public void hitAt(BattleShipUnit battleShipUnit) {
        int numberOfHits=0;
        System.out.println(HIT_MSG + name + "at" + battleShipUnit.coordinate());
        for (int i = 0; i < battleShipUnits.length; i++){
            if(battleShipUnits[i].hit == true){
                numberOfHits += 1;
            }
        }

        if (this.sank == true){

            System.out.println(SINK_MSG + name + " ALREADY!");
        }
        else {
            if (numberOfHits == battleShipUnits.length) {
                this.sank = true;
                System.out.println(SINK_MSG + name);
            }
        }



    }
}
