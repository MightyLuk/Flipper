package FlipperElements;
import Flipper.Flipper;
import Flipper.Util;
import Flipper.Visitor;

import java.util.Random;

public class Bottom extends FlipperElement{
    int points = 0;
    Flipper flipper;
    String[] answers = {"l","r"};

    public Bottom(Flipper flipper){
        
        this.flipper = flipper;      

    }

    @Override
    public FlipperElement hit(FlipperElement element) {  
        Util.printMessage("Bottom: Left or Right?");
        Random rand = new Random();
        int answer = rand.nextInt(2);
        
        String input = this.flipper.performAction();
        if(input == answers[answer]){
            Util.printMessage("Perfect!");
            return null;
        }
        Util.printMessage("Miss!");
        return this;        
    }

    @Override
    public int accept(Visitor v) {
        return v.visit(this);
    }

    @Override
    public int getPoints() {

        return this.points;
    }
   

}
