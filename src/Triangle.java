public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;


    public Triangle() {
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }


//    private double getLenght (Point a, Point b){
//        return Math.sqrt((b.getX()-a.getX())*(b.getX()-a.getX())+(b.getY()-a.getY())*(b.getY()-a.getY()));
//    }

    @Override
    double getPerimetr() {
        return this.getLenght(a,b)+this.getLenght(b,c)+this.getLenght(c,a);
    }

    @Override
    double getArea() {
        double p = this.getPerimetr()/2;
        return Math.sqrt(p*(p-getLenght(a,b))*(p-getLenght(b,c))*(p-getLenght(c,a)));
    }

    @Override
    public String toString() {
        return ("S triang = "+ getArea()+ " P triang = "+getPerimetr());
    }
}
