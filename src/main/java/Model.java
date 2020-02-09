import java.util.ArrayList;
import java.util.Random;

public class Model {
    public static final int BOUND_MAX = 100;

    private int boundLow;
    private int boundHi;
    private int numberToGuess;
    private ArrayList<Integer> statistics;

    public Model(){
        boundHi = BOUND_MAX;
        statistics = new ArrayList<Integer>();
    }

    public int thinkOfANumber(){
        Random r = new Random();
        numberToGuess = r.nextInt(BOUND_MAX - 1) + 1;
        System.out.println(numberToGuess);
        return numberToGuess;
    }

    public boolean userMadeGuess(int supposedNumber){
        if (numberToGuess == supposedNumber)
            return true;
        if (numberToGuess > supposedNumber)
            boundLow = supposedNumber;
        else
            boundHi = supposedNumber;
        statistics.add(supposedNumber);
        return false;
    }

    public ArrayList<Integer> getStatistics(){
        return statistics;
    }
    public int getBoundLow(){return boundLow;}
    public int getBoundHi(){return boundHi;}
}