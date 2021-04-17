/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4B;

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
     System.out.println("Answer for question 4 example02: "
                + "Venkata Gopi Siva Sai Nallapati");
     CatFamily cf=new CatFamily();
     CatFamily cf1=new Puma();//polymorphism
     CatFamily cf2=new Tiger();//polymorphism
     System.out.println(cf1);//Late binding polymorphism
     System.out.println(cf2);//Late binding polymorphism
     cf1.catName();
     cf1.CatColor();
     cf2.catName();
     cf2.CatColor();
    }
    
}
