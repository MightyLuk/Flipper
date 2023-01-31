package ViewFactory;

import Flipper.Util;

public class Ball2B implements Ball2I{

    @Override
    public void printBall2() {
        Util.printMessage("""
            +-++-++-++-+ +-+
            |b||a||l||l| |2|
            +-++-++-++-+ +-+

        """);
        
    }
    
}
