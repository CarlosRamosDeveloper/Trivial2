import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {        
        char playerInput;
        Scanner input = new Scanner(System.in);
        Collections.shuffle(Repository.questionList);
        System.out.println("Bienvenido o bienvenida, para jugar, introduzca la letra a la izquierda de la pregunta.");                
        System.out.println("Introduzca su nombre de jugador");
        PlayerInfo.playerName = input.nextLine();
        System.out.println("Perfecto, "+PlayerInfo.playerName+". Empecemos con el juego...");
        System.out.println(Repository.questionList.get(0).askPlayer());        
        System.out.println(Repository.questionList.get(0).readAnswers());
        playerInput = input.next().charAt(0);
        System.out.println(Repository.questionList.get(0).checkAnswer(playerInput));
        System.out.println(PlayerInfo.readScore());        
        input.close();
    }
}
