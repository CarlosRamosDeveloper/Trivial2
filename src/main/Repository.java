package main;

import java.util.ArrayList;
import java.util.List;

public class Repository{
    public static List<Question> questionList = new ArrayList<Question>();
    /*
    static Question question = new Question(
        , 
        Category. ,
        ,
        ,
        ,
        ,        
    );
    */
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
    static Question question4 = new Question(
        4, 
        Category.GEOGRAPHY,
        "¿Donde está ubicado el estrecho de Bering?",
        "Entre Siberia y Alaska",
        "Entre Mexico y Estados Unidos de América",
        "Entre Argentina y las Maldivas",
        "Entre Francia e Italia"
    );
    static Question question5 = new Question(
        5, 
        Category.ANATOMY,
        "¿Cual es el hueso más pequeño del cuerpo humano?",
        "El estribo",
        "La falange del dedo pequeño del pié",
        "El cuboidal",
        "El carpo"        
    );
    static Question question6 = new Question(
        6, 
        Category.CINEMA ,
        "¿Quien es el director de Abierto hasta el amanecer?",
        "Robert Rodriguez",
        "Quentin Tarantino",
        "Benicio del Toro",
        "Alan Moore"        
    );
    static Question question7 = new Question(
        7, 
        Category.CINEMA ,
        "¿Quien interpreta a Mickey, el gitano, en Snatch, cerdos y diamantes?",
        "Brad Pitt",
        "Jason Statham",
        "Vinnie Jones",
        "Guy Ritchie"        
    );
    static Question question8 = new Question(
        8, 
        Category.GEOGRAPHY,
        "¿Donde está ubicada la fosa de las marianas",
        "En el océano pacífico",
        "En el océano índico",
        "En el oceano atlántico",        
        "En el mar mediterraneo"
    );
    static Question question9 = new Question(
        9, 
        Category.LITERATURE ,
        "¿Cual es la novela más larga de Howard Philips Lovecraft?",
        "El caso de Charles Dexter Ward",
        "La llamada de Cthulhu",
        "La sombra sobre Innsmouth",
        "Nyarlathotep"
    );
    static Question question10 = new Question(
        10, 
        Category.LITERATURE ,
        "¿Quien es el autor de El Rey de Amarillo?",
        "Robert William Chambers",
        "Alan Moore",
        "Howard Philips Lovecraft",
        "Robert Ervin Howard"        
    );
    static{
        questionList.add(question1);
        questionList.add(question2);
        questionList.add(question3);
        questionList.add(question4);
        questionList.add(question5);
        questionList.add(question6);
        questionList.add(question7);
        questionList.add(question8);
        questionList.add(question9);
        questionList.add(question10);
    }
}

