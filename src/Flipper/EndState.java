package Flipper;
public class EndState implements FlipperStateI{
    private Flipper flipper;

    public EndState(Flipper flipper) {
        this.flipper = flipper;
    }
    @Override
    public void pressStart() {
        Game game = Game.Instance();
        int highscore = game.highscore;
        int answerToEverything = highscore % 42;
        if(answerToEverything == 0){
            Util.printMessage("Richtig: Die Antwort auf die große Frage, nach dem Leben, dem Universum und allem, lautet: 42!");
            Util.printMessage("Sie haben ein extra Spiel gewonnen!");
            this.flipper.insertCoin();
        } else {
            Util.printMessage("Falsch: Die Antwort auf die große Frage, nach dem Leben, dem Universum und allem, lautet nicht: "+answerToEverything+"!");
            Util.printMessage("Spiel zu Ende!");
        }
        
    }
    
}
