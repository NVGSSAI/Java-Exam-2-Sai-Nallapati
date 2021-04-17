/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question-01:Venkata Gopi Siva Sai Nallapati");
        System.out.print("Enter ten integers: ");
        Scanner scanint = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intList.add(scanint.nextInt());
        }
        System.out.print("The distinct integers are ");
        removeDuplicate(intList);
        for (Integer integer : intList){
        System.out.print(integer+" ");
        }  
    }
    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (Integer i:list) {   
        if (!temp.contains(i)) {
        temp.add(i);
        }
        }
        list.clear();
        list.addAll(temp);
}
}
       

    

