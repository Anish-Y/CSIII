import mayflower.*;

public class MyMayflower extends Mayflower
{

    /**
     * Constructor for objects of class MyMayFlower
     */
    public MyMayflower()
    {
       super("Lab1", 800, 600);
    }
    
    public void init(){
        Mayflower.setFullScreen(false);
        World w = new MyWorld();
        Mayflower.setWorld(w);
    }
}
