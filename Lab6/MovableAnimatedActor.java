import mayflower.*;

public class MovableAnimatedActor extends AnimatedActor {
    private Animation walkRight;
    private Animation walkLeft;
    private Animation idle;
    private Animation fallRight;
    private Animation fallLeft;
    private String currentAction;
    private String lastCurrentAction;
    
    private boolean left;

    public MovableAnimatedActor() {
        lastCurrentAction = "";
        currentAction = "";
        left = false;
    }

    public void act() {
        lastCurrentAction = currentAction;
        super.act();

        String newAction = null;
        if (currentAction == null) {
            newAction = "idle";
        }

        int x = getX();
        int y = getY();
        int w = getWidth();
        int h = getHeight();



        if (Mayflower.isKeyDown(Keyboard.KEY_RIGHT) && x + 1 < 800 - w) {
            setLocation(x + 1, y);
            newAction = "walkRight";
            left = false;
            if (isBlocked()) {
                setLocation(x - 1, y);
            }
        } else if (Mayflower.isKeyDown(Keyboard.KEY_LEFT) && x - 1 > 0) {
            setLocation(x - 1, y);
            newAction = "walkLeft";
            left = true;
            if (isBlocked()) {
                setLocation(x + 1, y);
            }
        } else if(!isFalling()){
            newAction = "idle";
        }

        if (currentAction.equals("walkLeft") && !lastCurrentAction.equals("walkLeft")) {
            setLocation(x - 10, y);
        }

        if (!currentAction.equals("walkLeft") && lastCurrentAction.equals("walkLeft")) {
            setLocation(x + 10, y);
        }
        
         if(isFalling()){
            if(left){newAction = "fallLeft";}
            else newAction = "fallRight";
   
        }

        if (newAction != null && !newAction.equals(currentAction)) {
            if (newAction.equals("idle")) {
                setAnimation(idle);
            } else if (newAction.equals("walkRight")) {
                setAnimation(walkRight);
            } else if (newAction.equals("walkLeft")) {
                setAnimation(walkLeft);
            }else if (newAction.equals("fallLeft")) {setAnimation(fallLeft);}
            else if (newAction.equals("fallRight")) {setAnimation(fallRight);}

            currentAction = newAction;
        }
    }

    public void setAnimation(Animation a) {
        super.SetAnimation(a);
    }

    public void setWalkRightAnimation(Animation ani) {
        walkRight = ani;
    }

    public void setIdleAnimation(Animation ani) {
        idle = ani;
    }

    public void setWalkLeftAnimation(Animation ani) {
        walkLeft = ani;
    }

    public void setFallRightAnimation(Animation ani) {
        fallRight = ani;
    }

    public void setFallLeftAnimation(Animation ani) {
        fallLeft = ani;
    }

    public String getCurrentAction() {
        return currentAction;
    }

    public boolean isCurrentAction(String a) {
        return currentAction == a;
    }

    public boolean wasCurrentAction(String a) {
        return lastCurrentAction == a;
    }

}