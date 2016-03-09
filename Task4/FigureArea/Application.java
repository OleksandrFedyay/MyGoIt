
public class Application {

    public static void main (String[] args){

        FigureSquare triangleAreaTest = new FigureSquare("Triangle", 0.0, 0.0, 0.0, 0.0);
        triangleAreaTest.displayMessage();
        triangleAreaTest.triangleArea();

        FigureSquare rectangleAreaTest = new FigureSquare("Rectangle", 0.0, 0.0, 0.0, 0.0);
        rectangleAreaTest.displayMessage();
        rectangleAreaTest.rectangleArea();

        FigureSquare circleAreaTest = new FigureSquare("Circle", 0.0, 0.0, 0.0, 0.0);
        circleAreaTest.displayMessage();
        circleAreaTest.circleArea();

    }
}
