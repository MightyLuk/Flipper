public class HitCommandBumper extends HitCommand{

    public HitCommandBumper(Game game) {
        super(game);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void execute() {
        game.score = game.score + 100;
        
    }
    
}
