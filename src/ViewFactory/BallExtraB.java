package ViewFactory;

import Flipper.Util;

public class BallExtraB implements BallExtraI {

    @Override
    public void printBallExtra() {
        Util.printMessage("""
            +-++-++-++-++-+ +-++-++-++-+
            |e||x||t||r||a| |b||a||l||l|
            +-++-++-++-++-+ +-++-++-++-+

        """);
    }
    
}
