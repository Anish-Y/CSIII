import mayflower.*;

public class Ninja extends AnimatedActor
{
    private Animation walk; 
    
    public Ninja() 
    {
        String[] frames = new String[10];
        for(int i = 0; i < 10; i++){
            frames[i] = "img/ninjagirl/Run__00"+(i)+".png";
            
        }
        walk = new Animation(60, frames, 100, 87, 50);
        SetAnimation(walk);
    }
    public void act()
    {
        super.act();
    }
}
