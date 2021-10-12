import mayflower.*;


public class MyWorld extends World {

    private Cat cat;

    
    public MyWorld() 
    {
        setBackground("img/BG/BG.png");
        
        cat = new Cat();
        addObject(cat, 400, 100);
        addObject(new Block(), 400, 500);
        addObject(new Block(), 528, 372);
        Mayflower.showBounds(true);

    }
    
    public void act()
    {
    }
    
}