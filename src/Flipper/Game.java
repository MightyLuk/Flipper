package Flipper;
import FlipperElements.*;
import ViewFactory.AbstractViewFactoryI;

import java.util.Random;
import java.util.ArrayList;

public class Game {
    private static Game instance;
    ArrayList<FlipperElement> elements = new ArrayList<FlipperElement>();
    TargetMediator mediator = new TargetMediator(this);
    AbstractViewFactoryI factory;
    
    int highscore = 0;
    
    int balls = 3;
    int round = 1;


    private Game(){
        Flipper flipper = Flipper.Instance();
        this.factory = flipper.factory;
        this.elements.add(new Bottom(flipper));
        elements.add(new Bumper());
        elements.add(new Bumper());
        elements.add(new Bumper());
        elements.add(new Hole(flipper));
        elements.add(new Hole(flipper));
        elements.add(new Target("Thanks", mediator));
        elements.add(new Target("for", mediator));
        elements.add(new Target("all", mediator));
        elements.add(new Target("the", mediator));
        elements.add(new Target("fish", mediator));
        elements.add(new Kicker());
        elements.add(new SlingShot());         

    }
    private FlipperElement executeCommand(Command command, FlipperElement element) {
        return command.execute(element);
    }
    
    public static Game Instance(){
        if (instance == null){
            instance = new Game();
        }
        return instance;
    }
    public void addBall(){
        this.balls++;
    }
    public void resetGame(){
        instance = null;
    }
    public void addElement(FlipperElement element){
        elements.add(element);
    }
    public void removeElement(FlipperElement element){
        elements.remove(element);
    }
    public void startGame(){
        this.factory.printBall1();
        ArrayList<FlipperElement> hittedElements = new ArrayList<FlipperElement>();
        while(balls > 0){
            
            
            Random rand = new Random();
            int n = rand.nextInt(elements.size());
            FlipperElement hittedElement = executeCommand(new HitCommand(this), elements.get(n));
            
            if (hittedElement instanceof Bottom){
                int roundscore = 0;
                Visitor visitor = new Visitor();
                for(FlipperElement element : hittedElements){
                     int points = element.accept(visitor);
                     points = points + points *(round -1);
                     roundscore = roundscore + points;
                }
                factory.printRoundscore();
                System.out.println(roundscore);
                highscore = highscore + roundscore;
                mediator.resetTargetMediator();
                balls--;
                round++;
                if(balls > 0){
                    switch(round){                    
                        case 2:
                        this.factory.printBall2();
                        break;
                        case 3:
                        this.factory.printBall3();
                        break;
                        case 4:
                        this.factory.printBallExtra();
                        break;
                        default:
                        break;
                    }
                }

            } else if(hittedElement == null){

            } else {
                hittedElements.add(hittedElement);
            }
        }
        factory.printHighscore();
        System.out.println(highscore);
    }
}


