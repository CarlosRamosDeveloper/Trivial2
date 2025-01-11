public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Repository.questionList.get(2).askPlayer());
        System.out.println(Repository.questionList.get(2).readAnswers());
        System.out.println(Repository.questionList.get(2).checkAnswer('a'));
    }
}
