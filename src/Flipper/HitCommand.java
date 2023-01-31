package Flipper;
import FlipperElements.FlipperElement;

public class HitCommand extends Command{

    public HitCommand(Game game) {
        super(game);
       
    }

    @Override
    public FlipperElement execute(FlipperElement element) {
        element = element.hit(element);
        return element;
        
    }
    
}
