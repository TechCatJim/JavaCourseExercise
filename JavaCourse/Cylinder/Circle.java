package Cylinder;

public class Circle {
    // write your code here
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return (this.radius < 0) ? 0 : this.radius;
    }

    public double getArea() {
        return Math.floor(getRadius() * getRadius() * (Math.PI));
    }

}
