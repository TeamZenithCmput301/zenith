package com.example.zenith;

public abstract class Shape {
    private int x;
    private int y;
    private String color = "purple";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}