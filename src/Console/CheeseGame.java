// Question: How can a game map directional console commands to actions?
package Console;

public class CheeseGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("move up");

    }

    @Override
    public void down() {
        System.out.println("move down");

    }

    @Override
    public void left() {
        System.out.println("moved left");


    }

    @Override
    public void right() {
        System.out.println("moved right");

    }
}
