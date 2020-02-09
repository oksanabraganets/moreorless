import java.util.ArrayList;

public class View {
    public static final String INPUT_INT_DATA = "Input INT value from %d to %d %n";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String CONGRATULATIONS = "Congratulations! You WIN!";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageInRange(int boundLow, int boundHi){
        System.out.printf(INPUT_INT_DATA, boundLow, boundHi);
    }

    public void printStatistics(ArrayList<Integer> statistics){
        for(int i=0; i<statistics.size(); i++)
            System.out.print(statistics.get(i) + " ");
    }
}
