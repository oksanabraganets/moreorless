import java.util.Random;

public class Model {
    public static final int BOUND_MAX = 100;

    private int boundLow;
    private int boundHi;
    private int numberToGuess;

    public int thinkOfANumber(){
        Random r = new Random();
        numberToGuess = r.nextInt(BOUND_MAX - 1) + 1;
        return numberToGuess;
    }

}