public abstract class HitCommand {
    public Game game;

    public HitCommand(Game game){
        this.game = game;
    }

    public abstract void execute();
    
}
