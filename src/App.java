import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        Collections.shuffle(Repository.questionList);
        System.out.println(Repository.questionList.get(0).askPlayer());
        System.out.println(Repository.questionList.get(0).readAnswers());
        System.out.println(Repository.questionList.get(0).checkAnswer('a'));
    }
}
