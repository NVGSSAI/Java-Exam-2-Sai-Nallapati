/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9A;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     System.out.println("Answer for Question-09 Example1:Venkata Gopi Siva Sai Nallapati");
     System.out.println("T20 cricket");
     T20 match1 = new T20();
     match1.overs();
     match1.days();
     match1.jersey();
     System.out.println("Test cricket");
     Test match2 = new Test();
     match2.overs();
     match2.days();
     match2.jersey();
     System.out.println("OneDay cricket");
     Oneday match3 = new Oneday();
     match3.overs();
     match3.days();
     match3.jersey();
    }
    
}
