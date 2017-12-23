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
public class Feedback {
    String ID;
    String title;
    String content;

    public Feedback(String ID, String title, String content) {
        this.ID = ID;
        this.title = title;
        this.content = content;
    }

    public Feedback() {
    }

    public String getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
}
