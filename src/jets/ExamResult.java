/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jets;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author alfre
 */
public class ExamResult {
    String ID;
    String grade;
    double cgpa;
    double gpa;
    int totalCreditHour;
    String subID;
    String stuID;
    String triID;
    Subject[] subject;

    public String getTriID() {
        return triID;
    }

    public ExamResult(String ID, String grade, double cgpa, double gpa, int totalCreditHour, String subID, String stuID) {
        this.ID = ID;
        this.grade = grade;
        this.cgpa = cgpa;
        this.gpa = gpa;
        this.totalCreditHour = totalCreditHour;
        this.subID = subID;
        this.stuID = stuID;
    }
    
    public ExamResult(String ID, String grade, double cgpa, double gpa, int totalCreditHour, String triID) {
        this.ID = ID;
        this.grade = grade;
        this.cgpa = cgpa;
        this.gpa = gpa;
        this.totalCreditHour = totalCreditHour;
        this.triID = triID;
    }
    
     public ExamResult(String ID, String grade, double gpa, int totalCreditHour) {
        this.ID = ID;
        this.grade = grade;
        this.gpa = gpa;
        this.totalCreditHour = totalCreditHour;
    }

    public ExamResult() {
    }

    public String getSubID() {
        return subID;
    }

    public String getStuID() {
        return stuID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getTotalCreditHour() {
        return totalCreditHour;
    }

    public void setTotalCreditHour(int totalCreditHour) {
        this.totalCreditHour = totalCreditHour;
    }

    public Subject[] getSubject() {
        return subject;
    }

    public void setSubject(Subject[] subject) {
        this.subject = subject;
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
        final ExamResult other = (ExamResult) obj;
        if (this.grade != other.grade) {
            return false;
        }
        if (Double.doubleToLongBits(this.cgpa) != Double.doubleToLongBits(other.cgpa)) {
            return false;
        }
        if (Double.doubleToLongBits(this.gpa) != Double.doubleToLongBits(other.gpa)) {
            return false;
        }
        if (this.totalCreditHour != other.totalCreditHour) {
            return false;
        }
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        if (!Arrays.deepEquals(this.subject, other.subject)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExamResult{" + "ID=" + ID + ", grade=" + grade + ", cgpa=" + cgpa + ", gpa=" + gpa + ", totalCreditHour=" + totalCreditHour + ", subject=" + subject + '}';
    }
    
    
}
