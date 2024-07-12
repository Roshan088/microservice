package com.Valliammai.creditcard.dto;

public class CreditCardReq {
    private String pan;
    private String first_name;
    private String last_name;
    private String card_number;
    private String expiry_date;
    private int sec_code;

    public CreditCardReq(String pan, String first_name, String last_name, String card_number, String expiry_date, int sec_code) {
        this.pan = pan;
        this.first_name = first_name;
        this.last_name = last_name;
        this.card_number = card_number;
        this.expiry_date = expiry_date;
        this.sec_code = sec_code;
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
