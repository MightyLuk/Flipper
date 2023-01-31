package ViewFactory;

import Flipper.Util;

public class Ball1A implements Ball1I{


    @Override
    public void printBall1() {
        Util.printMessage("""                                                     
        #####      ##     ##       ##                  ##    
        ##  ##    ####    ##       ##                 ###    
        #####    ##  ##   ##       ##                  ##    
        ##  ##   ##  ##   ##       ##                  ##    
        ##  ##   ######   ##       ##                  ##    
        #####    ##  ##   ######   ######            ######                                                          
       """);
        
    }
    
}
