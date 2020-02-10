package com.example.fitnessapp.user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DietProcessRaw {
    private Date date;
    private float weight;
    private float abdominal;
    private float arm;
    private float bodyFat;

    public DietProcessRaw(Date date, float weight, float abdominal, float arm, float bodyFat) {
        this.date = date;
        this.weight = weight;
        this.abdominal = abdominal;
        this.arm = arm;
        this.bodyFat = bodyFat;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getAbdominal() {
        return abdominal;
    }

    public void setAbdominal(float abdominal) {
        this.abdominal = abdominal;
    }

    public float getArm() {
        return arm;
    }

    public void setArm(float arm) {
        this.arm = arm;
    }

    public float getBodyFat() {
        return bodyFat;
    }

    public void setBodyFat(float bodyFat) {
        this.bodyFat = bodyFat;
    }

    @Override
    public String toString() {
        return "DietProcessRaw{" +
                "date='" + date + '\'' +
                ", weight='" + weight + '\'' +
                ", abdominal='" + abdominal + '\'' +
                ", arm='" + arm + '\'' +
                ", bodyFat='" + bodyFat + '\'' +
                '}';
    }
}
