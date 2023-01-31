package FlipperElements;
import Flipper.Util;
import Flipper.Visitor;
public class Bumper extends FlipperElement{
    int points = 100;
    int hits = 0;

    public Bumper(){
               

    }

    @Override
    public FlipperElement hit(FlipperElement element) {  
        Util.printMessage("Bumper!");
        this.hits++;
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
    public void reset(){
        hits = hits--;
    }
    
}
