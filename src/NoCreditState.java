public class NoCreditState implements FlipperStateI {
    private Flipper flipper;

    public NoCreditState(Flipper flipper) {
        this.flipper = flipper;
    }

    @Override
    public void pressStart() {        
        System.out.println("NoCreditState");//test
        System.out.println("Kein Kredit vorhanden!");        
    }
    
}
