/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class Circle {

    public double radius;
    public double area;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }

    public double calculateArea() {
        return Math.round(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return "Circle:" + 
                "\nRadius=" + radius + 
                "\nArea=" + calculateArea();
    }
}
