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
    String currentApt;
    String currentStreet;
    String currentCity;
    String currentZip;
    String permanentApt;
    String permanentStreet;
    String permanentCity;
    String permanentZip;
    
    public Person(){
        this.studentNUID = "";
        this.firstName= "";
        this.lastName = "";
        this.collegeName = "";
        this.officeNumber= "";
        this.officeEmail= "";
        this.personalNumber= "";
        this.personalEmail="";
        this.currentApt = "";
        this.currentStreet= "";
        this.currentCity = "";
        this.currentZip = "";
        this.permanentApt = "";
        this.permanentStreet = "";
        this.permanentCity= "";
        this.permanentZip= "";
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

    public String getCurrentApt() {
        return currentApt;
    }

    public void setCurrentApt(String currentApt) {
        this.currentApt = currentApt;
    }

    public String getCurrentStreet() {
        return currentStreet;
    }

    public void setCurrentStreet(String currentStreet) {
        this.currentStreet = currentStreet;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public String getCurrentZip() {
        return currentZip;
    }

    public void setCurrentZip(String currentZip) {
        this.currentZip = currentZip;
    }

    public String getPermanentApt() {
        return permanentApt;
    }

    public void setPermanentApt(String permanentApt) {
        this.permanentApt = permanentApt;
    }

    public String getPermanentStreet() {
        return permanentStreet;
    }

    public void setPermanentStreet(String permanentStreet) {
        this.permanentStreet = permanentStreet;
    }

    public String getPermanentCity() {
        return permanentCity;
    }

    public void setPermanentCity(String permanentCity) {
        this.permanentCity = permanentCity;
    }

    public String getPermanentZip() {
        return permanentZip;
    }

    public void setPermanentZip(String permanentZip) {
        this.permanentZip = permanentZip;
    }
    
}
