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
public class Oneday  implements Cricket{

    @Override
    public void overs() {
    System.out.println("No of overs:50 overs per match");
    }

    @Override
    public void days() {
    System.out.println("No of Days: one Day");
    }

    @Override
    public void jersey() {
    System.out.println("Jersey color: Different for different countries");
    }
    
}
