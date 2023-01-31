package ViewFactory;

import Flipper.Util;

public class Ball1B implements Ball1I{

    @Override
    public void printBall1() {
        Util.printMessage("""
            +-++-++-++-+ +-+
            |b||a||l||l| |1|
            +-++-++-++-+ +-+            
        """);
        
    }
    
}
