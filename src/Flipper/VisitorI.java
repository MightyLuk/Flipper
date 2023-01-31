package Flipper;
import FlipperElements.*;

public interface VisitorI {
    public int visit(Bottom bottom);
    public int visit(Bumper bumper);
    public int visit(Hole hole);
    public int visit(Kicker kicker);
    public int visit(Rampe rampe);
    public int visit(SlingShot slingshot);
    public int visit(Target target);
}
