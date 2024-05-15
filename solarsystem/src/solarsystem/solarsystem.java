

package solarsystem;

import java.util.ArrayList;


public class solarsystem {

    
    public static void main(String[] args) {
        try{
       Star sun = new Star("Sun", 5778);
       
       Planet mercury = new Planet("Mercury", sun);
       sun.add(mercury);
       
       Planet venus = new Planet("Venus", sun);
       sun.add(venus);
       
       Planet earth = new Planet("Earth", sun);
       sun.add(earth);
       Moon moon = new Moon("Moon", earth);
       earth.add(moon);
       
       Planet mars = new Planet("Mars", sun);
       sun.add(mars);
       Moon phobos = new Moon("Phobos", mars);
       mars.add(phobos);
       Moon deimos = new Moon("Deimos", mars);
       mars.add(deimos);
       
       Planet jupiter = new Planet("Jupiter", sun);
       sun.add(jupiter);
       
       Planet saturn = new Planet("Saturn", sun);
       sun.add(saturn);
       
       Planet uranus = new Planet("Uranus", sun);
       sun.add(uranus);
       
       Planet neptune = new Planet("Neptune", sun);
       sun.add(neptune);
       
       

        }
        catch(InvalidCelestialBodyException ex){
            System.out.println(ex.getMessage());
        }
        catch(DuplicateCelestialBodyException ex){
            System.out.println(ex.getMessage());
        }
    }
  
}

class CelestialBody
{
    private String name;
    private String type;
    private ArrayList<CelestialBody> children = new ArrayList<CelestialBody>();
    
    CelestialBody(String name, String type)
    {
        this.name = name;
        this.type = type;
    }
    
    public String getName()
    {
        return name;
    }
    public String getType()
    {
        return type;
    }
    
    public void add(CelestialBody _child) throws DuplicateCelestialBodyException
    {
        if(children.contains(_child))
            throw new DuplicateCelestialBodyException(_child.getName() + " is already in this collection");
        children.add(_child);
        System.out.println(_child.getName() + " was added to " + getName());
   
        
    }
    public ArrayList<CelestialBody> getChildren()
    {
        return children;
    }
}

class Star extends CelestialBody
{
    private int surfaceTemp;
    
    Star(String name, int surfaceTemp)
    {
        super(name, "Star");
        this.surfaceTemp = surfaceTemp;
    }
    
    public int getSurfaceTemp()
    {
        return surfaceTemp;
    }
}

interface IOrbit
{
    void getOrbit();
}

class Planet extends CelestialBody implements IOrbit
{
    private CelestialBody orbits;
    
    Planet(String name, CelestialBody orbits) throws InvalidCelestialBodyException
    {
        super(name, "Planet");
        if(orbits.getType() == "Star")
             this.orbits = orbits;
        else
            throw new InvalidCelestialBodyException("A planet must orbit a star");
        
    }
    
    @Override
    public void getOrbit()
    {
        System.out.println(getName() + "is orbiting the " + orbits.getType() + " " + orbits.getName());
    }
}

class Moon extends CelestialBody implements IOrbit
{
    private CelestialBody orbits; 
    
    Moon(String name, CelestialBody orbits) throws InvalidCelestialBodyException
    {
        super(name, "Moon");
        if(orbits.getType() == "Planet")
             this.orbits = orbits;
        else
            throw new InvalidCelestialBodyException("A moon must orbit a Planet");
        
    }
    
     @Override
    public void getOrbit()
    {
        System.out.println(getName() + "is orbiting the " + orbits.getType() + " " + orbits.getName());
    }
}
