/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jets;

/**
 *
 * @author alfre
 */
public class Admin extends User{

    public Admin(String ID, String password, String name, char gender, String race, String address, String contactNumber, String emailAddress) {
        super(ID, password, name, gender, race, address, contactNumber, emailAddress);
    }

    public Admin() {
    }
    
    public boolean createNewAccount(){
        return insertAllInfo();
    }
    
    public boolean insertAllInfo(){
        return true; //if successfully insert all
    }
    
    public void viewAllCourse(){
        
    }
    
    public boolean generateNotification(Notification notification){
        return true; //if succesfully created
    } 
    
    public boolean addInvoice(Student student){
        return true; //if success
    }
    
    public boolean generateReceipt(Student student){
        return true;
    }
    
    public boolean sendFeedbackToLecturer(Feedback feedback, Lecturer lecturer){
        return true;
    }
    
    public boolean generateExamResult(Student student){
        return true;
    }
    
    public boolean addCourse(Course course){
        return true;
    }
    
    public boolean editCourse(Course course){
        return true;
    }
    
    public boolean removeCourse(Course course){
        return true;
    }
    
    public boolean addSubject(Subject subject){
        return true;
    }
    
    public boolean editSubject(Subject subject){
        return true;
    }
    
    public boolean removeSubject(Subject subject){
        return true;
    }
}
