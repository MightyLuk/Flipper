package ViewFactory;

import Flipper.Util;

public class BallExtraA implements BallExtraI {

    @Override
    public void printBallExtra() {
        Util.printMessage("""          
            ### ###  ##  ##   #### ##  ### ##     ##              ### ##     ##     ####     ####     
            ##  ##  ### ##   # ## ##   ##  ##     ##              ##  ##     ##     ##       ##      
            ##       ###       ##      ##  ##   ## ##             ##  ##   ## ##    ##       ##      
            ## ##     ###      ##      ## ##    ##  ##            ## ##    ##  ##   ##       ##      
            ##         ###     ##      ## ##    ## ###            ##  ##   ## ###   ##       ##      
            ##  ##  ##  ###    ##      ##  ##   ##  ##            ##  ##   ##  ##   ##  ##   ##  ##  
           ### ###  ##   ##   ####    #### ##  ###  ##           ### ##   ###  ##  ### ###  ### ###                                                                                                    
                    """);
        
    }
    
}
