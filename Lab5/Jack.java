import mayflower.*;

public class Jack extends AnimatedActor
{
    private Animation walk; 
    
    public Jack() 
    {
        String[] frames = new String[10];
        for(int i = 0; i < 10; i++){
            frames[i] = "img/Jack/Walk ("+(i+1)+").png";
        }
        walk = new Animation(60, frames, 100, 87, 50);
        SetAnimation(walk);
    }
    public void act()
    {
        super.act();
    }
}
