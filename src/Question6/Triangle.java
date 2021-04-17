/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class Triangle extends GeometricObject {
    private double s1;
    private double s2;
    private double s3;

    public Triangle(double s1, double s2, double s3, String color, boolean isColorFilled) {
        super(color, isColorFilled);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    
    @Override
    public double calcArea() {
    double Ar=calcPerimeter()/2;
    return Math.round(Math.sqrt(Ar*(Ar-s1)*(Ar-s2)*(Ar-s3))*100)/100.0;
    }

    @Override
    public double calcPerimeter() {
    return Math.round(s1+s2+s3)*100/100.0;
    }

    @Override
    public String toString() {
        return "Area:"+calcArea()+"\nPerimeter:"+calcPerimeter()+"\nColor:"+super.getColor()+"\nisColorField:"+super.isIsColorFilled();
    }
   
}
