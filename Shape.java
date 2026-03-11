import java.util.ArrayList;

// Абстрактный класс 
abstract class Shape {
    public abstract double getVolume();
    
    public String toString() {
        return "объём: " + getVolume();
    }
}

// Абстрактный класс для радиуса 
abstract class SolidOfRevolution extends Shape {
    protected double radius;
    
    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
}

// Класс цилиндр
class Cylinder extends SolidOfRevolution {
    private double height;
    
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
    
    public String toString() {
        return "Цилиндр: Объём: " + getVolume();
    }
    
}

// Класс шар
class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(radius);
    }
    
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
    
    public String toString() {
        return "Шар: Объём: " + getVolume();
    }
}

// Класс пирамида
class Pyramid extends Shape {
    private double s;
    private double h;
    
    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }
    
    public double getVolume() {
        return (s * h) / 3.0;
    }
    
    public String toString() {
        return "Пирамида: Объём: " + getVolume();
    }
}

// Класс box
class Box extends Shape {
    private double maxVolume;
    private double currentVolume;
    private ArrayList<Shape> shapes;
    
    public Box(double maxVolume) {
        this.maxVolume = maxVolume;
        this.currentVolume = 0;
        this.shapes = new ArrayList<>();
    }
    
    public boolean add(Shape shape) {
        double shapeVolume = shape.getVolume();
        if (currentVolume + shapeVolume <= maxVolume) {
            shapes.add(shape);
            currentVolume += shapeVolume;
            return true;
        }
        return false;
    }
    
    public double getVolume() {
        return currentVolume;
    }
    
    public String toString() {
        return "Box: " + super.toString() + " (max: " + maxVolume + ")";
    }
}