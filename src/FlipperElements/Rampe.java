package FlipperElements;

import Flipper.Game;
import Flipper.TargetMediator;
import Flipper.Util;
import Flipper.Visitor;

public class Rampe extends FlipperElement{
    int points = 10000;
    TargetMediator mediator;
    Game game;
    public Rampe(TargetMediator mediator, Game game){
               this.mediator = mediator;
               this.game = game;

    }

    @Override
    public FlipperElement hit(FlipperElement element) {
        Util.printMessage("Rampe!");
        if(mediator.getExtraBallStatus()){
            game.addBall();
            mediator.setExtraBallFalse();
        }
        
        this.mediator.closeRampe(this);  
           
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
