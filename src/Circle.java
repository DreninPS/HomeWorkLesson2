public class Circle extends Shape {

    private Point a;
    private Point b;

    public Circle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Circle() {
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    @Override
    double getPerimetr() {
        return Math.PI*2*this.getLenght(a,b);
    }

    @Override
    double getArea() {
        return Math.PI*this.getLenght(a,b)*this.getLenght(a,b);
    }

    @Override
    public String toString() {
        return ("S circle = "+getArea()+" P circle = "+getPerimetr());
    }
}
