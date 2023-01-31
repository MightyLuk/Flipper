
package Flipper;


import java.util.Scanner;

import ViewFactory.AbstractViewFactoryI;



public class Flipper {

    private static Flipper instance;
    private FlipperStateI flipperState;
    public AbstractViewFactoryI factory;
    private int credits = 0;
    Scanner sc = new Scanner(System.in);

    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }
    private Flipper(AbstractViewFactoryI factory){
        this.factory = factory;
        setFlipperState(new NoCreditState(this));
        

    }
    public Flipper() {
    }
    public void setFlipperState(FlipperStateI flipperState){
        this.flipperState = flipperState;
    }
    public void pressStart(){
       
        flipperState.pressStart();        
        
    }
    public void insertCoin(){
        this.credits++;
        if (this.credits == 1){
            setFlipperState(new ReadyState(this));
        }
    }
    public void showCredit() {
        System.out.println("Kredit: "+ credits + " Münzen!");
    }
    public void startGame(){
        
        Game game = Game.Instance();
        game.startGame();
        setFlipperState(new EndState(this));
        pressStart();
        game.resetGame();
        if(credits == 0) {
            setFlipperState(new NoCreditState(this));
        } else {
            setFlipperState(new ReadyState(this));
        }
    }
    public static Flipper Instance(AbstractViewFactoryI factory){
        if (instance == null){
            
            instance = new Flipper(factory);
        } 
        return instance;
    }
    public static Flipper Instance(){
        if (instance == null){
            
            instance = new Flipper();
        } 
        return instance;
    }
    public String performAction(){
        String input = Util.getInput();
        switch(input){
            case "s":
            this.pressStart();
            return "s";
            case "i":
            this.insertCoin();
            return "i";
            case "e":
            return "e";            
            case "c":
            this.showCredit();
            return "c";
            case "1":
            
            return "1";
            case "2":
            
            return "2";
            case "3":
            
            return "3";
            case "l":
            
            return "l";
            case "r":
            
            return "r";
            default:
            System.out.println("Keine gültige Eingabe!");
            return "99";
        }
    }
    
}

