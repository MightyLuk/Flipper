package Flipper;

import FlipperElements.Bottom;
import FlipperElements.Bumper;

import FlipperElements.Hole;
import FlipperElements.Kicker;
import FlipperElements.Rampe;
import FlipperElements.SlingShot;
import FlipperElements.Target;

public class Visitor implements VisitorI{

    @Override
    public int visit(Bottom bottom) {
        return bottom.getPoints();
        
    }

    @Override
    public int visit(Bumper bumper) {
        bumper.reset();
        return bumper.getPoints();
        
    }

    @Override
    public int visit(Hole hole) {
        return hole.getPoints();
        
    }

    @Override
    public int visit(Kicker kicker) {
        return kicker.getPoints();
        
    }

    @Override
    public int visit(Rampe rampe) {
        return rampe.getPoints();
        
    }

    @Override
    public int visit(SlingShot slingshot) {
        return slingshot.getPoints();
        
    }

    @Override
    public int visit(Target target) {
        return target.getPoints();
        
    }

    
    
}
