
package com.company;

class A
{
    int temp = 1;
    A()
    {
        System.out.println("Constructor A");
    }
    A(int i)
    {
        System.out.println("constructor A: "+ i);
    }
}
class B extends A
{
        int temp = 2;

    B()
    {
        System.out.println("Constructor B");
    }
    B(int i)
    {
        super(i); // calls parent specific constructor class
        System.out.println("constructor B: "+ i);

    }
}

public class ComCompany {

  public static void displayT(Vehicle v)
{
    System.out.println(v.brand);
}
    public static void main(String[] args) {
       B  b= new B(5) ;
       System.out.println (b.temp);
       
    }
    
}
