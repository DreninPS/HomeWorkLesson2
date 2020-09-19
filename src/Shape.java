public abstract class Shape {

    abstract double getPerimetr();
    abstract double getArea();

    double getLenght (Point a, Point b){
        return Math.sqrt((b.getX()-a.getX())*(b.getX()-a.getX())+(b.getY()-a.getY())*(b.getY()-a.getY()));
    }

    @Override
    public String toString() {
        return ("S = "+ getArea()+ " P = "+getPerimetr());
    }

}
