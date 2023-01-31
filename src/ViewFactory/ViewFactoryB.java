package ViewFactory;

public class ViewFactoryB implements AbstractViewFactoryI{

    @Override
    public void printBall1() {
        
        new Ball1B().printBall1();
    }

    @Override
    public void printBall2() {
        new Ball2B().printBall2();
    }

    @Override
    public void printBall3() {
        new Ball3B().printBall3();
        
    }

    @Override
    public void printBallExtra() {
        new BallExtraB().printBallExtra();
        
    }

    @Override
    public void printHighscore() {
        new HighscoreB().printHighscore();
        
    }

    @Override
    public void printRoundscore() {
        new RoundscoreB().printRoundscore();
        
    }

    
    
}
