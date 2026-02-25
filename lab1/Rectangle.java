public class Rectangle{
    public double wight = -1;
    public double height = -1;

    public Rectangle() {

    }
    public Rectangle (double _wight, double _height) {
        wight =  _wight;
        height =  _height;
    }

    public double getArea() {
        return wight * height;

    }

    public double getPerimetr() {
        return (wight + height) * 2;
    }

    public String toString() {
        return "" + height + ", " + wight + ", " +getArea() + ", " + getPerimetr();
    }
 }