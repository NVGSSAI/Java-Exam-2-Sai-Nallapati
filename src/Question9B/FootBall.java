/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9B;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class FootBall implements Sports{
public static final String sportName="FootBall";
public static final int noOfPlayers=11;

    @Override
    public void sportName() {
    System.out.println("SportName: "+sportName);
    }

    @Override
    public void noOfPlayers() {
    System.out.println("No of players: "+noOfPlayers);
    }
    
}
