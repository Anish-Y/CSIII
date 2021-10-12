import mayflower.*;


public class MyWorld extends World {

	private Cat cat;
	private Dog dog;
	private Ninja ninja;
	
    public MyWorld() 
    {
    	setBackground("img/BG/BG.png");
    	
    	cat = new Cat();
    	dog = new Dog();
    	ninja = new Ninja();
    	addObject(cat, 0, 100);
    	addObject(dog, 150, 100);
    	addObject(ninja, 300, 100);
    }
    
    public void act()
    {
    }
    
}