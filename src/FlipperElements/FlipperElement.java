package FlipperElements;

import Flipper.Visitor;

public abstract class FlipperElement {
    int points;

    public FlipperElement() {
        
    }

    public abstract FlipperElement hit(FlipperElement element);

    public abstract int accept(Visitor v);

    public abstract int getPoints();
}
