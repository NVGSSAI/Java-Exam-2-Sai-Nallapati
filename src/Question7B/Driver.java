/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7B;

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
    System.out.println("Answer for question 7 example2: Venkata Gopi Siva Sai Nallapati");
    Calculation calc = Calculation.ADD;
    switch(calc){
        case ADD:
            System.out.println("Addition of numbers");
            break;
        case SUBTRACT:
            System.out.println("Substraction of numbers");
            break;
        case DIVIDE:
            System.out.println("Division of numbers");
            break;
        case MULTIPLY:
            System.out.println("Multiplication of numbers");
            break;
    }
    }
    
}
