package ViewFactory;

import Flipper.Util;

public class HighscoreB implements HighscoreI{

    @Override
    public void printHighscore() {
        Util.printMessage("""
            +-++-++-++-++-++-++-++-++-+
            |h||i||g||h||s||c||o||r||e|
            +-++-++-++-++-++-++-++-++-+

        """);
        
    }
    
}
