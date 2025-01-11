import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {        
        char playerInput;
        Scanner input = new Scanner(System.in);
        Collections.shuffle(Repository.questionList);
        int counter = 0;
        System.out.println("Bienvenido o bienvenida, para jugar, introduzca la letra a la izquierda de la pregunta.");                
        System.out.println("Introduzca su nombre de jugador");
        PlayerInfo.playerName = input.nextLine();
        System.out.println("Perfecto, "+PlayerInfo.playerName+". Empecemos con el juego...");
        do {
            System.out.println(Repository.questionList.get(counter).askPlayer());        
            System.out.println(Repository.questionList.get(counter).readAnswers());
            playerInput = input.next().charAt(0);
            System.out.println(Repository.questionList.get(counter).checkAnswer(playerInput));
            System.out.println(PlayerInfo.readScore());  
            counter++;
        } while (counter != Repository.questionList.size());

        System.out.println("Ha obtenido un total de "+PlayerInfo.score);
        if (PlayerInfo.score == Repository.questionList.size()) {
            System.out.println("Felicidades, "+PlayerInfo.playerName+", ha alcanzado la puntuación máxima");
        } else if (PlayerInfo.score == 0) {
            System.out.println("Vaya, definitivamente hoy no era su día, "+PlayerInfo.playerName);
        }
             
        input.close();
    }
}
