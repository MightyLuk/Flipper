
import FlipperElements.*;

public class Flipper {

    private static Flipper instance;
    private FlipperStateI flipperState;
    private int credits = 0;
    private Game game = new Game();

    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }
    private Flipper(){
        
        setFlipperState(new NoCreditState(this));
        //System.out.println(flipperState);

    }
    public void setFlipperState(FlipperStateI flipperState){
        this.flipperState = flipperState;
    }
    public void pressStart(){
       
        flipperState.pressStart();        
        
    }
    public void insertCoin(){
        this.credits++;
        if (this.credits == 1){
            setFlipperState(new ReadyState(this));
        }
    }
    public void showCredit() {
        System.out.println("Kredit: "+ credits + " Münzen!");
    }
    public void startGame(){
        System.out.println("Game running test");
        
        FlipperElement bumper1 = new Bumper();
        this.game.score = this.game.score + bumper1.hit();
        System.out.println("Score: " + game.score);
        if(credits == 0) {
            setFlipperState(new NoCreditState(this));
        } else {
            setFlipperState(new ReadyState(this));
        }
    }
    public static Flipper Instance(){
        if (instance == null){
            instance = new Flipper();
        }
        return instance;
    }
    
}
