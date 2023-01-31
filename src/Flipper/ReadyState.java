package Flipper;
public class ReadyState implements FlipperStateI {
    private Flipper flipper;

    public ReadyState(Flipper flipper) {
        this.flipper = flipper;
    }
    @Override
    public void pressStart() {

        flipper.setFlipperState(new PlayState(flipper));
        flipper.setCredits(flipper.getCredits()-1);
        flipper.startGame();
        
    }
    
}
