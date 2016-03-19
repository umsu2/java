package yang.test.BattleShipCL;

import java.io.FileReader;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;


import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 * Created by yang on 19/03/16.
 */
public class Utils {

    static String getInput(String query){


        System.out.println(query);
        String result;
        Scanner scanner = new Scanner(System.in);
        result = scanner.nextLine();
//        System.out.println(query + ": " + result);
        return result;

    }
    static char int2StringConverter(int num,char base){

        char defaultcharacter = (char) (base-1);
        return (char)(defaultcharacter + num);

    }

    static int string2IntConverter(char character,char base){
        int intResult;

        intResult = character - base + 1;

        return intResult;
    }
    static String getRandomName(){
//todo why the hell the filereder won't read absolute path?
        int n = 0;
        String battleShipNameSuffix = "BattleShip#";
        n ++;
        return battleShipNameSuffix+n;
//        JSONParser parser = new JSONParser();
//        Object obj = null;
//        try {
//            FileReader fileReader = new FileReader("/home/yang/Desktop/Learn/java/test1/src/yang/test/BattleShipCL/MOCK_NAMES.json");
//            obj = parser.parse(new FileReader("/home/yang/Desktop/Learn/java/test1/src/yang/test/BattleShipCL/MOCK_NAMES.json"));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        JSONArray array = (JSONArray)obj;
//
//
//
//        return "dsf";
    }


}
