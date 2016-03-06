
public class Distance {

    public void distance (double x1, double y1, double x2, double y2){

       double distance = Math.sqrt ( Math.pow ( ( x2 -  x1 ),2 ) + Math.pow ( ( y2 - y1), 2));

        System.out. printf ("The distance between two points is %.2f", distance);

    }

}
