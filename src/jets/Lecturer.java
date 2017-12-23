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
public class Lecturer extends User{

    public Lecturer(String ID, String password, String name, char gender, String race, String address, String contactNumber, String emailAddress) {
        super(ID, password, name, gender, race, address, contactNumber, emailAddress);
    }

    public Lecturer() {
    }
    
    public boolean editInfo(){
        return true;
    }
    
    public void viewProgressReport(ProgressReport progressReport){
    
    }
    
    public void viewFeedback(Feedback feedback){
        
    }
}
