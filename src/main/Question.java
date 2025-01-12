package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question {
    private int id;
    private Category category;
    private String statement;
    private String correctAnswer;
    private final List<String> answers = new ArrayList<>();
   
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

    public List<String> getAnswers() {
        return answers;
    }

    public String readCategory() {
        return switch (category) {
            case VIDEOGAMES -> "Videojuegos";
            case ANATOMY -> "Anatomía";
            case GEOGRAPHY -> "Geografía";
            case CINEMA -> "Cine";
            case LITERATURE -> "Literatura";
        };
    }

    public String askPlayer(int counter){
        String message = "";
        int rng = (int)(Math.random() *100+1);
        if (counter == 0) {
            message += "Primera pregunta...\nDe ";
        } else if (counter+1 == Repository.questionList.size()){
            message += "Y por último...\n...\n¡Última pregunta! De ";
        } else if (rng <=20){
            message += "Pregunta de ";
        } else if (rng <= 40) {
            message += "Uff, esta la veo difícil... De ";
        } else if (rng <= 60) {
            message += "Siguiente pregunta... esta en concreto pertenece a ";
        } else if (rng <= 80) {
            message += "¡La tensión se nota en el ambiente, ¿no creen?! Siguiente pregunta, de ";
        } else {
            message += "¡Vamos con la siguiente pregunta! Pertenece a ";
        }
        message += "la categoría "+readCategory()+"...\n";
        message += this.statement + "\n";
        return message;
    }

    public String readAnswers() {
        Collections.shuffle(answers);
        String message = "Las respuestas son:\n";
        message += "a) "+answers.get(0)+"\n";
        message += "b) "+answers.get(1)+"\n";
        message += "c) "+answers.get(2)+"\n";
        message += "d) "+answers.get(3)+"\n";
        return message;
    }

    public int inputSwitcher(char input) {
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
        return index;
    }

    public char inputSwitcher(int input){
        char charIndex = 'a';
        switch(input) {
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
        return charIndex;
    }

    public boolean checkAnswer(char input){
        int index = inputSwitcher(input);

        return index == answers.indexOf(correctAnswer);
    }

}
