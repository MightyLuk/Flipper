package ViewFactory;

import Flipper.Util;

public class Ball3A implements Ball3I{

    @Override
    public void printBall3() {
        Util.printMessage("""
            ### ##     ##     ####     ####               ## ##   
            ##  ##     ##     ##       ##               ##   ##  
            ##  ##   ## ##    ##       ##                    ##  
            ## ##    ##  ##   ##       ##                  ###   
            ##  ##   ## ###   ##       ##                    ##  
            ##  ##   ##  ##   ##  ##   ##  ##           ##   ##  
            ### ##   ###  ##  ### ###  ### ###            ## ##                                                       
        """);
        
    }
    
}
