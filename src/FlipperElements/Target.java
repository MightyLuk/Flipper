package FlipperElements;


import Flipper.TargetMediator;
import Flipper.Util;
import Flipper.Visitor;

public class Target extends FlipperElement{
    int points = 42;
    String name;
    boolean hit = false;
    TargetMediator mediator;

    public Target(String name, TargetMediator mediator){
           this.name = name; 
           this.mediator = mediator; 

    }

    @Override
    public FlipperElement hit(FlipperElement element) {  
        
            Util.printMessage("Target: " + this.name +"!");
            mediator.registerTarget(this);
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