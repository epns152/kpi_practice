package practice.practice_4;

public class Circle {
    double radius, coorX, coorY;
    public Circle (double radius, double coorX, double coorY) {
        if (radius < 0) {
            throw new IllegalArgumentException("radius can't be negative");
        }
        this.radius = radius;
        this.coorX = coorX;
        this.coorY = coorY;
    }

    boolean haveSameArea (Circle c) {
        return radius == c.radius;
    }
}
