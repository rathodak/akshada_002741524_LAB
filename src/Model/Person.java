/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author aksha
 */
public class Person {
    String studentNUID;
    String firstName;
    String lastName;
    String collegeName;
    String officeNumber;
    String officeEmail;
    String personalNumber;
    String personalEmail;
    Address address;
    
    public Person(){
        this.studentNUID = "";
        this.firstName= "";
        this.lastName = "";
        this.collegeName = "";
        this.officeNumber= "";
        this.officeEmail= "";
        this.personalNumber= "";
        this.personalEmail="";
        this.address = new Address();
    }

    public String getStudentNUID() {
        return studentNUID;
    }

    public void setStudentNUID(String studentNUID) {
        this.studentNUID = studentNUID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getOfficeEmail() {
        return officeEmail;
    }

    public void setOfficeEmail(String officeEmail) {
        this.officeEmail = officeEmail;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
}
