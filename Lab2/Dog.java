import mayflower.*;
/**
 * Write a description of class Actor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog extends Actor
{
    public Dog(){
        setImage("img/dog.png");
    }
    public void act(){
    if((isTouching(Cat.class))){
            Object a = getOneIntersectingObject(Cat.class);
            Cat c = (Cat) a;
            World w = getWorld(); 
            c.reduceLife( );
        }
    }
}
