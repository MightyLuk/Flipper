package ViewFactory;

import Flipper.Util;

public class RoundscoreB implements RoundscoreI {

    @Override
    public void printRoundscore() {
        Util.printMessage("""
        +-++-++-++-++-++-++-++-++-++-+
        |r||o||u||n||d||s||c||o||r||e|
        +-++-++-++-++-++-++-++-++-++-+
        """);
        
    }
    
}
