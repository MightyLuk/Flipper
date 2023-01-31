package Flipper;
import FlipperElements.FlipperElement;

public abstract class Command {
    public Game game;

    public Command(Game game){
        this.game = game;
    }

    public abstract FlipperElement execute(FlipperElement element);
    
}
