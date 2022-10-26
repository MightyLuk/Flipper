import java.util.Scanner;
import FlipperElements.*;


public class Main {
    public static void main(String[] args) {
        Flipper flipper = Flipper.Instance();
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        while(run){
            String input = null;
            System.out.println("Flipper: Start drücken (s) - Münze einwerfen (i) - Kredit anzeigen (c) - Beenden (e)");
            input = sc.nextLine();
            switch(input){
                case "s":
                flipper.pressStart();
                break;
                case "i":
                flipper.insertCoin();
                break;
                case "e":
                run = false;
                break;
                case "c":
                flipper.showCredit();
                break;
                default:
                System.out.println("Keine gültige Eingabe!");
            }
        }
 /*        flipper.pressStart();//noCredit
        flipper.insertCoin();
        flipper.pressStart();//ready
        flipper.pressStart();//play: authors
        */
        
    }
}
