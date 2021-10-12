import mayflower.*;

public class Cat extends AnimatedActor
{
    private Animation walk; 
    
    public Cat() 
    {
        String[] frames = new String[10];
        for(int i = 0; i < 10; i++){
            frames[i] = "img/cat/Walk ("+(i+1)+").png";
        }
        walk = new Animation(60, frames, 100, 100, 50);
        SetAnimation(walk);
    }
    public void act()
    {
        super.act();
    }
}
