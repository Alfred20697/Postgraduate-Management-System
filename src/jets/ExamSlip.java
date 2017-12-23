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
public class ExamSlip {
    String ID;
    String date;
    String time;
    int seat;
    String triID;
    public ExamSlip(String ID, String date, String time, int seat, String triID) {
        this.ID = ID;
        this.date = date;
        this.time = time;
        this.seat = seat;
        this.triID = triID;
    }
    
    public ExamSlip(String ID, String date, String time, int seat) {
        this.ID = ID;
        this.date = date;
        this.time = time;
        this.seat = seat;
    }

    public ExamSlip() {
    }

    public String getTriID() {
        return triID;
    }

    public String getID() {
        return ID;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
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
        final ExamSlip other = (ExamSlip) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.time, other.time)) {
            return false;
        }
        if (!Objects.equals(this.seat, other.seat)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExamSlip{" + "ID=" + ID + ", date=" + date + ", time=" + time + ", seat=" + seat + '}';
    }
    
    
}
