import java.util.Scanner;

public class Point {

    double x, y;
    Scanner input = new Scanner(System.in);

    public Point (double x, double y){

        this.x = x;
        this.y = y;
    }

    public void setX(){

        System.out.println("Set point's X value: ");
        x = input.nextDouble();
    }

    public void setY(){

        System.out.println("Set point's Y value: ");
        y = input.nextDouble();
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}
