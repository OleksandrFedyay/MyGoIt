
public class Application {

    public static void main (String[] args){

        Distance myDistance = new Distance();

        Point point1 = new Point (1.0, 1.0);

        Point point2 = new Point(2.0, 2.0);


        myDistance.distance(point1.getX(), point1.getY(), point2.getX(), point2.getY());
    }
}
