/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

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
        Person p1 = new Person("Sai", "Parkway", "sai@gmail.com", "67686");
        Employee e1 = new Employee("TCS", 32000, new Date(21, 12, 2), "Vihar",
                "Parkway", "sai@gmail.com", "67686");
        Faculty f1 = new Faculty(1.3, 8, "TCS", 2000, new Date(10, 2, 2), "CT",
                "way", "pizza@gmail.com", "8977");
        Staff s1 = new Staff("Manager", "Dell", 32000, new Date(15, 6, 2), "raj",
                "horizons", "raj@gmail.com", "90909");
        Student d2 = new Student("A", "Babu", "village", "stylish@gmail.com", "123789");
        
        System.out.println(p1);
        System.out.println(e1);
        System.out.println(f1);
        System.out.println(s1);
        System.out.println(d2);
    }

}
