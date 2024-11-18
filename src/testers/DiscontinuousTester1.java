package testers;

public class DiscontinuousTester1 extends DiscontinuousFunctionGrapher {
    public Coordinate xyStart() { return new Coordinate(0, 0); }
    public double xRange() { return 3.0; }
    public double yRange() { return 5.0; }
    public double xIncrement() { return 0.2; }
    
    public double yValue(double xValue) {
        return (Math.pow(xValue, 2) - 1) / (xValue - 1);
    }
    
    public boolean exclude(double xValue) { return xValue == 1.0; }
}