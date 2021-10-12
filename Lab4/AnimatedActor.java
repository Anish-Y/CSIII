import mayflower.*;

public class AnimatedActor extends Actor
{
    private Animation animation; 
    private Timer animationTimer;

    public AnimatedActor()
    {
        animationTimer = new Timer(100000000);
        animationTimer.set(60000000);

    }
    
    public void SetAnimation(Animation a){
        animation = a;
    }
    
    public void act()
    {
        if(animation != null && animationTimer.isDone() )
        {
            animationTimer.reset();
            MayflowerImage i = animation.getNextFrame();
            setImage(i);
        }
    }
}
