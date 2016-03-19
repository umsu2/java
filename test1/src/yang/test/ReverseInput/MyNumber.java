package yang.test.ReverseInput;

import java.util.Scanner;

/**
 * Created by yang on 16/03/16.
 */
public class MyNumber {

    int getInput(){

        int inputNumber;

        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextInt();
        return inputNumber;

    }


    void printInput(int input){

        System.out.print("You have Entered: ");
        System.out.println(input);

    }

    int reverseInput(int input){
        int result;
        String stringResult;
        stringResult = Integer.toString(input);
        char[] charResult = stringResult.toCharArray();
        char[] reverseResult = charResult.clone();
        for (int i = 0; i < charResult.length; i++) {
            reverseResult[i] = charResult[charResult.length-1-i];

        }
        result = Integer.parseInt(new String(reverseResult));

        return result;
    }


}
