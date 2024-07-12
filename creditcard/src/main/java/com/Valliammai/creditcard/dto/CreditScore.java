package com.Valliammai.creditcard.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CreditScore {
    @Id
    private String pan;
    private String first_name;
    private String last_name;
    private int score;

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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
