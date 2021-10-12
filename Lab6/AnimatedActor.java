import mayflower.*;

public class AnimatedActor extends GravityActor
{
    private Animation animation; 
    private Timer animationTimer;

    public AnimatedActor()
    {
        animationTimer = new Timer(1000);
        animationTimer.set(60000000);


    }
    
    public void SetAnimation(Animation a){
        animation = a;
    }
    
    public void act()
    {
        super.act();
        if(animation != null && animationTimer.isDone() )
        {
            animationTimer.reset();
            MayflowerImage i = animation.getNextFrame();
            setImage(i);
        }
    }
}
