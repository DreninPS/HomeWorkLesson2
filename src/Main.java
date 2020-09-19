public class Main {
    public static void main(String[] args) {

    Point pointA = new Point(0,0);
    Point pointB = new Point(0,4);
    Point pointC = new Point(3,0);

    Triangle triangle = new Triangle(pointA, pointB, pointC);
    Circle circle = new Circle(pointA, pointB);
    Desk desk = new Desk();

        System.out.println(triangle);
        System.out.println(circle);
    desk.addShape(triangle,0);
    desk.addShape(triangle,1);
    desk.addShape(triangle,2);
    desk.addShape(circle,3);
        System.out.println("Sum area shapes = "+desk.sumAreaOfDesk());
        System.out.println(desk);


    }
}
