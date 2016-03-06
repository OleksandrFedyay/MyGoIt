/**
 * Created by FedYAY on 06.03.2016.
 */
public class Application {
    public static void main (String[] args){

        FigureSquare triangleAreaTest = new FigureSquare();
        triangleAreaTest.triangleArea(2.0, 3.0, 4.0);

        FigureSquare rectangleAreaTest = new FigureSquare();
        rectangleAreaTest.rectangleArea(4.0, 6.0);

        FigureSquare circleAreaTest = new FigureSquare();
        circleAreaTest.circleArea(5.0);
    }
}
