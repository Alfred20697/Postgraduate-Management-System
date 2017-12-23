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
public class Student extends User{
    private String accountNumber;

    public Student(String accountNumber, String ID, String password, String name, char gender, String race, String address, String contactNumber, String emailAddress) {
        super(ID, password, name, gender, race, address, contactNumber, emailAddress);
        this.accountNumber = accountNumber;
    }

    public Student(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean editInfo(){
        return true;
    }
    
    public boolean enrollCourse(Course course){
        return true;
    }
    
    public boolean enrollSubject(Subject subject){
        return true;
    }
    
    public boolean dropSubject(Subject subject){
        return true;
    }
    
    public boolean makePayment(Invoice invoice){
        return true;
    }
    
    public void viewPayment(Payment payment){
        
    }
    
    public void viewInvoice(Invoice invoice){
        
    }
    
    public void viewAllPayment(){
        
    }
    
    public void viewAllInvoice(){
        
    }
    
    public boolean updateProgressReport(ProgressReport progressReport){
        return true;
    }
    
    public boolean generateFeedback(Feedback feedback){
        return true;
    }
    
    public void viewExamResult(ExamResult examResult){

    }
    
    public void viewNotification(){
        
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
        final Student other = (Student) obj;
        if (!Objects.equals(this.accountNumber, other.accountNumber)) {
            return false;
        }
        return true;
    }

    
    
    
}
