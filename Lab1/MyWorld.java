import mayflower.*;
public class MyWorld extends World
{
    public MyWorld()
    {
        setBackground("img/bluebonnets.jpg");
        Cat a = new Cat();
        addObject(a, 400, 300);
        Dog b = new Dog();
        addObject(b, 200, 150);
        Yarn y1 = new Yarn();
        addObject(y1, 600, 150);
        Yarn y2 = new Yarn();
        addObject(y2, 200, 450);
        Yarn y3 = new Yarn();
        addObject(y3, 600, 450);
    }  
    public void act(){}
}