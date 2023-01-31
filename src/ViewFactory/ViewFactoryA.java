package ViewFactory;

public class ViewFactoryA implements AbstractViewFactoryI{

    @Override
    public void printBall1() {
      
        new Ball1A().printBall1();
    }

    @Override
    public void printBall2() {
        new Ball2A().printBall2();
    }

    @Override
    public void printBall3() {
        new Ball3A().printBall3();
        
    }

    @Override
    public void printBallExtra() {
        new BallExtraA().printBallExtra();
        
    }

    @Override
    public void printHighscore() {
        new HighscoreA().printHighscore();
        
    }

    @Override
    public void printRoundscore() {
        new RoundscoreA().printRoundscore();
        
    }

    
}
