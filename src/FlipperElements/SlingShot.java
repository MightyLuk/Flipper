package FlipperElements;

import Flipper.Util;
import Flipper.Visitor;

public class SlingShot extends FlipperElement{
    int points = 700;
    public SlingShot(){
             

    }

    @Override
    public FlipperElement hit(FlipperElement element) {  
        Util.printMessage("Slingshot!");
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
