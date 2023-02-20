class Circle extends Shape implements AreaFormula {
    private final double radius;
    private static final double PI = 3.14;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getAreaFormula() {
        return Math.pow(radius, 2) * PI;
    }
}


class Quad extends Shape implements AreaFormula {
    private final double side;

    public Quad(String name, double side) {
        super(name);
        this.side = side;
    }

    public double getAreaFormula() {
        return side * side;
    }
}


class Rectangle extends Shape implements AreaFormula {
    private final double sideA;
    private final double sideB;

    public Rectangle(String name, double sideA, double sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getAreaFormula() {
        return sideA * sideB;
    }
}


class Rhombus extends Shape implements AreaFormula{
    private final double diameter1;
    private final double diameter2;
    public Rhombus(String name, double diameter1, double diameter2) {
        super(name);
        this.diameter1 = diameter1;
        this.diameter2 = diameter2;
    }

    public double getAreaFormula() {
        return 0.5 * diameter1 * diameter2;
    }
}


class Trapezium extends Shape implements AreaFormula {
    private final double sideA;
    private final double sideB;
    private final double height;

    public Trapezium(String name, double sideA, double sideB, double height) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    private double middleLine() {
        return (sideA + sideB) / 2;
    }

    public double getAreaFormula() {
        return middleLine() * height;
    }
}