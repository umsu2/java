package yang.test.ReverseInput;

/**
 * Created by yang on 16/03/16.
 */
public class Main {

    public static void main(String[] args) {

        MyNumber myNumber = new MyNumber();

        while(true){

            int inputResult = myNumber.getInput();
            myNumber.printInput(inputResult);
            myNumber.printInput(myNumber.reverseInput(inputResult));

        }

    }

}
