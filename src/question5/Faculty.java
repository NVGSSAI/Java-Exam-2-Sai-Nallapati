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
public class Faculty extends Employee {

    private double officeHours;
    private int noOfTeachingSubjects;

    public Faculty(double officeHours, int noOfTeachingSubjects, String office,
            double salary, Date dateHired, String name, String address,
            String email, String phoneNumber) {
        super(office, salary, dateHired, name, address, email, phoneNumber);
        this.officeHours = officeHours;
        this.noOfTeachingSubjects = noOfTeachingSubjects;
    }

    public double getOfficeHours() {
        return officeHours;
    }

    public int getNoOfTeachingSubjects() {
        return noOfTeachingSubjects;
    }

    @Override
    public String toString() {
        return "\nFaculty:" + "\nName:" + super.getName();
    }

}
