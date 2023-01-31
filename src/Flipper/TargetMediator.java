package Flipper;

import java.util.ArrayList;
import FlipperElements.*;



public class TargetMediator implements TargetMediatorI{
    private ArrayList<Target> targets = new ArrayList<Target>();
    private Game game;
    private Rampe rampe;

    private boolean holeIsOpen = false;
    private boolean extraBallStatus = true;

    TargetMediator(Game game){
        this.game = game;
    }

    @Override
    public void registerTarget(Target target) {
        targets.add(target);
        game.removeElement(target);
        if (targets.size() == 5 && !holeIsOpen){
            openRampe();
        }
    }

    @Override
    public void resetTargets() {
        
        for (Target target : targets){
            
            game.addElement(target);
            //targets.remove(target);
        }
        targets = new ArrayList<Target>();
    }

    @Override
    public void closeRampe(Rampe rampe) {
        game.removeElement(rampe);
        resetTargets();
        rampe = null;
        this.holeIsOpen = false;
        
    }

    private void openRampe(){
        this.holeIsOpen = true;
        rampe = new Rampe(this, this.game);
        game.addElement(rampe);
    }

    @Override
    public void resetTargetMediator() {
        this.resetTargets();
        if(holeIsOpen){
            this.closeRampe(rampe);
        }
        
    }

    @Override
    public boolean getExtraBallStatus() {
        return extraBallStatus;
        
    }

    @Override
    public void setExtraBallFalse() {
        
        this.extraBallStatus = false;
    }

    
    
}
