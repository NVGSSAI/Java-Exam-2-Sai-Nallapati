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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Answer for question 4 example01: "
                + "Venkata Gopi Siva Sai Nallapati");
    Books b = new Books();
    Books b1 = new horrorBooks();//Polymorphism
    Books b2 = new Fantasy();//Polymorphism
    System.out.println(b);// Late binding Polymorphism
    System.out.println(b1);// Late binding Polymorphism
    System.out.println(b2);// Late binding Polymorphism
    b.author();
    b.noOfPages();
    b.price();
    b1.author();
    b1.noOfPages();
    b1.price();
    b2.author();
    b2.noOfPages();
    b2.price();
    }
    
}
