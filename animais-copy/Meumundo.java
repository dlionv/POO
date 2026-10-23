import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Meumundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meumundo extends World
{

    /**
     * Constructor for objects of class Meumundo.
     * 
     */
    
    private int pontos = 0;
    public Meumundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        

        
        addObject(new Jogador(),100 ,350);
        
        addObject(new Moeda(),200 ,100);
        addObject(new Moeda(),300 ,100);
        addObject(new Moeda(),500 ,100);
        showText("Pontos: "+ pontos,70,25);
    }
    public void marcarPonto(){
        pontos++;
        showText("Pontos: "+ pontos,70,25);
    }
}
