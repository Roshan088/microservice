package com.Valliammai.creditcard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CreditCard {
    @Id
    private String pan;
    private String first_name;
    private String last_name;
    private String card_number;
    private String expiry_date;
    private int sec_code;

    @Override
    public String toString() {
        return "CreditCard{" +
                "pan='" + pan + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", card_number='" + card_number + '\'' +
                ", expiry_date='" + expiry_date + '\'' +
                ", sec_code=" + sec_code +
                '}';
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }

    public int getSec_code() {
        return sec_code;
    }

    public void setSec_code(int sec_code) {
        this.sec_code = sec_code;
    }
}
