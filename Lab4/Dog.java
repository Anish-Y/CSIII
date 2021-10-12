import mayflower.*;

public class Dog extends AnimatedActor
{
    private Animation walk; 
    
    public Dog() 
    {
        String[] frames = new String[10];
        for(int i = 0; i < 10; i++){
            frames[i] = "img/dog/Walk ("+(i+1)+").png";
        }
        walk = new Animation(60, frames, 50,90, 1);
        SetAnimation(walk);
    }
    public void act()
    {
        super.act();
    }
}
