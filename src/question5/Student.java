/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class Student extends Person {

    private String grade;
    private final static String CLASS_STATUS = "Graduate";

    public Student(String grade, String name, String address,
            String email, String phoneNumber) {
        super(name, address, email, phoneNumber);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "\nStudent:" + "\nName:" + super.getName();
    }

}
