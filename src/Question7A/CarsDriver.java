/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7A;

import java.util.Scanner;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class CarsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for question 7 example1: Venkata Gopi Siva Sai Nallapati");
        Scanner sc = new Scanner(System.in);
        System.out.println("1.FORDFIESTA");
        System.out.println("2.KIARIO");
        System.out.println("3.CHEVISPARK");

        String carName = sc.next().toUpperCase();
        while (!carName.equals("FORDFIESTA")
                && !carName.equals("KIARIO")
                && !carName.equals("CHEVISPARK")) {
        System.out.println("Enter valid car name");
        System.out.println("1.FORDFIESTA");
        System.out.println("2.KIARIO");
        System.out.println("3.CHEVISPARK");
            carName = sc.next().toUpperCase();
        }

        System.out.println("The car price of " + carName + "is: " + 
                Cars.valueOf(carName).getPrice());
        
    }
}
