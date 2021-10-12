import mayflower.*;
/**
 * Write a description of class Actor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Yarn extends Actor
{
    public Yarn(){
        setImage("img/yarn.png");
    }
    public void act(){
        if((isTouching(Cat.class))){
            Object a = getOneIntersectingObject(Cat.class);
            Cat c = (Cat) a;
            World w = getWorld(); 
            c.increaseScore( 1 );
            w.removeObject(this);
        }
    }
}
