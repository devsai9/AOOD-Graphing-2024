package testers;

public class DiscontinuousTester2 extends DiscontinuousFunctionGrapher {
    public Coordinate xyStart() { return new Coordinate(-3, -3); }
    public double xRange() { return 6.0; }
    public double yRange() { return 6.0; }
    public double xIncrement() { return 0.2; }
    
    public double yValue(double xValue) {
        return 1.0 / xValue;
    }
    
    public boolean exclude(double xValue) { return xValue == 0.0; }
}