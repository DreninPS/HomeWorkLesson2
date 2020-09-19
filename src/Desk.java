import java.util.Arrays;

public class Desk {
    private Shape [] shapes = new Shape[4];

    public Desk() {
    }

    public boolean addShape (Shape shape, int i){
                if (i<4 && i>=0) {
                    shapes[i] = shape;
                    return true;
                }
        return false;
    }

    public boolean removeShape (Shape shape, int i){
                if (i<4 && i>=0) {
                    shapes[i] = null;
                    return true;
                }
        return false;
    }

    public double sumAreaOfDesk (){
        double s = 0;
        for (int i = 0; i <4 ; i++) {
            if(shapes[i]!=null) s=s+shapes[i].getArea();
        }
        return s;
    }


    @Override
    public String toString() {
        return "Desk{" +
                "shapes=" + Arrays.toString(shapes) +
                '}';
    }
}

