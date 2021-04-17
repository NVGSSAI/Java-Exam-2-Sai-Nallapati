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
public class Fantasy extends Books{

    @Override
    public void price() {
    System.out.println("Fantasy book prices ranges from 5$-25$");
    }

    @Override
    public void author() {
    System.out.println("J.K. Rowling,Ronald Reuel Tolkien are some Fantasy book writers");
    }

    @Override
    public void noOfPages() {
    System.out.println("50-2100 pages for Fantacy books");
    }

    @Override
    public String toString() {
        return "Fantasy books class";
    }
  
}
