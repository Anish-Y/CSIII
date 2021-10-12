import mayflower.*;
/**
 * Write a description of class GravityActor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GravityActor extends Actor
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class GravityActor
     */
    public GravityActor()
    {
        // initialise instance variables

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void act()
    {
        int x = getX();
        int y = getY();

        setLocation (x, y + 1);
        if(isBlocked()){
            setLocation (x, y - 1);
        }
    }
    
    public boolean isBlocked(){
        return isTouching(Block.class);
    }
    
    public boolean isFalling()
    {
        boolean ret;

        setLocation(getX(), getY() + 2);
        ret = isTouching(Block.class);
        
        setLocation(getX(), getY() - 2);
        return !ret;
    }
}
