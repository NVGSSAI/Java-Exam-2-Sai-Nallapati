/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.ArrayList;
import java.util.Date;

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
        ArrayList<Object> list = new ArrayList<>();
        String name = "Sai Nallapati";
        Date birthDate = new Date();
        Loan loan = new Loan("Home Loan", 2000, 40);
        Circle circle = new Circle(5.5);

        list.add(name);
        list.add(birthDate);
        list.add(loan);
        list.add(circle);
        System.out.println("Answer for question 3: "
                + "Venkata Gopi Siva Sai Nallapati");
        for (Object object : list) {
            System.out.println(object);
            System.out.println("********************");
        }
    }
}
