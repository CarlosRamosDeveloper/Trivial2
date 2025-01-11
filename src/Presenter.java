public class Presenter {
    public Presenter(){}

    public void presentersSalute(){
        System.out.println("Bienvenido o bienvenida, para jugar, introduzca la letra a la izquierda de la pregunta.");                
    }

    public void presenterAsksName(){
        System.out.println("Introduzca su nombre de jugador");
    }

    public void presenterStartsGame(){
        System.out.println(
            "Perfecto, "+PlayerInfo.playerName+". Empecemos con el juego...\n"+
            "Recuerde que para responder a las preguntas, tiene que seleccionar la respuesta con una letra de su teclado"
        );
    }

    public void presenteAsksPlayer(int counter){
        System.out.println(Repository.questionList.get(counter).askPlayer(counter));
    }

    public void presenterReadsAnswers(int counter){
        System.out.println(Repository.questionList.get(counter).readAnswers());
    }

    public void presenterChecksAnswers(int counter, char playerInput) {
        System.out.println(Repository.questionList.get(counter).checkAnswer(playerInput));
    }    

    public String presenterTellsScore(){
        String message = "Tu puntuación actual es de "+PlayerInfo.score+" punto";
        if (PlayerInfo.score != 1) {
            message +="s";
        }
        return message;
    }

    public void presenterEndsShow(){
        System.out.println("Ha obtenido un total de "+PlayerInfo.score);
        if (PlayerInfo.score == Repository.questionList.size()) {
            System.out.println("Felicidades, "+PlayerInfo.playerName+", ha alcanzado la puntuación máxima");
        } else if (PlayerInfo.score == 0) {
            System.out.println("Vaya, definitivamente hoy no era su día, "+PlayerInfo.playerName);
        }
    }
}
