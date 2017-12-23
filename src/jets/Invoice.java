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
public class Invoice {
    String ID;
    double amount;
    String date;
    String description;
    String paymentStatus;
    String stuID;

    public Invoice(String ID, double amount, String date, String description, String paymentStatus, String stuID) {
        this.ID = ID;
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.paymentStatus = paymentStatus;
        this.stuID = stuID;
    }

    public String getStuID() {
        return stuID;
    }

    public Invoice(String ID, double amount){
        this.ID = ID;
        this.amount = amount;
    }

    public Invoice() {
    }

    public String getID() {
        return ID;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
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
        final Invoice other = (Invoice) obj;
        if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
            return false;
        }
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.paymentStatus, other.paymentStatus)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Invoice{" + "ID=" + ID + ", amount=" + amount + ", date=" + date + ", description=" + description + ", paymentStatus=" + paymentStatus + '}';
    }
    
    
}
