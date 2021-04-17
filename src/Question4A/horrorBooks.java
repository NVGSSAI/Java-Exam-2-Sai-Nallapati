/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4A;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class horrorBooks extends Books{

    @Override
    public void price() {
    System.out.println("Horror book prices ranges from 1$-50$");
    }

    @Override
    public void author() {
    System.out.println("Clive Barker,Stephen King, Dean Koontz are some of the horrorbook writers");
    }

    @Override
    public void noOfPages() {
    System.out.println("20-1500 pages for horrorbooks");
    }

    @Override
    public String toString() {
        return "horrorBooks class";
    }
    
   
}
