import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model,View view){
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);
        model.thinkOfANumber();
        int supposed = inputValueInRange(sc);
        while ( !model.userMadeGuess(supposed))
            supposed = inputValueInRange(sc);

        view.printStatistics(model.getStatistics());
        view.printMessage(view.CONGRATULATIONS);

    }

    public int inputValueInRange(Scanner sc){
        view.printMessageInRange(model.getBoundLow(),model.getBoundHi());
        int supposed = inputIntValueWithScanner(sc);
        while ((supposed<=model.getBoundLow())||(supposed>=model.getBoundHi())) {
            view.printMessageInRange(model.getBoundLow(),model.getBoundHi());
            supposed = inputIntValueWithScanner(sc);
        }
        return supposed;
    }

    public int inputIntValueWithScanner(Scanner sc) {
        while (!sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }
}
