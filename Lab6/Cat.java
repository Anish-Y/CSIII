import mayflower.*;

public class Cat extends MovableAnimatedActor
{

    
    public Cat() 
    {
        String[] frames = new String[10];
        for(int i = 0; i < 10; i++){
            frames[i] = "img/cat/Walk ("+(i+1)+").png";
        }
        for(int i = 0; i < 10; i++){
            frames[i] = "img/cat/Walk ("+(i+1)+").png";
        }
        Animation walkRight = new Animation(60, frames, 100, 87, 0);
        walkRight.setBounds(18, 5, 54, 80);
        
        Animation walkLeft = new Animation(60, frames, 100, 87, 0);
        walkLeft.mirrorHorizontally();
        walkLeft.setBounds(28, 5, 54, 80);
        
        for(int i = 0; i < 10; i++){
            frames[i] = "img/cat/Idle ("+(i+1)+").png";
        }
        Animation idle = new Animation(60, frames, 100, 87, 0);
        idle.setBounds(18,5,54,80);

        frames = new String[8];
        for(int i = 0; i < 8; i++){
            frames[i] = "img/cat/Fall ("+(i+1)+").png";
        }

        Animation fallRight = new Animation(60, frames, 100, 87, 0);
        fallRight.setBounds(18,5,54,80);
        
        Animation fallLeft = new Animation(60, frames, 100, 87, 0);
        fallLeft.mirrorHorizontally();
        fallLeft.setBounds(28,5,54,80);
        
        setWalkLeftAnimation(walkLeft);
        setWalkRightAnimation(walkRight);
        setFallLeftAnimation(fallLeft);
        setFallRightAnimation(fallRight);
        setIdleAnimation(idle);
        
        
    }
    public void act()
    {
        super.act();
    }
}
