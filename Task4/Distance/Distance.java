import java.io.PrintStream;

public class Distance {

    double x1, x2, y1, y2;

    public PrintStream distance (double x1, double y1, double x2, double y2){

        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

        double distance = Math.sqrt ( Math.pow ( ( x2 -  x1 ),2 ) + Math.pow ( ( y2 - y1), 2));

        return System.out. printf ("The distance between two points is %.2f", distance);
    }
}
