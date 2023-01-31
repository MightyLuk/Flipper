package ViewFactory;

import Flipper.Util;

public class HighscoreA implements HighscoreI {

    @Override
    public void printHighscore() {
        Util.printMessage("""
        ###  ##    ####    ## ##   ###  ##   ## ##    ## ##    ## ##   ### ##   ### ###  
        ##  ##     ##    ##   ##   ##  ##  ##   ##  ##   ##  ##   ##   ##  ##   ##  ##  
        ##  ##     ##    ##        ##  ##  ####     ##       ##   ##   ##  ##   ##      
        ## ###     ##    ##  ###   ## ###   #####   ##       ##   ##   ## ##    ## ##   
        ##  ##     ##    ##   ##   ##  ##      ###  ##       ##   ##   ## ##    ##      
        ##  ##     ##    ##   ##   ##  ##  ##   ##  ##   ##  ##   ##   ##  ##   ##  ##  
        ###  ##    ####    ## ##   ###  ##   ## ##    ## ##    ## ##   #### ##  ### ###  
                                                                                        
       """);
        
    }
    
}
