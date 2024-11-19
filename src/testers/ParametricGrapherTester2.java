package testers;

public class ParametricGrapherTester2 extends ParametricGrapher {
    public Coordinate xyStart() { return new Coordinate(-5, -5); }
    public double xRange() { return 10.0; }
    public double yRange() { return 10.0; } 
    
    public double tInterval() { return 0.05 * Math.PI; }
    public double tStart() { return 0.0; }
    public double tEnd() { return 2 * Math.PI; }
    
    public double xValue(double t) { return 3 * Math.cos(t); }
    
    public double yValue(double t) { return 0.5 * Math.sin(t); }
}