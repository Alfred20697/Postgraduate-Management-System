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
public class Course {
    private String ID;
    private String name;
    private String faculty;
    private int totalCreditHour;

    public Course(String ID, String name, String faculty, int totalCreditHour) {
        this.ID = ID;
        this.name = name;
        this.faculty = faculty;
        this.totalCreditHour = totalCreditHour;
    }

    public Course() {
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getTotalCreditHour() {
        return totalCreditHour;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setTotalCreditHour(int totalCreditHour) {
        this.totalCreditHour = totalCreditHour;
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
        final Course other = (Course) obj;
        if (this.totalCreditHour != other.totalCreditHour) {
            return false;
        }
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.faculty, other.faculty)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Course{" + "ID=" + ID + ", name=" + name + ", faculty=" + faculty + ", totalCreditHour=" + totalCreditHour + '}';
    }
    
    
}
