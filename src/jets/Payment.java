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
public class Payment {
    Invoice invoice;
    String paymentMethod;
    String recipientAccount;

    public Payment(Invoice invoice, String paymentMethod, String recipientAccount) {
        this.invoice = invoice;
        this.paymentMethod = paymentMethod;
        this.recipientAccount = recipientAccount;
    }

    public Payment() {
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getRecipientAccount() {
        return recipientAccount;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setRecipientAccount(String recipientAccount) {
        this.recipientAccount = recipientAccount;
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
        final Payment other = (Payment) obj;
        if (!Objects.equals(this.paymentMethod, other.paymentMethod)) {
            return false;
        }
        if (!Objects.equals(this.recipientAccount, other.recipientAccount)) {
            return false;
        }
        if (!Objects.equals(this.invoice, other.invoice)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Payment{" + "invoice=" + invoice + ", paymentMethod=" + paymentMethod + ", recipientAccount=" + recipientAccount + '}';
    }
    
    
}
