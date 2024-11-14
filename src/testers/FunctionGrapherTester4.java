package testers;

public class FunctionGrapherTester4 extends FunctionGrapher {
    public Coordinate xyStart() {
        return new Coordinate(0, -20);
    }
    
    public double xRange() { return 20.0; }
    public double yRange() { return 40.0; };
    public double xIncrement() { return 0.1; }
    
    public double yValue(double xValue) { return xValue / Math.sin(xValue); }
}