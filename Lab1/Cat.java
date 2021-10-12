import mayflower.*;
/**
 * Write a description of class Actor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cat extends Actor
{
    public Cat(){
        setImage("img/cat/Idle (1).png");
    }
    public void act(){
        int x = getX();
        int y = getY();
        int w = getWidth();
        int h = getHeight();

        if (Mayflower.isKeyDown( Keyboard.KEY_RIGHT ) && x+1 < 800-w) {
            setLocation (x + 1, y);
        }else if (Mayflower.isKeyDown( Keyboard.KEY_LEFT )&& x-1 > 0) {
            setLocation (x - 1, y);
        }else if (Mayflower.isKeyDown( Keyboard.KEY_UP )&& y-1 > 0) {
            setLocation (x, y - 1);
        }else if (Mayflower.isKeyDown( Keyboard.KEY_DOWN )&& y+1 < 600-h) {
            setLocation (x, y + 1);
        }
    }
}
