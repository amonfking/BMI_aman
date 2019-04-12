package com.example.bmi_aman;

public class BMI {
    private float height, weight;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float calcBMI(){
        return this.getWeight() / (this.getHeight()*this.getHeight()/10000);
    }
}
