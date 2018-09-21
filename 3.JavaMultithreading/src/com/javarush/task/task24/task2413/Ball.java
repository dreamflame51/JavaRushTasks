package com.javarush.task.task24.task2413;

public class Ball extends BaseObject {
    private double speed;
    private double direction;
    private double dx;
    private double dy;
    private boolean isFrozen = true;



    public Ball(double x, double y, double radius) {
        super(x, y, radius);
    }

    public Ball(double x, double y, double speed, double direction) {
        super(x, y, 1);
        this.speed = speed;
        this.direction = direction;
        this.dx = dx;
        this.dy = dy;
    }

    public double getSpeed() {
        return this.speed;
    }

    public double getDirection() {
        return this.direction;
    }

    public double getDx() {
        return this.dx;
    }

    public double getDy() {
        return this.dy;
    }

    @Override
    void draw(Canvas canvas) {

    }

    @Override
    void move() {
        

    }
}
