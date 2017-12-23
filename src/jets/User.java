/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jets;

import java.util.Objects;


/**
 *
 * @author alfre
 */
public class User {
    private String ID;
    private String password;
    private String name;
    private char gender;
    private String race;
    private String address;
    private String contactNumber;
    private String emailAddress;
    private String type;

    public User(String ID, String password, String name, char gender, String race, String address, String contactNumber, String emailAddress) {
        this.ID = ID;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.race = race;
        this.address = address;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
    }
    public User(String ID, String password,String type, String name)
    {
            this.ID = ID;
            this.password = password;
            this.type = type;
            this.name = name;
    }
     public User(String ID, String password,String type)
    {
            this.ID = ID;
            this.password = password;
            this.type = type;
    }
    
    

    public User() {
    }

    public String gettype(){
        return type;
    }
    
    public String getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public boolean login(String ID, String password){
        //check id and password with database
        return ((ID.equals(this.getID()))&&(password.equals(this.getPassword())));
        
    }
    
    public boolean resetPassword(String idOrEmail, String newPassword){
        //check if ID or email is correct, then allow set password
        this.setPassword(newPassword);
        return true; //if suceess, have to validate first
    }
    
    public void search(String keyword){
        //if keyword match anything, return result
        
    }
    
    public void viewCourse(Course course){
        //to be implemented
    }
    
    public void viewSubject(Subject subject){
        //to be implemented
    }
    
    public void viewAllSubject(){
        //to be implemented
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.gender != other.gender) {
            return false;
        }
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.race, other.race)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.contactNumber, other.contactNumber)) {
            return false;
        }
        if (!Objects.equals(this.emailAddress, other.emailAddress)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "ID=" + ID + ", password=" + password + ", name=" + name + ", gender=" + gender + ", race=" + race + ", address=" + address + ", contactNumber=" + contactNumber + ", emailAddress=" + emailAddress + '}';
    }

   
}
