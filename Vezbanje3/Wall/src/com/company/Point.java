package com.company;

public class Point {
    // Instance fields
    private int x, y;
    // No-arg constructor
    public Point() { }
    // Field-initializing constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Getters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    // Setters
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double distance() {
        return Math.sqrt(Math.pow(this.x,2)+(Math.pow(this.y,2)));
    }
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((x - this.x),2) + Math.pow((y - this.y),2));
    }
    public double distance(Point another) {
        return Math.sqrt(Math.pow((another.x - this.x),2) + Math.pow((another.y - this.y),2));
    }
}
