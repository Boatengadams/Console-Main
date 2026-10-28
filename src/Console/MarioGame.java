// Question: How can a Mario game map directional commands to game actions?
package Console;

public class MarioGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Goes into a whole");

    }

    @Override
    public void left() {

    }

    @Override
    public void right() {
        System.out.println("Goes forward");

    }
}
