import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {        
        Presenter presenter = new Presenter();
        char playerInput;
        Scanner input = new Scanner(System.in);
        Collections.shuffle(Repository.questionList);
        int counter = 0;
        presenter.presentersSalute();
        presenter.presenterAsksName();
        PlayerInfo.playerName = input.nextLine();
        presenter.presenterStartsGame();
        do {
            presenter.presenteAsksPlayer(counter);        
            presenter.presenterReadsAnswers(counter);
            playerInput = input.next().charAt(0);
            presenter.presenterChecksAnswers(counter, playerInput);
            presenter.presenterTellsScore();
            counter++;
        } while (counter != Repository.questionList.size());

        presenter.presenterEndsShow();             
        input.close();
    }
}
