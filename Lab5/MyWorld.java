import mayflower.*;

public class MyWorld extends World {
    private Cat cat;
    private Dog dog;
    private Ninja ninja;
    private Jack jack;

    private String[][] tiles;

    public MyWorld() 
    {
        setBackground("img/BG/BG.png");
        tiles = new String[6][8];
        buildWorld();
        addRandomObjects();
        addMainCharacter();

        //cat = new Cat();
        //jack = new Jack();
        //ninja = new Ninja();
        //addObject(cat, 0, 100);

        //addObject(ninja, 300, 100);
        //addObject(jack, 300, 100);
    }

    public void buildWorld(){
        for(int i = 0; i < tiles.length; i++){
            for(int j = 0; j <tiles[0].length; j++){
                tiles[i][j] = "";
            }
        }
        for(int i = 0; i < tiles[5].length; i++){
            tiles[5][i] = "ground";
        }
        for(int i = 0; i < tiles.length; i++){
            for(int j = 0; j <tiles[0].length; j++){
                if(tiles[i][j].equals("ground")) addObject(new Block(),j*128,472);
            }
        }
    }

    public void addRandomObjects(){
        for(int r =0; r < tiles.length-1; r++){
            for(int c = 0; c < tiles[0].length; c++){
                if((int)(Math.random()*tiles[0].length) < 3){
                    tiles[r][c] = "yarn";
                    addObject(new Yarn(), c*100,r *100); 
                }   
            }
        }
    }

    public void addMainCharacter(){
        boolean added = false;
        while(!added){
            cat = new Cat();
            int row = (int) (Math.random()*tiles.length-1);
            int col = (int) (Math.random()*tiles[0].length);
            System.out.println("cat "+row + " " + col);
            if(tiles[row][col].equals("")){addObject(cat, col*100, row*100); added = true;}
        }

        added = false;
        while(!added){
            dog = new Dog();
            int row = (int) (Math.random()*tiles.length-1);
            int col = (int) (Math.random()*tiles[0].length);
            System.out.println("dog "+row + " " + col);
            if(tiles[row][col].equals("")){addObject(dog, col*100, row*100); added = true;}
        }

    }

    public void act()
    {
    }

}