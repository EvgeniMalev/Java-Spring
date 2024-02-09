package com.shipapp;

public class Ship {
    private String name;
    private String originalName;
    private String port;
    private String depth;
    private String speed;
    private String power;

    public String getName() {
        return name;
    }

    public String getOriginalName() {
        return originalName;
    }

    public String getPort() {
        return port;
    }

    public String getDepth() {
        return depth;
    }

    public String getSpeed() {
        return speed;
    }

    public String getPower() {
        return power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void displayInfo() {
        System.out.println("Ship: " + name);
        System.out.println("Ship builded name: " + originalName);
        System.out.println("Port: " + port);
        System.out.println("Depth: " + depth);
        System.out.println("Speed: " + speed);
        System.out.println("Power: " + power);
    }
}
