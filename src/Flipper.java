public class Flipper {

    private FlipperStateI flipperState;
    private int credits = 0;

    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }
    public Flipper(){
        
        setFlipperState(new NoCreditState(this));
        System.out.println(flipperState);

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
    
}
