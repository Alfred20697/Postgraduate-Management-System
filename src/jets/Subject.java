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
public class Subject {
    private Course course;
    private String ID;
    private String name;
    private String description;
    private int creditHour;
    private double tuitionFee;

    public Subject(Course course, String ID, String name, String description, int creditHour, double tuitionFee) {
        this.course = course;
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.creditHour = creditHour;
        this.tuitionFee = tuitionFee;
    }

    public Course getCourse() {
        return course;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCreditHour() {
        return creditHour;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreditHour(int creditHour) {
        this.creditHour = creditHour;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
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
        final Subject other = (Subject) obj;
        if (this.creditHour != other.creditHour) {
            return false;
        }
        if (Double.doubleToLongBits(this.tuitionFee) != Double.doubleToLongBits(other.tuitionFee)) {
            return false;
        }
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.course, other.course)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "Subject{" + "course=" + course + ", ID=" + ID + ", name=" + name + ", description=" + description + ", creditHour=" + creditHour + ", tuitionFee=" + tuitionFee + '}';
    }
    
    
}
