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
public class ProgressReport {
    String ID;
    String date;
    String description;
    String stuID;
    String lecID;

    public ProgressReport(String ID, String date, String description) {
        this.ID = ID;
        this.date = date;
        this.description = description;
    }
    
     public ProgressReport(String ID, String date, String description, String stuID, String lecID) {
        this.ID = ID;
        this.date = date;
        this.description = description;
        this.stuID = stuID;
        this.lecID = lecID;
    }

    public ProgressReport() {
    }

    public String getID() {
        return ID;
    }

    public String getStuID() {
        return stuID;
    }

    public String getLecID() {
        return lecID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        final ProgressReport other = (ProgressReport) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProgressReport{" + "ID=" + ID + ", date=" + date + ", description=" + description + '}';
    }
    
    
}
