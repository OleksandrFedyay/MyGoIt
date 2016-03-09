
public class Appllication {
    public static void main (String[] args){

        Area triangleAreaTest = new Area("Triangle", 0.0, 0.0, 0.0, 0.0);
        Area rectangleAreaTest = new Area ("Rectangle", 0.0, 0.0, 0.0, 0.0);
        Area circleAreaTest = new Area ("Circle", 0.0, 0.0, 0.0, 0.0);

        triangleAreaTest.displayMessage();
        triangleAreaTest.triangleArea();

        rectangleAreaTest.displayMessage();
        rectangleAreaTest.rectangleArea();

        circleAreaTest.displayMessage();
        circleAreaTest.circleArea();


    }

    }

