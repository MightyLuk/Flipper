package FlipperElements;
import Flipper.Flipper;
import Flipper.Util;
import java.util.Random;
import Flipper.Visitor;

public class Hole extends FlipperElement{
    int points = 500;
    Flipper flipper;
    String[] answers = {"1","2","3"};

    public Hole(Flipper flipper){
        
        this.flipper = flipper;      

    }

    @Override
    public FlipperElement hit(FlipperElement element) {
        Util.printMessage("Hole: 1 or 2 or 3");
        Random rand = new Random();
        int answer = rand.nextInt(3);
        
        String input = this.flipper.performAction();
        
        if(input == answers[answer]){
            Util.printMessage("Correct!");
            return this;
        }
        Util.printMessage("Wrong!");
        return null;
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
