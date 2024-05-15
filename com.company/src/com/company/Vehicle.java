
package com.company;


public class Vehicle {
    private int numOfWheels;
    String brand, model;
    double weight, length;
    
    Vehicle()
    {
        numOfWheels = 4;
        brand = "N/A";
        model = "N/A";
        weight= 4000;
        length = 10;
    }
    Vehicle(int numOfWheels, String _brand, String _model, double _weight, double _length)
    {
        numOfWheels = this.numOfWheels;
        brand = _brand;
        model = _model;
        weight= _weight;
        length = _length;
    }
}
