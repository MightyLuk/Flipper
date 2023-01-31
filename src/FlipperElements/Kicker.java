package FlipperElements;

import Flipper.Util;
import Flipper.Visitor;

public class Kicker extends FlipperElement{
    int points = 300;
    public Kicker(){
              

    }

    @Override
    public FlipperElement hit(FlipperElement element) {  
        Util.printMessage("Kicker!");
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
