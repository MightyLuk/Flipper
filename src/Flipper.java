public class Flipper {

    private FlipperStateI flipperState;

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
}
