/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author aksha
 */
public class Address {
    String _currentApt;
    String _currentStreet;
    String _currentCity;
    String _currentZip;
    String _permanentApt;
    String _permanentStreet;
    String _permanentCity;
    String _permanentZip;
    
    public Address(){
        this._currentApt = "";
        this._currentStreet= "";
        this._currentCity = "";
        this._currentZip = "";
        this._permanentApt = "";
        this._permanentStreet = "";
        this._permanentCity= "";
        this._permanentZip= "";
    }
    public String getCurrentApt() {
        return _currentApt;
    }

    public void setCurrentApt(String _currentApt) {
        this._currentApt = _currentApt;
    }

    public String getCurrentStreet() {
        return _currentStreet;
    }

    public void setCurrentStreet(String _currentStreet) {
        this._currentStreet = _currentStreet;
    }

    public String getCurrentCity() {
        return _currentCity;
    }

    public void setCurrentCity(String _currentCity) {
        this._currentCity = _currentCity;
    }

    public String getCurrentZip() {
        return _currentZip;
    }

    public void setCurrentZip(String _currentZip) {
        this._currentZip = _currentZip;
    }

    public String getPermanentApt() {
        return _permanentApt;
    }

    public void setPermanentApt(String _permanentApt) {
        this._permanentApt = _permanentApt;
    }

    public String getPermanentStreet() {
        return _permanentStreet;
    }

    public void setPermanentStreet(String _permanentStreet) {
        this._permanentStreet = _permanentStreet;
    }

    public String getPermanentCity() {
        return _permanentCity;
    }

    public void setPermanentCity(String _permanentCity) {
        this._permanentCity = _permanentCity;
    }

    public String getPermanentZip() {
        return _permanentZip;
    }

    public void setPermanentZip(String _permanentZip) {
        this._permanentZip = _permanentZip;
    }
    

    
}
