
public class Application {
    public static void main (String[] args){

        FigureSquare triangleAreaTest = new FigureSquare(2.0, 3.0, 4.0, 5.0);
        triangleAreaTest.triangleArea();

        FigureSquare rectangleAreaTest = new FigureSquare(2.0, 3.0, 4.0, 5.0);
        rectangleAreaTest.rectangleArea();

        FigureSquare circleAreaTest = new FigureSquare(2.0, 3.0, 4.0, 5.0);
        circleAreaTest.circleArea();
    }
}
