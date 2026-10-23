import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jogador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jogador extends Actor
{
    /**
     * Act - do whatever the Jogador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mover();
        atirar();
    }
    
    public void atirar(){
        if (Greenfoot.isKeyDown("space")){getWorld().addObject(new Tiro(), getX(),getY() - 20);
        Greenfoot.delay(8);}
        
    
    }
    
    public void mover(){
    
        if (Greenfoot.isKeyDown("right")){setLocation(getX() + 3, getY());setRotation(270);}
        if (Greenfoot.isKeyDown("left")){setLocation(getX() - 3, getY());setRotation(270);}
    }
    
    public void pegarMoeda(){
        Actor moeda = getOneIntersectingObject(Moeda.class);
        if (moeda != null)
        {
            getWorld().removeObject(moeda);

        }
    }
}
