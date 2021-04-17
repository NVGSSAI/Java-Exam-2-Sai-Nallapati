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
public class Person {

    private String name;
    private String address;
    private String email;
    private String phoneNumber;

    public Person(String name, String address, String email, String phoneNumber)
    {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String   getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Person:" + "\nName:" + name;
    }

}
