package yang.test.BattleShipCL;

/**
 * Created by yang on 19/03/16.
 */
public class BoardUnit {
    private int x_axis;
    private int y_axis;
    private final static String defaultHitMessage = "is a simple board Unit";
    BoardUnit(int y, int x){

        setAxis("x",x);
        setAxis("y",y);

    }



    private void setAxis(String axis, int value){

        if (axis.contains("x")){
            this.x_axis = (this.x_axis == 0) ? value : this.x_axis;
        }

        if (axis.contains("y")){
            this.y_axis = (this.y_axis == 0) ? value : this.y_axis;
        }
    }
    int[] coordinate(){
//        System.out.println(Utils.int2StringConverter(this.x_axis,GameBoard.Y_AXIS_STARTS_WITH)+this.y_axis);
        return new int[]{this.x_axis, this.y_axis};
    }
    void revealSelf(){
        System.out.println(Utils.int2StringConverter(this.x_axis,GameBoard.Y_AXIS_STARTS_WITH)+""+this.y_axis + defaultHitMessage);

    }

}
