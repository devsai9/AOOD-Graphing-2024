package testers;

public class ParametricGrapherTester1 extends ParametricGrapher {
    public Coordinate xyStart() { return new Coordinate(-1, -1); }
    public double xRange() { return 2.0; }
    public double yRange() { return 2.0; } 
    
    public double tInterval() { return 0.05 * Math.PI; }
    public double tStart() { return Math.PI / 2.0; }
    public double tEnd() { return (3.0 / 2.0) * Math.PI; }
    
    public double xValue(double t) { return Math.cos(t); }
    
    public double yValue(double t) { return Math.sin(t); }
}