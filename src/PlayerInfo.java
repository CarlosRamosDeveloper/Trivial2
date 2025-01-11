public class PlayerInfo {
    static String playerName;
    static int score = 0;

    static String readScore(){
        String message = "Tu puntuación actual es de "+score+" punto";
        if (score != 1) {
            message +="s";
        }
        return message;
    }
}
