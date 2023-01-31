package Flipper;
import java.util.Scanner;


public class Util {

    
    public static String getInput(){
        Scanner sc = new Scanner(System.in);
            System.out.println("----------------\nFlipper:\nStart drücken (s)\nMünze einwerfen (i)\nKredit anzeigen (c)\nBeenden (e)\n"+
            "1 (1)\n2 (2)\n3 (3)\nLinks (l)\nRechts (r)\n----------------");
            String input = sc.nextLine();
            return input;
        }
        public static void printMessage(String message){
            System.out.println(message);
        }
    }

