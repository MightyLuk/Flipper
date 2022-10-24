public class Main {
    public static void main(String[] args) {
        Flipper flipper = new Flipper();
        flipper.pressStart();
        flipper.setFlipperState(new PlayState(flipper));
        flipper.pressStart();
        
    }
}
