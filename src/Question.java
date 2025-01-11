import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question {
    private int id;
    private Category category;
    private String statement;
    private String correctAnswer;    
    private List<String> answers = new ArrayList<>();
   
    public Question(int id, Category category, String statement, String correctAnswer, 
        String wrongAnswer1, String wrongAnswer2, String wrongAnswer3) {
        this.id = id;
        this.category = category;
        this.statement = statement;
        this.correctAnswer = correctAnswer;
        this.answers.add(correctAnswer);
        this.answers.add(wrongAnswer1);
        this.answers.add(wrongAnswer2);
        this.answers.add(wrongAnswer3);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public String readCategory() {
        String questionCategory = "";
        switch(category){
            case Category.VIDEOGAMES:
            questionCategory = "Videojuegos";
            break;
            case Category.ANATOMY:
            questionCategory = "Anatomía";
            break;
            default:
            questionCategory = "error";
        }
        
        return questionCategory;
    }

    public String askPlayer(){
        String message = "Pregunta de la categoría "+readCategory()+"...\n";
        message += this.statement + "\n";
        return message;
    }

    public String readAnswers() {
        Collections.shuffle(answers);
        String message = "Las respuestas son:\n";
        message += "a) "+ answers.get(0)+"\n";
        message += "b) "+answers.get(1)+"\n";
        message += "c) "+answers.get(2)+"\n";
        message += "d) "+answers.get(3)+"\n";
        return message;
    }



    public String checkAnswer(char input){
        int index;        
        switch(input) {
            case 'a':
            index = 0;
            break;
            case 'b':
            index = 1;
            break;
            case 'c':
            index = 2;
            break;
            case 'd':
            index = 3;
            break;
            default:
            index = 0;
        }

        if (index == answers.indexOf(correctAnswer)) {
            PlayerInfo.score++;
            return "¡En efecto, la respuesta correcta es "+correctAnswer+"!\n";
        } 
        
        index = answers.indexOf(correctAnswer);
        char charIndex = 'a';
        switch(index) {
            case 0:
            charIndex = 'a';
            break;
            case 1:
            charIndex = 'b';
            break;
            case 2:
            charIndex = 'c';
            break;
            case 3:
            charIndex = 'd';
            break;
            default:
            charIndex = 'a';
        }
        
        return "¡Oh, eso es un error!\n¡La respuesta correcta era la "+charIndex+": "+correctAnswer+"!";
    }
}
