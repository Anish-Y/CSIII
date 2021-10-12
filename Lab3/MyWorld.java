import mayflower.*;

public class MyWorld extends World
{
    // Constructor
    public MyWorld()
    {
        setBackground("img/BG/BG.png");

        Cat cat = new Cat();
        addObject(cat, 100, 100);
        Dog dog = new Dog();
        addObject(dog, 300, 100);
    }

    public void act()
    {
    }
}
