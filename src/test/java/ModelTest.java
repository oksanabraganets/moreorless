import static org.junit.Assert.*;

public class ModelTest {

    @org.junit.Test
    public void thinkOfANumberTest() {
        Model model = new Model();
        for(int i=1;i<1000;i++){
            int number = model.thinkOfANumber();
            assertEquals(true, (number>0)&&(number<100));
        }
    }

    @org.junit.Test
    public void userMadeGuessTest(){
        Model model = new Model();
        int secretNumber = model.thinkOfANumber();
        assertEquals(true,model.userMadeGuess(secretNumber));
    }
}