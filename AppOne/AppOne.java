package com.appone;

public class AppOne {
    private String message;
    private int numberOne;
    private int numberTwo;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public void getMessage() {
        System.out.println("The app is starting: " + message);
    }

    public int calculateSum() {
        return numberOne + numberTwo;
    }
}
