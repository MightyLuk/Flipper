public class ReadyState implements FlipperStateI {
    private Flipper flipper;

    public ReadyState(Flipper flipper) {
        this.flipper = flipper;
    }
    @Override
    public void pressStart() {
        System.out.println("ReadyState");
        
    }
    
}
