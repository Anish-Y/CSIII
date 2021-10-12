import mayflower.*;
/**
 * Write a description of class Actor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cat extends Actor
{
    private int score;
    private int lives;
    
    public Cat(){
        score = 0;
        lives = 3;
        setImage("img/cat.png");
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
        
        updateText();
    }
    
    public void increaseScore(int amount){
        score+=amount;
    }
    
    public int getScore(){
        return score;
    }
    
    public void reduceLife(){
        lives--;
        updateText();
        setLocation(400, 300);
         if(lives == 0) {
            World w = getWorld();
            w.removeObject(this);
        }
    }
    
    private void updateText(){
        World w = getWorld();
        w.removeText(10, 30);
        w.showText("Score: " + score + " Lives: " + lives, 10, 30, Color.BLACK);
    }
}
