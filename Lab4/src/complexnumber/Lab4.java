/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package complexnumber;
import java.lang.Math;
/**
 *
 * @author epicb
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComparableComplex comp1 = new ComparableComplex(4.1 ,-1.2);
        ComparableComplex comp2 = new ComparableComplex(-2.4 ,3.7);
        ComparableComplex comp2 = new ComparableComplex(); // i dont undertstand how to initialize these 
    }
    
}

abstract class Complex implements ArithmeticOpe{
    private double real;
    private double img;
    
    protected Complex(double _real,double _img)
    {
        
    }
    public void setReal(double _real){
        real = _real;
    }
        public void setImg (double _img){
        img = _img;
    }
    public double getReal(){
        return real;
    }
    public double getImg(){
        return img;
    }
    
    @Override 
    public Object addition(Object comp){// i dont understand how im supposed to implement these
        
        
    }
    @Override
    public Object subtraction(Object comp){ // i dont understand how im supposed to implement these
        
    }
    
    public abstract double findLength();
}

class ComparableComplex extends Complex implements Comparable<ComparableComplex>{
    public ComparableComplex(double _real,double _img)
    {
        super(_real,_img);
    }
    @Override
    public String toString()
    {
        return "1.70 +2.50i"; // no idea
    }
    @Override
    public double findLength(){
        return Math.sqrt(Math.pow(getReal(), 2)+Math.pow(getImg(), 2));
    }
    @Override
    public int compareTo(ComparableComplex comp){
        if(this.findLength() > comp.findLength())
            return 1;
    }
    
}