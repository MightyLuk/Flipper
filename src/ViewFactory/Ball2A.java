package ViewFactory;

import Flipper.Util;

public class Ball2A implements Ball2I{

    @Override
    public void printBall2() {
        Util.printMessage("""
            ### ##     ##     ####     ####              ## ##    
            ##  ##     ##     ##       ##               ##  ##   
            ##  ##   ## ##    ##       ##                   ##   
            ## ##    ##  ##   ##       ##                  ##    
            ##  ##   ## ###   ##       ##                 ##     
            ##  ##   ##  ##   ##  ##   ##  ##            #   ##  
            ### ##   ###  ##  ### ###  ### ###           ######   
                                                      

        """);
        
    }
    
}
