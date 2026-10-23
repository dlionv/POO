import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Moeda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moeda extends Actor
{
    /**
     * Act - do whatever the Moeda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int velocidade = 2;
    private int contador = 0;
    public void act()
    {
        mover();
    }
    
    public void mover(){
        setLocation(getX() + velocidade,getY());
        if(getX() >= 580|| getX() <= 20){
            velocidade = -velocidade;
            contador++;
        }
        
        if(contador >= 1){
            setLocation(getX(), getY() + 20);
            contador = 0;
        }
    
    }
}
