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
public abstract class GeometricObject {
private String color;
private boolean isColorFilled;

    public GeometricObject(String color, boolean isColorFilled) {
        this.color = color;
        this.isColorFilled = isColorFilled;
    }

    public String getColor() {
        return color;
    }

    public boolean isIsColorFilled() {
        return isColorFilled;
    }
    public abstract double calcArea();
    public abstract double calcPerimeter();
    
}
