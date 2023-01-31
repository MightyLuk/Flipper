package Flipper;

import FlipperElements.*;

interface TargetMediatorI {
    public void registerTarget(Target target);

    public void resetTargets();  

    public void closeRampe(Rampe rampe);

    public void resetTargetMediator();

    public boolean getExtraBallStatus();

    public void setExtraBallFalse();

}
