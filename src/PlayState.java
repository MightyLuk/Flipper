public class PlayState implements FlipperStateI{
    private Flipper flipper;

    public PlayState(Flipper flipper) {
        this.flipper = flipper;
    }

    @Override
    public void pressStart() {
        System.out.println("PlayState");//test
        System.out.println("Vladimir und Lukas");
    }
    
}
