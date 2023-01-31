package ViewFactory;

import Flipper.Util;

public class Ball3B implements Ball3I {

    @Override
    public void printBall3() {
        Util.printMessage("""
            +-++-++-++-+ +-+
            |b||a||l||l| |3|
            +-++-++-++-+ +-+

        """);
        
    }
    
}
