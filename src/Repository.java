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
    
    static{
        questionList.add(question1);        
    }
}

