/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.util.Scanner;

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
        System.out.println("Answer for question 6: "
                + "Venkata Gopi Siva Sai Nallapati");
        Scanner scan6=new Scanner(System.in);
        boolean flag = false;
        double s1=0,s2=0,s3=0;
        do{
            flag=false;
        System.out.print("Enter side1 of traingle: ");
        s1=scan6.nextDouble();
        System.out.print("Enter side2 of traingle: ");
        s2=scan6.nextDouble();
        System.out.print("Enter side3 of traingle: ");
        s3=scan6.nextDouble();
        if(s1+s2<=s3 || s2+s3<=s1 || s3+s1<=s2){
        System.out.println("The Sum of two sides must be greater than other side");
        flag = true;
        }
        }while(flag==true);
        
        Triangle t1=new Triangle(s1, s2, s3,"red", true);
        System.out.println(t1);
    }
    
}
