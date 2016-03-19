package yang.test.BattleShipCL;

/**
 * Created by yang on 19/03/16.
 */
public class BattleShipUnit extends BoardUnit{


    boolean hit = false;
    BattleShip battleShip;
    BattleShipUnit(int y, int x, BattleShip battleShip) {
        super(y, x);
        this.battleShip = battleShip;
    }

    @Override
    void revealSelf() {
        this.hit = true;
        this.battleShip.hitAt(this);

    }
}
