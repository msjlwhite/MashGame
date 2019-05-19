// package com.company;

public class UserInput {

    // Abstract class?

    // private variable declaration
    private String spouse;
    private String career;
    private int income;
    private String city;
    private int numOfKids;
    private String carMake;
    private String carBodyStyle;

    public UserInput(String spouse, String career, int income, String city, int numOfKids, String carMake, String carBodyStyle) {
        this.spouse = spouse;
        this.career = career;
        this.income = income;
        this.city = city;
        this.numOfKids = numOfKids;
        this.carMake = carMake;
        this.carBodyStyle = carBodyStyle;
    }

    public String getSpouse() {
        return spouse;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumOfKids() {
        return numOfKids;
    }

    public void setNumOfKids(int numOfKids) {
        this.numOfKids = numOfKids;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarBodyStyle() {
        return carBodyStyle;
    }

    public void setCarBodyStyle(String carBodyStyle) {
        this.carBodyStyle = carBodyStyle;
    }


    public String displayInput() {
        return "\n" + getSpouse() + "\n" + getCareer() + "\n" + getIncome() + "\n" + getCity() + "\n" + getNumOfKids()
                + "\n" + getCarMake() + "\n" + getCarBodyStyle();
    }
}