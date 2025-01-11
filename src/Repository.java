import java.util.ArrayList;
import java.util.List;

public class Repository{
    public static List<Question> questionList = new ArrayList<Question>();
    static Question question1 = new Question(
        1, 
        Category.VIDEOGAMES,
        "¿Cual es el videojuego mejor valorado de Metacritic?",
        "The Legend of Zelda, Ocarina of Time",
        "Final Fantasy VII",
        "Metal Gear Solid",
        "Fallout 4"
    );
    static Question question2 = new Question(
        2, 
        Category.ANATOMY, 
        "¿Cual de los siguientes músculos se encuentra en la pierna?", 
        "Recto Anterior", 
        "Braquial", 
        "Romboides", 
        "Esternocleidomastoideo"
    );
    static Question question3 = new Question(
        3, 
        Category.VIDEOGAMES, 
        "¿Que personaje de Overwatch recibió un cambio de nombre debido a problemas con Blizzard?", 
        "McCree", 
        "Tracer", 
        "Reinhardt", 
        "Mei"
    );
    static{
        questionList.add(question1);
        questionList.add(question2);
        questionList.add(question3);
    }
}

