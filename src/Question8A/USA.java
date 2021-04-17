/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8A;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class USA extends Country {

    @Override
    public void countryFlag() {
    System.out.println("American FLAG");
    }

    @Override
    public void language() {
    System.out.println("English");
    }

    @Override
    public void population() {
     System.out.println("USA population is 7 billion");
    }

    @Override
    public void continent() {
     System.out.println("USA is in NorthAmerican Continent");
    }
    
}
