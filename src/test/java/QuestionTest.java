package test.java;

import main.Category;
import main.Question;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {
    Question question;

    @BeforeEach
    void setUp() {
        this.question = new Question(
                1, Category.ANATOMY,
                "Question",
                "Correct Answer",
                "Fail1",
                "Fail2",
                "Fail3"
        );
    }
    @AfterEach
    void tearDown() {
        System.out.println("Finished test");
    }

    @DisplayName("Test de intercambio de input")
    @Nested
    class TestInputSwitchers{
        @ParameterizedTest
        @CsvSource({"'a',0","'b',1","'c',2","'d',3","'e',0"})
        void TestInputFromCharToInt(char input, int expected){
            int switchedInput = question.inputSwitcher(input);
            assertEquals(expected, switchedInput);
        }

        @ParameterizedTest
        @CsvSource({"0,'a'","1,'b'","2,'c'","3,'d'","5,'a',"})
        void TestInputFromIntrToChar(int input, char expected){
            char switchedInput = question.inputSwitcher(input);
            assertEquals(expected, switchedInput);
        }
    }

    @DisplayName("Test de respuesta")
    @Nested
    class CheckAnswers{

        @Test
        void checkCorrectAnswer(){
            question.readAnswers();
            int input = question.getAnswers().indexOf(question.getCorrectAnswer());

            char charInput = question.inputSwitcher(input);
            boolean isCorrectAnswer = question.checkAnswer(charInput);

            assertTrue(isCorrectAnswer);
        }

        @Test
        void checkIncorrectAnswer(){
            question.readAnswers();
            int input = question.getAnswers().indexOf(question.getCorrectAnswer());

            if (input != 0) {
                input = 0;
            } else {
                input = 1;
            }
            char charInput = question.inputSwitcher(input);
            boolean isWrongAnswer = question.checkAnswer(charInput);

            assertFalse(isWrongAnswer);
        }
    }
}