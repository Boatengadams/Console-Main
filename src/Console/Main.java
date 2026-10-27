package Console;

public class Main {
    static void main(String[] args) {
//        GamingConsole game= new MarioGame();
//        GamingConsole game1= new CheeseGame();
        GamingConsole[] games = {new MarioGame(), new CheeseGame()};

        for (GamingConsole game:games) {
            game.up();
            game.down();
            game.left();
            game.right();
        }
    }
}
