
public class Application {

    public static void main (String[] args){

        Distance myDistance = new Distance();

        Point point1 = new Point (0.0, 0.0);

        Point point2 = new Point (0.0, 0.0);

        point1.setX();
        point1.setY();

        point2.setX();
        point2.setY();

        myDistance.distance(point1.getX(), point1.getY(), point2.getX(), point2.getY());
    }
}
